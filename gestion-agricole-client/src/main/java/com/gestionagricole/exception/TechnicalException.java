package com.gestionagricole.exception;

public class TechnicalException extends RuntimeException
{

	private static final long serialVersionUID = 1L;

	public static enum TECHNICAL_ERROR_CODE { INVALID_PARAMETER, GENERIC_ERROR};
	TECHNICAL_ERROR_CODE errorCode=null;
	
	public TechnicalException()
	{
		super();
		
	}

	public TechnicalException(TECHNICAL_ERROR_CODE errorCode, String message)
	{
		super(message);
		this.errorCode = errorCode;
	}
	
	public TechnicalException(String message, Throwable cause)
	{
		super(message, cause);
		
	}

	public TechnicalException(String message)
	{
		super(message);
		
	}

	public TechnicalException(Throwable cause)
	{
		super(cause);
		
	}

	public TECHNICAL_ERROR_CODE getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(TECHNICAL_ERROR_CODE errorCode) {
		this.errorCode = errorCode;
	}
	
}

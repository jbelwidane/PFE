package com.gestionagricole.exception;

@javax.ejb.ApplicationException(rollback=true)
public class ApplicationException extends Exception { 

	public static enum APPLICATION_ERROR_CODE { UNKNOWN_PROVINCE,
												DUPLICATE_PROVINCE_NAME,
												GENERIC_ERROR,
												PROVINCE_NOT_EMPTY,
												INVALID_PARAMETERS};
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private APPLICATION_ERROR_CODE errorCode = null;
	
	public ApplicationException(APPLICATION_ERROR_CODE errorCode, String message)
	{
		super(message);
		this.errorCode = errorCode;
	}

	public APPLICATION_ERROR_CODE getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(APPLICATION_ERROR_CODE errorCode) {
		this.errorCode = errorCode;
	}
	
	public ApplicationException() {
		
	}
	
//
//	public ApplicationException(String message) {
//		super(message);
//		
//	}
//
//	public ApplicationException(Throwable cause) {
//		super(cause);
//		
//	}
//
//	public ApplicationException(String message, Throwable cause) {
//		super(message, cause);
//		
//	}

}

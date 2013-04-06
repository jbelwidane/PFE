package com.gestionagricole.exception;

@javax.ejb.ApplicationException(rollback=true)
public class AccessControlException extends Exception { 

	public static enum ACCESSCONTROL_ERROR_CODE {PERMISSION_DENIED, AUTHENTICATION_ERROR, INTERNAL_ERROR};
	
	ACCESSCONTROL_ERROR_CODE errorCode = null;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccessControlException(ACCESSCONTROL_ERROR_CODE errorCode, String message)
	{
		super(message);
		this.errorCode = errorCode;
		
		// FIXME Call super(message) with i18n text.
	}

	public ACCESSCONTROL_ERROR_CODE getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ACCESSCONTROL_ERROR_CODE errorCode) {
		this.errorCode = errorCode;
	}
	
	public AccessControlException() {
		
	}
	
//
//	private AccessControlException(String message) {
//		super(message);
//	}
//
//	private AccessControlException(Throwable cause) {
//		super(cause);
//		
//	}
//
//	private AccessControlException(String message, Throwable cause) {
//		super(message, cause);
//		
//	}

}

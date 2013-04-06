package com.gestionagricole.dao.exception;

public class NullException extends DataException {

	private static final long serialVersionUID = 1L;

	public NullException() {
		
	}

	public NullException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public NullException(String message) {
		super(message);
		
	}

	public NullException(Throwable cause) {
		super(cause);
		
	}

}

package com.gestionagricole.dao.exception;

public class DuplicateEntityException extends DataException {


	private static final long serialVersionUID = 1L;

	public DuplicateEntityException() {
		
	}

	public DuplicateEntityException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public DuplicateEntityException(String message) {
		super(message);
		
	}

	public DuplicateEntityException(Throwable cause) {
		super(cause);
		
	}

}

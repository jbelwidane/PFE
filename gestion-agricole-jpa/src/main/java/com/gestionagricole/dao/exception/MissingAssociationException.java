package com.gestionagricole.dao.exception;

public class MissingAssociationException extends DataException {


	private static final long serialVersionUID = 1L;

	public MissingAssociationException() {
		
	}

	public MissingAssociationException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public MissingAssociationException(String message) {
		super(message);
		
	}

	public MissingAssociationException(Throwable cause) {
		super(cause);
		
	}

}

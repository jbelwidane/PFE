package com.gestionagricole.dao.exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
public class ValidationEntitiesException extends  DataException {
	
	private static final long serialVersionUID = 1L;

	public ValidationEntitiesException(String msg){
		super(msg);
	}

	public ValidationEntitiesException() {
		super();
	}

	public ValidationEntitiesException(String message, Throwable cause) {
		super(message, cause);
	}

	public ValidationEntitiesException(Throwable cause) {
		super(cause);
	}
	
	
	
}

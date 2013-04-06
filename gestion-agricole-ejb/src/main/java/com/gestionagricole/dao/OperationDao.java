package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.Operation;

@Local
public interface OperationDao {
	public Operation createOperation(Operation operation) throws Exception;

	public boolean deleteOperation(Operation operation);

	public Operation updateOperation(Operation operation);
}

package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.OperationType;

@Local
public interface OperationTypeDao
{
        public OperationType createOperationType(OperationType operationType) throws Exception;

        public boolean deleteOperationType(OperationType operationType);

        public OperationType updateOperationType(OperationType operationType);
}

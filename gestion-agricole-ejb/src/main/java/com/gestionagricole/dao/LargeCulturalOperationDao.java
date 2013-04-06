package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.LargeculturalOperation;

@Local
public interface LargeCulturalOperationDao
{
        public LargeculturalOperation createLargeCulturalOperation(LargeculturalOperation largeCulturalOperation) throws Exception;

        public boolean deleteLargeCulturalOperation(LargeculturalOperation largeCulturalOperation);

        public LargeculturalOperation updateLargeCulturalOperation(LargeculturalOperation largeCulturalOperation);
}

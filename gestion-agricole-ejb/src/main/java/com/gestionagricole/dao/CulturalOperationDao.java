package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.CulturalOperation;


@Local
public interface CulturalOperationDao
{
        public CulturalOperation createCulturalOperation(CulturalOperation culturalOperation) throws Exception;

        public boolean deleteCulturalOperation(CulturalOperation culturalOperation);

        public CulturalOperation updateCulturalOperation(CulturalOperation culturalOperation);
}


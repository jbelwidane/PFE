package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.CulturalType;

@Local
public interface CulturalTypeDao
{
        public CulturalType createCulturalType(CulturalType culturalType) throws Exception;

        public boolean deleteCulturalType(CulturalType culturalType);

        public CulturalType updateCulturalType(CulturalType culturalType);
}


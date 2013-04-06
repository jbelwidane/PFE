package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.CulturalMethode;

@Local
public interface CultureMethodeDao
{
        public CulturalMethode createCultureMethode(CulturalMethode cultureMethode) throws Exception;

        public boolean deleteCultureMethode(CulturalMethode cultureMethode);

        public CulturalMethode updateCultureMethode(CulturalMethode cultureMethode);
}

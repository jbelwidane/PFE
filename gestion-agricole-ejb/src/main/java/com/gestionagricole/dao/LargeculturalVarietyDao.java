package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.LargeculturalVariety;

@Local
public interface LargeculturalVarietyDao
{
        public LargeculturalVariety createLargeculturalVariety(LargeculturalVariety largeculturalVariety) throws Exception;

        public boolean deleteLargeculturalVariety(LargeculturalVariety largeculturalVariety);

        public LargeculturalVariety updateLargeculturalVariety(LargeculturalVariety largeculturalVariety);
}

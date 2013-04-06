package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.FarmUnit;

@Local
public interface FarmUnitDao
{
        public FarmUnit createFarmUnit(FarmUnit farmUnit) throws Exception;

        public boolean deleteFarmUnit(FarmUnit farmUnit);

        public FarmUnit updateFarmUnit(FarmUnit farmUnit);
}

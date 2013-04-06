package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.Climatology;

@Local
public interface ClimatologyDao
{
        public Climatology createClimatology(Climatology climatology) throws Exception;

        public boolean deleteClimatology(Climatology climatology);

        public Climatology updateClimatology(Climatology climatology);
}

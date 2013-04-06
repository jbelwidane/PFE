package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.ArboriculturalVariety;


@Local
public interface ArboriculturalVarietyDao
{
        public ArboriculturalVariety createArboriculturalVariety(ArboriculturalVariety arboriculturalVariety) throws Exception;

        public boolean deleteArboriculturalVariety(ArboriculturalVariety arboriculturalVariety);

        public ArboriculturalVariety updateArboriculturalVariety(ArboriculturalVariety arboriculturalVariety);
}

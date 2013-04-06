package com.gestionagricole.dao;

import javax.ejb.Local;

import com.gestionagricole.entity.ArboriculturalOperation;


@Local
public interface ArboriculturalOperationDao
{
        public ArboriculturalOperation createArboriculturalOperation(ArboriculturalOperation arboriculturalOperation) throws Exception;

        public boolean deleteArboriculturalOperation(ArboriculturalOperation arboriculturalOperation);

        public ArboriculturalOperation updateArboriculturalOperation(ArboriculturalOperation arboriculturalOperation);
}

package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.ArboriculturalOperationDao;
import com.gestionagricole.entity.ArboriculturalOperation;

@Stateless
public class ArboriculturalOperationDaoImpl implements ArboriculturalOperationDao
{

        private static final Logger logger = LoggerFactory.getLogger(ArboriculturalOperationDaoImpl.class);

        private EntityManager em;

        @PersistenceContext
        public void setEntityManager(EntityManager entityManager) {
              this.em = entityManager;
        }

        @Override
        public ArboriculturalOperation createArboriculturalOperation(ArboriculturalOperation arboriculturalOperation) throws Exception
        {
                em.persist(arboriculturalOperation);
                em.flush();
                em.refresh(arboriculturalOperation);
                return arboriculturalOperation;
        }

        @Override
        public boolean deleteArboriculturalOperation(ArboriculturalOperation arboriculturalOperation)
        {
                try {
                        em.remove(arboriculturalOperation);
                        return true;
                }
                catch (Exception ex)
                {
                        logger.error(ex.getMessage());
                        return false ;
                }
        }

        @Override
        public ArboriculturalOperation updateArboriculturalOperation(ArboriculturalOperation arboriculturalOperation)
        {
                em.merge(arboriculturalOperation);
                return arboriculturalOperation;
        }

}

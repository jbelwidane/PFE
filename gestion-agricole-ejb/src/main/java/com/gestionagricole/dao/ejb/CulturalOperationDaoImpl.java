package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.CulturalOperationDao;
import com.gestionagricole.entity.CulturalOperation;

@Stateless
public class CulturalOperationDaoImpl implements CulturalOperationDao
{

        private static final Logger logger = LoggerFactory.getLogger(CulturalOperationDaoImpl.class);

        private EntityManager em;

        @PersistenceContext
        public void setEntityManager(EntityManager entityManager) {
              this.em = entityManager;
        }

        @Override
        public CulturalOperation createCulturalOperation(CulturalOperation culturalOperation) throws Exception
        {
                em.persist(culturalOperation);
                em.flush();
                em.refresh(culturalOperation);
                return culturalOperation;
        }

        @Override
        public boolean deleteCulturalOperation(CulturalOperation culturalOperation)
        {
                try {
                        em.remove(culturalOperation);
                        return true;
                }
                catch (Exception ex)
                {
                        logger.error(ex.getMessage());
                        return false ;
                }
        }

        @Override
        public CulturalOperation updateCulturalOperation(CulturalOperation culturalOperation)
        {
                em.merge(culturalOperation);
                return culturalOperation;
        }

}

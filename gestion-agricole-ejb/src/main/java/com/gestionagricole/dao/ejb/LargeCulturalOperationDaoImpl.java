package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.LargeCulturalOperationDao;
import com.gestionagricole.entity.LargeculturalOperation;

@Stateless
public class LargeCulturalOperationDaoImpl implements LargeCulturalOperationDao
{

        private static final Logger logger = LoggerFactory.getLogger(LargeCulturalOperationDaoImpl.class);

        private EntityManager em;

        @PersistenceContext
        public void setEntityManager(EntityManager entityManager) {
              this.em = entityManager;
        }

        @Override
        public LargeculturalOperation createLargeCulturalOperation(LargeculturalOperation largeCulturalOperation) throws Exception
        {
                em.persist(largeCulturalOperation);
                em.flush();
                em.refresh(largeCulturalOperation);
                return largeCulturalOperation;
        }

        @Override
        public boolean deleteLargeCulturalOperation(LargeculturalOperation largeCulturalOperation)
        {
                try {
                        em.remove(largeCulturalOperation);
                        return true;
                }
                catch (Exception ex)
                {
                        logger.error(ex.getMessage());
                        return false ;
                }
        }

        @Override
        public LargeculturalOperation updateLargeCulturalOperation(LargeculturalOperation largeCulturalOperation)
        {
                em.merge(largeCulturalOperation);
                return largeCulturalOperation;
        }

}

package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.OperationTypeDao;
import com.gestionagricole.entity.OperationType;

@Stateless
public class OperationTypeDaoImpl implements OperationTypeDao
{

        private static final Logger logger = LoggerFactory.getLogger(OperationTypeDaoImpl.class);

        private EntityManager em;

        @PersistenceContext
        public void setEntityManager(EntityManager entityManager) {
              this.em = entityManager;
        }

        @Override
        public OperationType createOperationType(OperationType operationType) throws Exception
        {
                em.persist(operationType);
                em.flush();
                em.refresh(operationType);
                return operationType;
        }

        @Override
        public boolean deleteOperationType(OperationType operationType)
        {
                try {
                        em.remove(operationType);
                        return true;
                }
                catch (Exception ex)
                {
                        logger.error(ex.getMessage());
                        return false ;
                }
        }

        @Override
        public OperationType updateOperationType(OperationType operationType)
        {
                em.merge(operationType);
                return operationType;
        }

}

package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.OperationDao;
import com.gestionagricole.entity.Operation;

@Stateless
public class OperationDaoImpl implements OperationDao
{

        private static final Logger logger = LoggerFactory.getLogger(OperationDaoImpl.class);

        private EntityManager em;

        @PersistenceContext
        public void setEntityManager(EntityManager entityManager) {
              this.em = entityManager;
        }

        @Override
        public Operation createOperation(Operation operation) throws Exception
        {
                em.persist(operation);
                em.flush();
                em.refresh(operation);
                return operation;
        }

        @Override
        public boolean deleteOperation(Operation operation)
        {
                try {
                        em.remove(operation);
                        return true;
                }
                catch (Exception ex)
                {
                        logger.error(ex.getMessage());
                        return false ;
                }
        }

        @Override
        public Operation updateOperation(Operation operation)
        {
                em.merge(operation);
                return operation;
        }

}

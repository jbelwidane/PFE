package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.LargeculturalVarietyDao;
import com.gestionagricole.entity.LargeculturalVariety;

@Stateless
public class LargeculturalVarietyDaoImpl implements LargeculturalVarietyDao
{

        private static final Logger logger = LoggerFactory.getLogger(LargeculturalVarietyDaoImpl.class);

        private EntityManager em;

        @PersistenceContext
        public void setEntityManager(EntityManager entityManager) {
              this.em = entityManager;
        }

        @Override
        public LargeculturalVariety createLargeculturalVariety(LargeculturalVariety largeculturalVariety) throws Exception
        {
                em.persist(largeculturalVariety);
                em.flush();
                em.refresh(largeculturalVariety);
                return largeculturalVariety;
        }

        @Override
        public boolean deleteLargeculturalVariety(LargeculturalVariety largeculturalVariety)
        {
                try {
                        em.remove(largeculturalVariety);
                        return true;
                }
                catch (Exception ex)
                {
                        logger.error(ex.getMessage());
                        return false ;
                }
        }

        @Override
        public LargeculturalVariety updateLargeculturalVariety(LargeculturalVariety largeculturalVariety)
        {
                em.merge(largeculturalVariety);
                return largeculturalVariety;
        }

}
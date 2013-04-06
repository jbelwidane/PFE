package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.LargeCulturalPlanDao;
import com.gestionagricole.entity.LargeculturalPlan;

@Stateless
public class LargeCulturalPlanDaoImpl implements LargeCulturalPlanDao
{

        private static final Logger logger = LoggerFactory.getLogger(LargeCulturalPlanDaoImpl.class);

        private EntityManager em;

        @PersistenceContext
        public void setEntityManager(EntityManager entityManager) {
              this.em = entityManager;
        }

        @Override
        public LargeculturalPlan createLargeCulturalPlan(LargeculturalPlan largeCulturalPlan) throws Exception
        {
                em.persist(largeCulturalPlan);
                em.flush();
                em.refresh(largeCulturalPlan);
                return largeCulturalPlan;
        }

        @Override
        public boolean deleteLargeCulturalPlan(LargeculturalPlan largeCulturalPlan)
        {
                try {
                        em.remove(largeCulturalPlan);
                        return true;
                }
                catch (Exception ex)
                {
                        logger.error(ex.getMessage());
                        return false ;
                }
        }

        @Override
        public LargeculturalPlan updateLargeCulturalPlan(LargeculturalPlan largeCulturalPlan)
        {
                em.merge(largeCulturalPlan);
                return largeCulturalPlan;
        }

}

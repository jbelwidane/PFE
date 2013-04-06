package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.ArboriCulturalPlanDao;
import com.gestionagricole.entity.ArboriculturalPlan;

@Stateless
public class ArboriCulturalPlanDaoImpl implements ArboriCulturalPlanDao
{

        private static final Logger logger = LoggerFactory.getLogger(ArboriCulturalPlanDaoImpl.class);

        private EntityManager em;

        @PersistenceContext
        public void setEntityManager(EntityManager entityManager) {
              this.em = entityManager;
        }

        @Override
        public ArboriculturalPlan createArboriCulturalPlan(ArboriculturalPlan arboriCulturalPlan) throws Exception
        {
                em.persist(arboriCulturalPlan);
                em.flush();
                em.refresh(arboriCulturalPlan);
                return arboriCulturalPlan;
        }

        @Override
        public boolean deleteArboriCulturalPlan(ArboriculturalPlan arboriCulturalPlan)
        {
                try {
                        em.remove(arboriCulturalPlan);
                        return true;
                }
                catch (Exception ex)
                {
                        logger.error(ex.getMessage());
                        return false ;
                }
        }

        @Override
        public ArboriculturalPlan updateArboriCulturalPlan(ArboriculturalPlan arboriCulturalPlan)
        {
                em.merge(arboriCulturalPlan);
                return arboriCulturalPlan;
        }

}

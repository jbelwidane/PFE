package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.ArboriculturalVarietyDao;
import com.gestionagricole.entity.ArboriculturalVariety;

@Stateless
public class ArboriculturalVarietyDaoImpl implements ArboriculturalVarietyDao
{

        private static final Logger logger = LoggerFactory.getLogger(ArboriculturalVarietyDaoImpl.class);

        private EntityManager em;

        @PersistenceContext
        public void setEntityManager(EntityManager entityManager) {
              this.em = entityManager;
        }

        @Override
        public ArboriculturalVariety createArboriculturalVariety(ArboriculturalVariety arboriculturalVariety) throws Exception
        {
                em.persist(arboriculturalVariety);
                em.flush();
                em.refresh(arboriculturalVariety);
                return arboriculturalVariety;
        }

        @Override
        public boolean deleteArboriculturalVariety(ArboriculturalVariety arboriculturalVariety)
        {
                try {
                        em.remove(arboriculturalVariety);
                        return true;
                }
                catch (Exception ex)
                {
                        logger.error(ex.getMessage());
                        return false ;
                }
        }

        @Override
        public ArboriculturalVariety updateArboriculturalVariety(ArboriculturalVariety arboriculturalVariety)
        {
                em.merge(arboriculturalVariety);
                return arboriculturalVariety;
        }

}

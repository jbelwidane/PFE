package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.CulturalTypeDao;
import com.gestionagricole.entity.CulturalType;

@Stateless
public class CulturalTypeDaoImpl implements CulturalTypeDao
{

        private static final Logger logger = LoggerFactory.getLogger(CulturalTypeDaoImpl.class);

        private EntityManager em;

        @PersistenceContext
        public void setEntityManager(EntityManager entityManager) {
              this.em = entityManager;
        }

        @Override
        public CulturalType createCulturalType(CulturalType culturalType) throws Exception
        {
                em.persist(culturalType);
                em.flush();
                em.refresh(culturalType);
                return culturalType;
        }

        @Override
        public boolean deleteCulturalType(CulturalType culturalType)
        {
                try {
                        em.remove(culturalType);
                        return true;
                }
                catch (Exception ex)
                {
                        logger.error(ex.getMessage());
                        return false ;
                }
        }

        @Override
        public CulturalType updateCulturalType(CulturalType culturalType)
        {
                em.merge(culturalType);
                return culturalType;
        }

}



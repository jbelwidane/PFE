package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.PropertyDao;
import com.gestionagricole.entity.Property;

@Stateless
public class PropertyDaoImpl implements PropertyDao
{

        private static final Logger logger = LoggerFactory.getLogger(PropertyDaoImpl.class);

        private EntityManager em;

        @PersistenceContext
        public void setEntityManager(EntityManager entityManager) {
              this.em = entityManager;
        }

        @Override
        public Property createProperty(Property property) throws Exception
        {
                em.persist(property);
                em.flush();
                em.refresh(property);
                return property;
        }

        @Override
        public boolean deleteProperty(Property property)
        {
                try {
                        em.remove(property);
                        return true;
                }
                catch (Exception ex)
                {
                        logger.error(ex.getMessage());
                        return false ;
                }
        }

        @Override
        public Property updateProperty(Property property)
        {
                em.merge(property);
                return property;
        }

}

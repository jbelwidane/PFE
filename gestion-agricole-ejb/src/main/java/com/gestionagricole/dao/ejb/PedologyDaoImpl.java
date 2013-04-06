package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.PedologyDao;
import com.gestionagricole.entity.Pedology;

@Stateless
public class PedologyDaoImpl implements PedologyDao
{

        private static final Logger logger = LoggerFactory.getLogger(PedologyDaoImpl.class);

        private EntityManager em;

        @PersistenceContext
        public void setEntityManager(EntityManager entityManager) {
              this.em = entityManager;
        }

        @Override
        public Pedology createPedology(Pedology pedology) throws Exception
        {
                em.persist(pedology);
                em.flush();
                em.refresh(pedology);
                return pedology;
        }

        @Override
        public boolean deletePedology(Pedology pedology)
        {
                try {
                        em.remove(pedology);
                        return true;
                }
                catch (Exception ex)
                {
                        logger.error(ex.getMessage());
                        return false ;
                }
        }

        @Override
        public Pedology updatePedology(Pedology pedology)
        {
                em.merge(pedology);
                return pedology;
        }

}

package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.UserAccountDao;
import com.gestionagricole.entity.UserAccount;

@Stateless
public class UserAccountDaoImpl implements UserAccountDao
{

        private static final Logger logger = LoggerFactory.getLogger(UserAccountDaoImpl.class);

        private EntityManager em;

        @PersistenceContext
        public void setEntityManager(EntityManager entityManager) {
              this.em = entityManager;
        }

        @Override
        public UserAccount createUserAccount(UserAccount userAccount) throws Exception
        {
                em.persist(userAccount);
                em.flush();
                em.refresh(userAccount);
                return userAccount;
        }

        @Override
        public boolean deleteUserAccount(UserAccount userAccount)
        {
                try {
                        em.remove(userAccount);
                        return true;
                }
                catch (Exception ex)
                {
                        logger.error(ex.getMessage());
                        return false ;
                }
        }

        @Override
        public UserAccount updateUserAccount(UserAccount userAccount)
        {
                em.merge(userAccount);
                return userAccount;
        }

}

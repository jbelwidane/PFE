package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.AuditDao;
import com.gestionagricole.entity.Audit;

@Stateless
public class AuditDaoImpl implements AuditDao {

	private static final Logger logger = LoggerFactory.getLogger(AuditDaoImpl.class);

	private EntityManager em;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	@Override
	public Audit createAudit(Audit audit) throws Exception {
		em.persist(audit);
		em.flush();
		em.refresh(audit);
		return audit;
	}

	@Override
	public boolean deleteAudit(Audit audit) {
		try {
			em.remove(audit);
			return true;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return false;
		}
	}

	@Override
	public Audit updateAudit(Audit audit) {
		em.merge(audit);
		return audit;
	}

}

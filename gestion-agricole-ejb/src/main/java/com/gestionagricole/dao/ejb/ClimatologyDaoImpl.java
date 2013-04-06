package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.ClimatologyDao;
import com.gestionagricole.entity.Climatology;

@Stateless
public class ClimatologyDaoImpl implements ClimatologyDao {

	private static final Logger logger = LoggerFactory.getLogger(ClimatologyDaoImpl.class);

	private EntityManager em;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	@Override
	public Climatology createClimatology(Climatology climatology)
			throws Exception {
		em.persist(climatology);
		em.flush();
		em.refresh(climatology);
		return climatology;
	}

	@Override
	public boolean deleteClimatology(Climatology climatology) {
		try {
			em.remove(climatology);
			return true;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return false;
		}
	}

	@Override
	public Climatology updateClimatology(Climatology climatology) {
		em.merge(climatology);
		return climatology;
	}

}

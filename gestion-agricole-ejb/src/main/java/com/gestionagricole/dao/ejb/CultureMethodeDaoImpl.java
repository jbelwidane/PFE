package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.CultureMethodeDao;
import com.gestionagricole.entity.CulturalMethode;

@Stateless
public class CultureMethodeDaoImpl implements CultureMethodeDao {

	private static final Logger logger = LoggerFactory
			.getLogger(CultureMethodeDaoImpl.class);

	private EntityManager em;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	@Override
	public CulturalMethode createCultureMethode(CulturalMethode cultureMethode)
			throws Exception {
		em.persist(cultureMethode);
		em.flush();
		em.refresh(cultureMethode);
		return cultureMethode;
	}

	@Override
	public boolean deleteCultureMethode(CulturalMethode cultureMethode) {
		try {
			em.remove(cultureMethode);
			return true;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return false;
		}
	}

	@Override
	public CulturalMethode updateCultureMethode(CulturalMethode cultureMethode) {
		em.merge(cultureMethode);
		return cultureMethode;
	}

}
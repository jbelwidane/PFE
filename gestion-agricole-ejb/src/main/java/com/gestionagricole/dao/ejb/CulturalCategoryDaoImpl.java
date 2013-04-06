package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.CulturalCategoryDao;
import com.gestionagricole.entity.CulturalCategory;

@Stateless
public class CulturalCategoryDaoImpl implements CulturalCategoryDao {

	private static final Logger logger = LoggerFactory
			.getLogger(CulturalCategoryDaoImpl.class);

	private EntityManager em;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	@Override
	public CulturalCategory createCulturalCategory(
			CulturalCategory culturalCategory) throws Exception {
		em.persist(culturalCategory);
		em.flush();
		em.refresh(culturalCategory);
		return culturalCategory;
	}

	@Override
	public boolean deleteCulturalCategory(CulturalCategory culturalCategory) {
		try {
			em.remove(culturalCategory);
			return true;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return false;
		}
	}

	@Override
	public CulturalCategory updateCulturalCategory(CulturalCategory culturalCategory) {
		em.merge(culturalCategory);
		return culturalCategory;
	}

}

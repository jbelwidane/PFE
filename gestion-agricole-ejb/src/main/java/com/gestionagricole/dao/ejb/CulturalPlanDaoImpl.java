package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.CulturalPlanDao;
import com.gestionagricole.entity.CulturalPlan;

@Stateless
public class CulturalPlanDaoImpl implements CulturalPlanDao {

	private static final Logger logger = LoggerFactory
			.getLogger(CulturalPlanDaoImpl.class);

	private EntityManager em;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	@Override
	public CulturalPlan createCulturalPlan(CulturalPlan culturalPlan)
			throws Exception {
		em.persist(culturalPlan);
		em.flush();
		em.refresh(culturalPlan);
		return culturalPlan;
	}

	@Override
	public boolean deleteCulturalPlan(CulturalPlan culturalPlan) {
		try {
			em.remove(culturalPlan);
			return true;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return false;
		}
	}

	@Override
	public CulturalPlan updateCulturalPlan(CulturalPlan culturalPlan) {
		em.merge(culturalPlan);
		return culturalPlan;
	}

}

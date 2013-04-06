package com.gestionagricole.dao.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.FarmUnitDao;
import com.gestionagricole.entity.FarmUnit;

@Stateless
public class FarmUnitDaoImpl implements FarmUnitDao {

	private static final Logger logger = LoggerFactory
			.getLogger(FarmUnitDaoImpl.class);

	private EntityManager em;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	@Override
	public FarmUnit createFarmUnit(FarmUnit farmUnit) throws Exception {
		em.persist(farmUnit);
		em.flush();
		em.refresh(farmUnit);
		return farmUnit;
	}

	@Override
	public boolean deleteFarmUnit(FarmUnit farmUnit) {
		try {
			em.remove(farmUnit);
			return true;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return false;
		}
	}

	@Override
	public FarmUnit updateFarmUnit(FarmUnit farmUnit) {
		em.merge(farmUnit);
		return farmUnit;
	}

}

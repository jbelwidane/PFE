package com.gestionagricole.dao.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.MeasuringUnitDao;
import com.gestionagricole.entity.MeasuringUnit;

@Stateless
public class MeasuringUnitDaoImpl implements MeasuringUnitDao {

	private static final Logger logger = LoggerFactory.getLogger(MeasuringUnitDaoImpl.class);

	private EntityManager em;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	@Override
	public MeasuringUnit createMeasuringUnit(MeasuringUnit measuringUnit) throws Exception {
		em.persist(measuringUnit);
		em.flush();
		em.refresh(measuringUnit);
		return measuringUnit;
	}

	@Override
	public boolean deleteMeasuringUnit(MeasuringUnit measuringUnit) {
		try {
			em.remove(measuringUnit);
			return true;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return false;
		}
	}

	@Override
	public MeasuringUnit updateMeasuringUnit(MeasuringUnit measuringUnit) {
		em.merge(measuringUnit);
		return measuringUnit;
	}

	@Override
	public MeasuringUnit findMeasuringUnitByName(String label, String sigle) {
		try {
			MeasuringUnit measuringUnit = (MeasuringUnit) em.createNamedQuery("findMeasuringUnitBySigleAndLabel")
						.setParameter("measuringUnitLabel", label)
						.setParameter("measuringUnitSigle", sigle)
						.getSingleResult();

			if (measuringUnit == null)
				return null;

			return measuringUnit;

		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public List<MeasuringUnit> getAllMeasuringUnit() 
	{
		@SuppressWarnings("unchecked")
		List<MeasuringUnit> measuringUnits = em.createNamedQuery("findAllMeasuringUnit").getResultList();

		if (measuringUnits == null)
			return new ArrayList<MeasuringUnit>();

		return measuringUnits;
	}
}

package com.gestionagricole.dao.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.TemperatureDao;
import com.gestionagricole.entity.Temperature;

@Stateless
public class TemperatureDaoImpl implements TemperatureDao {

	private static final Logger logger = LoggerFactory.getLogger(TemperatureDaoImpl.class);

	private EntityManager em;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	@Override
	public Temperature createTemperature(Temperature temperature)throws Exception {
		em.persist(temperature);
		em.flush();
		em.refresh(temperature);
		return temperature;
	}

	@Override
	public boolean deleteTemperature(Temperature temperature) {
		try {
			em.remove(temperature);
			return true;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return false;
		}
	}

	@Override
	public Temperature updateTemperature(Temperature temperature) {
		em.merge(temperature);
		return temperature;
	}

	@Override
	public List<Temperature> getAllTemperature() 
	{
		@SuppressWarnings("unchecked")
		List<Temperature> temperatures = em.createNamedQuery("findAllTemperature").getResultList();

		if (temperatures == null)
			return new ArrayList<Temperature>();

		return temperatures;
	}
}

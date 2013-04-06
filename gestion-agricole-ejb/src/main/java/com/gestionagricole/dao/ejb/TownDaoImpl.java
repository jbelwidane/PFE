package com.gestionagricole.dao.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.TownDao;
import com.gestionagricole.entity.Town;

@Stateless
public class TownDaoImpl implements TownDao {

	private static final Logger logger = LoggerFactory.getLogger(TownDaoImpl.class);

	private EntityManager em;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	@Override
	public Town createTown(Town town) throws Exception {
		em.persist(town);
		em.flush();
		em.refresh(town);
		return town;
	}

	@Override
	public boolean deleteTown(Town town) {
		try {
			em.remove(town);
			return true;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return false;
		}
	}

	@Override
	public Town updateTown(Town town) {
		em.merge(town);
		return town;
	}

	@Override
	public Town findTownByName(String label) {
		try {
			Town town = (Town) em.createNamedQuery("findTownByLabel")
						.setParameter("townLabel", label)
						.getSingleResult();

			if (town == null)
				return null;

			return town;

		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public List<Town> getAllTown() 
	{
		@SuppressWarnings("unchecked")
		List<Town> towns = em.createNamedQuery("findAllTown").getResultList();

		if (towns == null)
			return new ArrayList<Town>();

		return towns;
	}
}

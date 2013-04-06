package com.gestionagricole.dao.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.AreaDao;
import com.gestionagricole.entity.Area;

@Stateless
public class AreaDaoImpl implements AreaDao {

	private static final Logger logger = LoggerFactory.getLogger(AreaDaoImpl.class);

	private EntityManager em;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	@Override
	public Area createArea(Area area) throws Exception {
		em.persist(area);
		em.flush();
		em.refresh(area);
		return area;
	}

	@Override
	public boolean deleteArea(Area area) {
		try {
			em.remove(area);
			return true;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return false;
		}
	}

	@Override
	public Area updateArea(Area area) {
		em.merge(area);
		return area;
	}

	@Override
	public Area findAreaByName(String label) {
		try {
			Area area = (Area) em.createNamedQuery("findAreaByLabel")
						.setParameter("areaLabel", label)
						.getSingleResult();

			if (area == null)
				return null;

			return area;

		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public List<Area> getAllArea() 
	{
		@SuppressWarnings("unchecked")
		List<Area> areas = em.createNamedQuery("findAllArea").getResultList();

		if (areas == null)
			return new ArrayList<Area>();

		return areas;
	}

}

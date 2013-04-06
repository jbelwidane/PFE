package com.gestionagricole.dao.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.ProvinceDao;
import com.gestionagricole.entity.Province;

@Stateless
public class ProvinceDaoImpl implements ProvinceDao {

	private static final Logger logger = LoggerFactory.getLogger(ProvinceDaoImpl.class);

	private EntityManager em;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	@Override
	public Province createProvince(Province province) {
		em.persist(province);
		em.flush();
		em.refresh(province);
		return province;
	}

	@Override
	public boolean deleteProvince(Province province) {
		try {
			em.remove(province);
			return true;
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return false;
		}
	}

	@Override
	public Province updateProvince(Province province) {
		em.merge(province);
		return province;
	}

	@Override
	public Province findProvinceById(long id) {
		return em.find(Province.class, id);
	}

	@Override
	public Province findProvinceByName(String label) {
		try {
			Province province = (Province) em
					.createNamedQuery("findProvinceByLabel")
					.setParameter("provinceLabel", label).getSingleResult();

			if (province == null)
				return null;

			return province;

		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public List<Province> getAllProvince() 
	{
		@SuppressWarnings("unchecked")
		List<Province> provinces = em.createNamedQuery("findAllProvince").getResultList();

		if (provinces == null)
			return new ArrayList<Province>();

		return provinces;
	}

}

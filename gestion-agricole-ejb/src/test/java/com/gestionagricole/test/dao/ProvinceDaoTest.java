package com.gestionagricole.test.dao;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.transaction.UserTransaction;

import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.InSequence;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.ProvinceDao;
import com.gestionagricole.test.ArquillianTest;

@RunWith(Arquillian.class)
public class ProvinceDaoTest extends ArquillianTest {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(ProvinceDaoTest.class);

	@EJB
	ProvinceDao provinceDao;

	@Inject
	UserTransaction utx;

//	private static final String CALLER_UID = "1.2.11";

	@Before
	public void initTest() throws Exception {
		utx.begin();
	}


	@Test
	@InSequence(1)
	public void removeCreatorFromAddressBookTests() {
		assertTrue(provinceDao.deleteProvince(provinceDao.findProvinceById(1L)));
	}

}
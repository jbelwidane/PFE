package com.gestionagricole.test.entity;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.transaction.UserTransaction;

import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.InSequence;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gestionagricole.dao.ProvinceDao;
import com.gestionagricole.entity.Province;
import com.gestionagricole.service.ConfigurationService;
import com.gestionagricole.test.ArquillianTest;

@RunWith(Arquillian.class)
public class InitializeDatabaseTest extends ArquillianTest {

	private static final Logger logger = LoggerFactory
			.getLogger(InitializeDatabaseTest.class);

	@EJB
	ConfigurationService provinceService;

	@EJB
	ProvinceDao provinceDao;

	@Inject
	UserTransaction utx;

	/*
	 * Global variables.
	 */

	// private static Random random = new Random();

	/*
	 * Valeurs pour chargement en base.
	 */

	@Before
	public void setUp() throws Exception {
		/*
		 * Called before each test.
		 */
		// super.setUp();
		startTransaction();
	}

	@After
	public void tearDown() throws Exception {
		/*
		 * Get called after each test.
		 */
		// super.tearDown();
		endTransaction();
	}

	@Test
	@InSequence(0)
	@Ignore
	public void startTransaction() throws Exception {
		logger.info("======================");
		logger.info(" Start user managed transaction");
		logger.info("======================");
		utx.begin();
	}

	@Test
	@InSequence(999)
	@Ignore
	public void endTransaction() throws Exception {
		logger.info("======================");
		logger.info(" End user Manager transaction ");
		logger.info("======================");
		utx.commit();
	}

	@Test
	@InSequence(1)
	public void InitData_init_Province() throws Exception {
		logger.info("=============================================");
		logger.info(" Creation > provinces> ");
		logger.info("=============================================");
		for (int i = 1; i <= 50; i++) {
			Province p = new Province();
			p.setLabel("province " + i);
			p = provinceDao.createProvince(p);
			assertNotNull(p);
		}

	}
}
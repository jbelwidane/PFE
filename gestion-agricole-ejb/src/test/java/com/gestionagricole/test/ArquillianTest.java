package com.gestionagricole.test;


import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.formatter.Formatters;
import org.jboss.shrinkwrap.api.spec.JavaArchive;



/**
 * Parent class for the test inside a JBoss EJB container
 * @version 1.0 (initial version)
 * @author ndupontjubien
 *
 */

public abstract class ArquillianTest extends TimedTest { 
 
	//private static final Logger logger = LoggerFactory.getLogger(ArquillianTest.class);
	 
    @Deployment
    public static JavaArchive createDeployment() {
    	JavaArchive archive = ShrinkWrap.create(JavaArchive.class, "gestionagricole-test.jar")
    			
    			.addPackage("com.gestionagricole.dto")
    			.addPackage("com.gestionagricole.exception")
    			.addPackage("com.gestionagricole.validator")
    			
    			.addPackage("com.gestionagricole.constant")
    			
    			.addPackage("com.gestionagricole.dao")                
    			.addPackage("com.gestionagricole.dao.ejb")
    			.addPackage("com.gestionagricole.factory")
    			.addPackage("com.gestionagricole.helper")
    			.addPackage("com.gestionagricole.interceptor")
    			.addPackage("com.gestionagricole.security")
    			.addPackage("com.gestionagricole.service")
    			.addPackage("com.gestionagricole.service.ejb")
    			.addPackage("com.gestionagricole.service.rest")
    			.addPackage("com.gestionagricole.tools")
    			
    			.addPackages(true,"com.gestionagricole.test")
    			.addPackage("com.gestionagricole.test.dao")
    			.addPackage("com.gestionagricole.test.tools")
    			
    			.addPackage("com.gestionagricole.dao.exception")
    			.addPackage("com.gestionagricole.entity")
    			
                .addAsManifestResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"))
                .addAsResource("log4j.xml")
                .addAsResource("ValidationMessages.properties")
                .addAsResource("ValidationMessages_fr.properties")
                .addAsManifestResource("META-INF/ejb-jar.xml", "ejb-jar.xml")
                .addAsManifestResource("META-INF/persistence.xml", "persistence.xml");
                //Spring Security Dependencies
                //.addClasses(UserDetailsService.class)
    	
		System.out.println(archive.toString(Formatters.VERBOSE));
		
		return archive;
    	
    }

}


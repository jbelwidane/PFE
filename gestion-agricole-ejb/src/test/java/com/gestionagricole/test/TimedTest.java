package com.gestionagricole.test;

import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * TestCase with runtime elapsed time display
 * @version 1.0 (initial)
 * @author ndupontjubien
 *
 */
public abstract class TimedTest extends TestCase {

	private static final Logger logger = LoggerFactory.getLogger(TimedTest.class);

	private long startTime=System.currentTimeMillis();
	private long interTime=System.currentTimeMillis();	

	public void timeStart(){
		startTime=System.currentTimeMillis();
		interTime=System.currentTimeMillis();
	}

	public String timeConvert(long millisecondes){

        final long hr  = TimeUnit.MILLISECONDS.toHours(millisecondes);
        final long min = TimeUnit.MILLISECONDS.toMinutes(millisecondes - TimeUnit.HOURS.toMillis(hr));
        final long sec = TimeUnit.MILLISECONDS.toSeconds(millisecondes - TimeUnit.HOURS.toMillis(hr) - TimeUnit.MINUTES.toMillis(min));
        final long ms  = TimeUnit.MILLISECONDS.toMillis(millisecondes -  TimeUnit.HOURS.toMillis(hr) - TimeUnit.MINUTES.toMillis(min) - TimeUnit.SECONDS.toMillis(sec));
		
		return String.format("%02d:%02d.%03d ", min, sec, ms);		
	}

	public String timeElapsed(){

		long dureeTestTotal = System.currentTimeMillis()-startTime;
		long dureeTestInter = System.currentTimeMillis()-interTime;

		interTime = System.currentTimeMillis();

		return "durée "+timeConvert(dureeTestInter)+" total "+timeConvert(dureeTestTotal);
	}

	public void timeReset(){
		interTime = System.currentTimeMillis();
	}
	
	/**
	 * Inject TestAuthentication in securityContext.
	 * @param userUid
	 */
	public Boolean login(String userUid)
	{
		//Security Context Injection
//		try
//		{
//			SecurityContextHolder.getContext().setAuthentication(new TestAuthentication(userUid));
//		} 
//		catch (Exception e)
//		{
//			//e.printStackTrace();
//			logger.warn("Spring configuration", e.getMessage());
//			return false;
//		}
//		
//		logger.info("Injection user {} "+SecurityContextHolder.getContext().getAuthentication().getName());
		return true;
	}
	
	@Before
	public void setUp() throws Exception 
	{
		timeStart();
		//logger.info("\n\n\n===========\n\n");
		logger.info("\n\n======> Debut du Test ");
		
		login("1.2.11");
	}

	@After
	public void tearDown() throws Exception 
	{
		logger.info("======> "+timeElapsed());
		logger.info("======> Fin du Test\n\n");
		//logger.info("\n\n\n===========\n\n");
	}
	
}

package com.gestionagricole.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Interceptor
@LoggerInterceptorBinding 
public class LoggerInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);
	
	public LoggerInterceptor() {
		// TODO Auto-generated constructor stub
	}

	@AroundInvoke
	public Object manage(InvocationContext context) throws Exception {
		
		StringBuffer buffer = new StringBuffer("LoggerICT entered ");
		
		buffer.append(context.getMethod().getDeclaringClass().getName());
		buffer.append(" -> ");
		buffer.append(context.getMethod().getName());
		buffer.append("(");
		
		Boolean p=false;
		for (Object c : context.getParameters())
		{
			
			if( p ) buffer.append(", ");
			
			if( c == null )
				buffer.append("{null}");
			else
				buffer.append("{").append(c.getClass()).append("}");
				
			buffer.append(c);	
			p=true;
		}
		
		buffer.append(")");
		
		logger.debug(buffer.toString());
		
	    final long starttime = System.currentTimeMillis();  
	    
	    try {  
	    	
	      return context.proceed();
	      
	    } catch(Exception e ){
	    	// Le type de l'exception est-il sauvegardé ???
	    	throw e;
	    	
	    } finally {  
	    	
	      final long endtime = System.currentTimeMillis(); 
	      logger.debug("LoggerICT ended {}() in {} ms.", context.getMethod().getName(), (endtime - starttime));

	    }  		

	}

}

package com.gestionagricole.tools;

import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObjectBuilderTool {

	static Logger logger=LoggerFactory.getLogger(ObjectBuilderTool.class);
	
	
	public static String buildFiltreSelector(Map<String,String> rpcObj) throws Exception
	{
		if(rpcObj==null) throw new Exception("Exception lors du build du selector apartir des prop/values");
		int size=rpcObj.entrySet().size();
		int i=0;
		String selector="";
		for(Entry<String, String> pr : rpcObj.entrySet())
		{						
			selector+=pr.getKey()+" = '"+pr.getValue()+"'";
			if(i+1<size) selector+=" and ";
			i++;			
		}
				
		//logger.debug("selector Build :====> {}", selector);
		return selector;
	}
	
	
	public static String BuildFiltre(Properties prop,String isNotStringValue) throws Exception
	{
			String selector="";
			int i=0;
			
			for(String pr : prop.stringPropertyNames())
			{
				String value=prop.getProperty(pr);
				if(value=="") 
				{					
					throw new Exception("Exception lors du build du selector apartir des prop/values");
				}				
				
				if(isNotStringValue==null)
					selector+=pr+" = '"+value+"'";
				else 
					selector+=pr+""+value+"";
					
				i++;
				if(i <prop.size()) selector+=" and ";
			}
			
			logger.info("QueueuBrowser Filter :> Selector is Builded :"+selector);
			
			return selector;										
	}
	
	public static String extractAIFromMessageID(String msgID)
	{
		return msgID.split("-")[2];
	}
}	

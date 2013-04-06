package com.gestionagricole.helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class TemplateHelper {

	public static String getTemplate(String filename,  Map<String, String> replacements)
	{
		try 
		{
			
			String text = new Scanner( new File(filename), "UTF-8" ).useDelimiter("\\A").next();
			return Replacer.replaceTokens(text, replacements);
			
			
		} catch (FileNotFoundException e) 
		{
			return null;
		}
	}
	
}

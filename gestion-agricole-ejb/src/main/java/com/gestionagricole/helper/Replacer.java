package com.gestionagricole.helper;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacer {

	/**
	 * Replace token by values given in the map in the string text and return the result.
	 * Uses regex.
	 * 
	 * @param text
	 * @param replacements
	 * @return
	 * @author mbadri
	 */
	
	public static String replaceTokens(String text, Map<String, String> replacements) 
	{
		Pattern pattern = Pattern.compile("\\{(.+?)\\}");
		Matcher matcher = pattern.matcher(text);
		StringBuffer buffer = new StringBuffer();
		while (matcher.find()) {
			String replacement = replacements.get(matcher.group(1));
			if (replacement != null) {
				matcher.appendReplacement(buffer, "");
				buffer.append(replacement);
			}
		}
		
		matcher.appendTail(buffer);
		return buffer.toString();
	}

}

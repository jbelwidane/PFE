package com.gestionagricole.helper;

import java.util.Random;

public class RandomString {

//	private static final char[] symbols = new char[36];

//	static {
//		for (int idx = 0; idx < 10; ++idx)
//			symbols[idx] = (char) ('0' + idx);
//		for (int idx = 10; idx < 36; ++idx)
//			symbols[idx] = (char) ('a' + idx - 10);
//	}

	private static final Random random = new Random();

	public RandomString()
	{
	}
	
	public static String getString(Integer length)
	{
		if (length < 1)
			throw new IllegalArgumentException("length < 1: " + length);
	
		char[] symbols = new char[36];
		
		for (int idx = 0; idx < 10; ++idx)
			symbols[idx] = (char) ('0' + idx);
		
		for (int idx = 10; idx < 36; ++idx)
			symbols[idx] = (char) ('a' + idx - 10);
		
		char[] buffer = new char[length];

		for (int idx = 0; idx < buffer.length; ++idx)
			buffer[idx] = symbols[random.nextInt(symbols.length)];
		
		return new String(buffer).toUpperCase();
	}

}

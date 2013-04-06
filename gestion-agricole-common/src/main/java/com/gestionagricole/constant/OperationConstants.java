package com.gestionagricole.constant;

public class OperationConstants {

	private OperationConstants() {};
		
	public static enum OPERATION_SCOPE 	{TECHNICAL , NOT_TECHNICAL};
	
	public static enum ACTION			{CREATE, READ, UPDATE, DELETE};
	public static enum STATUS 			{START, END, CURRENT};
	public static enum COMPONENT 		{TECHNICAL , NOT_TECHNICAL};

}
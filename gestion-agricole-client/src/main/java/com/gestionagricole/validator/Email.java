package com.gestionagricole.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

//import javax.validation.Constraint;
import javax.validation.Constraint;
import javax.validation.Payload; 
import javax.validation.constraints.Pattern;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Constraint(validatedBy=EmailValidator.class)
@Pattern(regexp=	"^" + "[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]" + "+(\\." + "[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]" + "+)*@"
					+ "(" + "[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]" +  "+(\\."    + "[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]" + "+)*"
					+ "|"
					+ "\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\]"
					+ ")$", message="{com.gestioncommerciale.constraints.Email.message}")
public @interface Email {
	String message() default "{com.gestioncommerciale.constraints.Email.message}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
		
	public static String ATOM = "[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]";
	public static String DOMAIN = "(" + ATOM + "+(\\." + ATOM + "+)*";
	public static String IP_DOMAIN = "\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\]";
	
}

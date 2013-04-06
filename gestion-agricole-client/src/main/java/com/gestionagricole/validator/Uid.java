package com.gestionagricole.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;

@Target(value={ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=UidValidator.class)
@Pattern(regexp="^[0-9.]+$")
public @interface Uid {

	String message() default "{com.gestioncommerciale.constraints.Uid.message}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
}

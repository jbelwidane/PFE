package com.gestionagricole.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(value={ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=NotEmptyValidator.class)
public @interface NotEmpty {
	String message() default "{com.gestioncommerciale.constraints.NotEmpty.message}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}

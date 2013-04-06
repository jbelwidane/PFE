package com.gestionagricole.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {

	@Override
	public void initialize(Email arg0) {
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext constraints) {

		return true;
	}

}

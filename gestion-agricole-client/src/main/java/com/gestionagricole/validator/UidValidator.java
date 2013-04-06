package com.gestionagricole.validator;

//import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UidValidator implements ConstraintValidator<Uid, String> {

	@Override
	public void initialize(Uid value) {

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

//		if( value == null || value.isEmpty() )
//			return true;
//		
//		if (!Pattern.matches("^[0-9.]+$", value))
//			return false;

		return true;
	}

}

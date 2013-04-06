package com.gestionagricole.validator;

//import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> 
{

	@Override
	public void initialize(PhoneNumber constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		return true;
			
//		if( value == null || value.isEmpty() == true )
//			return true;
		
//		return Pattern.matches("^[+]?[0-9. ]+$", value);
//		
	}

}

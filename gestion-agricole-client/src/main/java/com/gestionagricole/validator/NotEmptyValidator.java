package com.gestionagricole.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotEmptyValidator  implements ConstraintValidator<NotEmpty, String>
{

	@Override
	public void initialize(NotEmpty arg0) {

		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext constraint) {

		if( value == null || value.isEmpty() == true )
			return false;
		
		return true;
	}

	
	
}

package com.codingRfun.spring.validation.models;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.codingRfun.spring.validation.interfaces.StartsWith;

public class StartsWithConstraintValidator implements ConstraintValidator<StartsWith, String> {
	private String prefixName = null;

	@Override
	public void initialize(StartsWith startsWith) {
		prefixName = startsWith.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean isValid = false;
		if (value != null) {
			isValid = value.startsWith(prefixName);
		}
		return isValid;
	}

}

package com.codingRfun.spring.validation.interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import com.codingRfun.spring.validation.models.StartsWithConstraintValidator;

@Constraint(validatedBy = StartsWithConstraintValidator.class)
@Target({ ElementType.FIELD , ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StartsWith {
	public String value();

	public String message() default "Doesn't starts with the desired value";

	Class<?>[] groups() default {};

	Class<?>[] payload() default {};
}

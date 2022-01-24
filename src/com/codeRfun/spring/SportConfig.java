package com.codeRfun.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.codeRfun.spring.models.SwimCoach;

@ComponentScan("com.codeRfun.spring")
public class SportConfig {
	
	@Scope("prototype")
	@Bean
	public SwimCoach swimCoach() {
		return new SwimCoach();
	}
	
	
}

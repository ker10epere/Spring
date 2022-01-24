package com.codeRfun.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.codeRfun.spring.interfaces.FortuneService;
import com.codeRfun.spring.models.HappyFortuneService;
import com.codeRfun.spring.models.SwimCoach;

@PropertySource("classpath:sport.properties") 
@ComponentScan("com.codeRfun.spring")
public class SportConfig {
	
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Scope("prototype")
	@Bean
	public SwimCoach swimCoach() {
		return new SwimCoach(happyFortuneService());
	}
	
	
}

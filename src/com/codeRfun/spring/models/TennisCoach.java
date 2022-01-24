package com.codeRfun.spring.models;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.codeRfun.spring.interfaces.Coach;
import com.codeRfun.spring.interfaces.FortuneService;

public class TennisCoach implements Coach {

	FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "swing 20 times";
	}
	
	// need to import  javax.annotation-api-1.3.2.jar or newer
	// if using java 9 higher, for @PostContruct and @PreDestroy
	@PostConstruct
	public void init() {
		System.out.println("initializing");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("cleaning up");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
}

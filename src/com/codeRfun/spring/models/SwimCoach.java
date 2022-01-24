package com.codeRfun.spring.models;

import org.springframework.beans.factory.annotation.Value;

import com.codeRfun.spring.interfaces.Coach;
import com.codeRfun.spring.interfaces.FortuneService;

public class SwimCoach implements Coach {
	FortuneService fortuneService;
	@Value("${swimcoach.email}")
	private String email;
	@Value("${swimcoach.name}")
	private String name;

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "butterfly swim 2 laps";
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

}

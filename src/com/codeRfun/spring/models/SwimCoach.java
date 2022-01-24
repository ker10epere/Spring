package com.codeRfun.spring.models;

import com.codeRfun.spring.interfaces.Coach;
import com.codeRfun.spring.interfaces.FortuneService;

public class SwimCoach implements Coach {
	FortuneService fortuneService;

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

}

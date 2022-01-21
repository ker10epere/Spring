package com.codeRfun.spring.models;

import com.codeRfun.spring.interfaces.Coach;
import com.codeRfun.spring.interfaces.FortuneService;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String email, team;
	
	public void init() {
		System.out.println("------ Initializing ------");
	}
	
	public void destroy() {
		System.out.println("------ Cleaning up bean ------");
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
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
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

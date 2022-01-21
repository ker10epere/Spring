package com.codeRfun.spring.models;

import org.springframework.stereotype.Component;

import com.codeRfun.spring.interfaces.Coach;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "swing 20 times";
	}

}

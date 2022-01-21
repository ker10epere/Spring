package com.codeRfun.spring.models;

import com.codeRfun.spring.interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}
}

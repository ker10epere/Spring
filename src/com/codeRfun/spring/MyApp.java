package com.codeRfun.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeRfun.spring.interfaces.Coach;
import com.codeRfun.spring.models.CricketCoach;

public class MyApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach bc = (CricketCoach) context.getBean("cricketCoach", Coach.class);
		System.out.println(bc.getDailyFortune());
		System.out.println(bc.getEmail());
		System.out.println(bc.getTeam());
		context.close();
	}
}

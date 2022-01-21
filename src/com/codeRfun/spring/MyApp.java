package com.codeRfun.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeRfun.spring.interfaces.Coach;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
	}

}

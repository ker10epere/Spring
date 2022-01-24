package com.codeRfun.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codeRfun.spring.interfaces.Coach;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class);
		Coach coach2 = context.getBean("tennisCoach", Coach.class);
		
		boolean sameReference = coach == coach2;
		System.out.println("Same Reference = " + sameReference);
		System.out.println("C1 " + coach);
		System.out.println("C2 " + coach2);
	}

}

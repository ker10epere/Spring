package com.codeRfun.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codeRfun.spring.interfaces.Coach;

public class MyApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = context.getBean("swimCoach", Coach.class);
		Coach coach2 = context.getBean("swimCoach", Coach.class);
		
		boolean sameReference = coach == coach2;
		System.out.println("Same Reference = " + sameReference);
		System.out.println("C1 " + coach);
		System.out.println("C2 " + coach2);
		System.out.println();
		System.out.println("C1 name " + coach.getName());
		System.out.println("C1 email " + coach.getEmail());
	}

}

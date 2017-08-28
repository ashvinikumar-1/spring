package com.ashvini.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimMainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getAddress());
		System.out.println(theCoach.getName());

		context.close();
	}

}

package com.ashvini.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach theCoach = context.getBean("ttCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkOut());
		// autowiring output
		System.out.println(theCoach.getFortune());
		

		context.close();
	}

}

package spring_demo_DI_IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import setter_injection.CricketCoach;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//for constructor
		Coach footballCoach = context.getBean("myCoach",Coach.class);
		//for setter
		CricketCoach theCoach = context.getBean("theCoach",CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		//for constructor injection
		System.out.println(footballCoach.getDailyWorkout());
		System.out.println(footballCoach.getFortune());
		//literal value
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmail());
		//literal value from personal.properties
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getAddress());

	}

}

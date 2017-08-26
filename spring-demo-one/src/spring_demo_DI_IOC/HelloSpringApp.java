package spring_demo_DI_IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",FootballCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());

	}

}

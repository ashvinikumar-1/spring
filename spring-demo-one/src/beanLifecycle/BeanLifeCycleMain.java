package beanLifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecycle.xml");
		TTCoach ttCoach = context.getBean("ttCoach",TTCoach.class);
		System.out.println(ttCoach.getDailyWorkout());
		System.out.println(ttCoach.getFortune());
		context.close();
		
		
		
		
	}

}


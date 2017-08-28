package springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("ttCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkOut());
		// autowiring output
		System.out.println(theCoach.getFortune());
		

		context.close();
	}

}

package springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSetter {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("setterDI",Coach.class);
        System.out.println(theCoach.getDailyWorkOut());
        System.out.println(theCoach.getFortune());
	}

}

package spring_demo_DI_IOC;

public class MyApp {

	public static void main(String[] args) {
		Coach theCoach = new FootballCoach();
		System.out.println(theCoach.getDailyWorkout());
	}

}

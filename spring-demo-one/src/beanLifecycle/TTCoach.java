package beanLifecycle;

import spring_demo_DI_IOC.Coach;

public class TTCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "practice 50 mins on forehand smash";
	}

	@Override
	public String getFortune() {
		return "gud luck for todays game";
	}
	
	// add init method
	public void doStartUp() {
		System.out.println("in init method");
	}
	// add destroy method
	public void doCleanUp() {
		System.out.println("in destroy method");
	}

}

package spring_demo_DI_IOC;

import constructor_injection.FortuneService;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	public FootballCoach(FortuneService theFortuneService) {
		super();
		fortuneService = theFortuneService;
	}

	public FootballCoach() {
		// TODO Auto-generated constructor stub
	}

	public String getDailyWorkout() {
		return "Practice 30 mins on kick";
	}
	public String getFortune() {
		return fortuneService.getFortune();
	}

}

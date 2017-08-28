package setter_injection;

import constructor_injection.FortuneService;
import spring_demo_DI_IOC.Coach;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	//get literal value from personal.properties
	private String name;
	private String address;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}

	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	public String getDailyWorkout() {
		return "daily 50 mins practice on batting";
	}

	
	public String getFortune() {
		
		return fortuneService.getFortune();
	}

}

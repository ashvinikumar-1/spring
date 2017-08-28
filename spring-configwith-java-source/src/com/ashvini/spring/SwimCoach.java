package com.ashvini.spring;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	@Value("${foo.name}")
	private String name;
	@Value("${foo.address}")
	private String address;
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		return "Swim 1000 m in 3 hours";
	}

	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	

}

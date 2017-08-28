package com.ashvini.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ttCoach")
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkOut() {
		return "Practice 30 mins on backhand volley";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	// lifecycle methods
	@PostConstruct
	public void doStart() {
		System.out.println("pre method- init");
	}
	@PreDestroy
	public void doDestroy() {
		System.out.println("post method-destroy");
	}

}

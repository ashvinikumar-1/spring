package com.ashvini.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.ashvini.spring")
@PropertySource("classpath:personal.properties")
public class SportConfig {
//define bean for SadFortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	//define bean for our swim coach and inject dependencies
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}

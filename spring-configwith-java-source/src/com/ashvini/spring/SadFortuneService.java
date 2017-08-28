package com.ashvini.spring;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "today is the sad day";
	}

}

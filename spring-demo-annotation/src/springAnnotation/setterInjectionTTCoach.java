package springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("setterDI")
public class setterInjectionTTCoach implements Coach {

	private FortuneService fortuneService;
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	
	@Override
	public String getDailyWorkOut() {
		return "daily practice 30 min om back spin";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}

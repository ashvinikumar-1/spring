package springAnnotation;

import org.springframework.stereotype.Component;

@Component
public class RandomFortunService implements FortuneService {

	@Override
	public String getFortune() {
		return "Random Fortune Service";
	}

}

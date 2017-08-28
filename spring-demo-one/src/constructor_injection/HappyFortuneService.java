package constructor_injection;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Gud luck for the day";
	}

}

package co.com.tcs.certification.advantage.interations;


import co.com.tcs.certification.advantage.user.interfaces.AdvantageHomeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AdvantageLoginInteraction implements Interaction{

	private String user;
	private String pw;
	
	public AdvantageLoginInteraction(String user, String password) {
		this.user = user;
		this.pw = password;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(user).into(AdvantageHomeInterface.INPUT_USERNAME), 
				Enter.theValue(pw).into(AdvantageHomeInterface.INPUT_PASSWORD),
				Click.on(AdvantageHomeInterface.BUTTON_LOGING));
	}
	
	public static AdvantageLoginInteraction loginUser(String user, String pw) {
		return new AdvantageLoginInteraction(user , pw);
	}
}

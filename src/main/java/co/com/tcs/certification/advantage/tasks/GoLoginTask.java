package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.interations.AdvantageLoginInteraction;
import co.com.tcs.certification.advantage.user.interfaces.AdvantageHomeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoLoginTask implements Task{

	private String user;
	private String pass;
	
	public GoLoginTask(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(10000);
			actor.attemptsTo(Click.on(AdvantageHomeInterface.BUTTON_USER),
					AdvantageLoginInteraction.loginUser(user, pass));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static GoLoginTask  goLoginForm(String user, String pass) {
		return new GoLoginTask(user, pass);
	}

}

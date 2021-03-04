package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.user.interfaces.AdvantageHomeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoFormTask implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(10000);
			actor.attemptsTo(
					Click.on(AdvantageHomeInterface.BUTTON_USER),
					Click.on(AdvantageHomeInterface.BUTTON_NEW_ACCOUNT));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static GoFormTask buttonClic() {
		return new GoFormTask();
	}
}

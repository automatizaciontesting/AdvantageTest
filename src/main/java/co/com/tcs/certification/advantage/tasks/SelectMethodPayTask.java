package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.user.interfaces.PayMethodInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectMethodPayTask implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(5000);
			actor.attemptsTo(Click.on(PayMethodInterface.MASTERCARD));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static SelectMethodPayTask selectMethodPay() {
		return new SelectMethodPayTask();
	}
}

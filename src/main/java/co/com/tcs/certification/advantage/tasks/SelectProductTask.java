package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.user.interfaces.SelectProductInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectProductTask implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SelectProductInterface.PRODUCT));
	}
	
	public static SelectProductTask selectProduct() {
		return new SelectProductTask();
	}
}

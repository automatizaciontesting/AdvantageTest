package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.user.interfaces.SelectProductFeaturesInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddShoppingCartTasks implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SelectProductFeaturesInterface.COLOR));
		for (int i = 0; i < 3; i++) {
			actor.attemptsTo(Click.on(SelectProductFeaturesInterface.QUANTILY_PRODUCTS));
		}
		actor.attemptsTo(Click.on(SelectProductFeaturesInterface.ADD_CAR));
	}

	public static AddShoppingCartTasks addCart() {
		return new AddShoppingCartTasks();
	}
}

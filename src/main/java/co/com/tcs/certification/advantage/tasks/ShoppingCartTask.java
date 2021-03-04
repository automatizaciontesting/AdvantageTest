package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.interations.AdvantageCartInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ShoppingCartTask implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(AdvantageCartInteraction.shoppingCart());
	}
	public static ShoppingCartTask seeShoppingCart() {
		return new ShoppingCartTask();
	}
}

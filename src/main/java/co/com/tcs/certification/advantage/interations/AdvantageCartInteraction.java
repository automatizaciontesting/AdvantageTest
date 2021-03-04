package co.com.tcs.certification.advantage.interations;

import co.com.tcs.certification.advantage.user.interfaces.ShoppingCartInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class AdvantageCartInteraction implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(9000);
			actor.attemptsTo(Click.on(ShoppingCartInterface.BUTTON_CART));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static AdvantageCartInteraction shoppingCart() {
		return new AdvantageCartInteraction();
	}
}

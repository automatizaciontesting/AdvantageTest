package co.com.tcs.certification.advantage.user.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartInterface {
	public static Target BUTTON_CART = Target.the("Shopping cart button").locatedBy("//a[@id='shoppingCartLink']");
}

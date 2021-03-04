package co.com.tcs.certification.advantage.user.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SelectProductInterface {
	public static Target PRODUCT = Target.the("Product").locatedBy("//a[contains(text(),'HP ElitePad 1000 G2 Tablet')]");
}

package co.com.tcs.certification.advantage.user.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GoToPayInterface {
	public static Target GO_TO_PAY = Target.the("Go to pay product").locatedBy("//button[@id='checkOutButton']");
}

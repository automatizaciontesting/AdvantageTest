package co.com.tcs.certification.advantage.user.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PayMethodInterface {
	public static Target MASTERCARD = Target.the("Select mastercard").locatedBy("//input[@name='masterCredit']");
	public static Target SAFE_PAY = Target.the("Select safepay").locatedBy("//input[@name='safepay']");

}

package co.com.tcs.certification.advantage.user.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddMastercardInterface {
	public static Target CARD_NUMBER = Target.the("Card Number").locatedBy("//input[@id='creditCard']");
	public static Target CVV = Target.the("cvv").locatedBy("//input[@name='cvv_number']");
	public static Target EXPE_MONTH = Target.the("Expedition month").locatedBy("//select[@name='mmListbox']");
	public static Target EXPE_YEAR = Target.the("Expedition year ").locatedBy("//select[@name='yyyyListbox']");
	public static Target CARD_NAME = Target.the("Card name").locatedBy("//input[@name='cardholder_name']");
	public static Target BUTTON_PAY = Target.the("Button pay").locatedBy("//button[@id='pay_now_btn_ManualPayment']");

}

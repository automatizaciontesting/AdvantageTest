package co.com.tcs.certification.advantage.user.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AdvantageFormInterface {
	public static final Target INPUT_USERNAME = Target.the("input username")
			.locatedBy("//*[@name='usernameRegisterPage']");

	public static final Target INPUT_EMAIL = Target.the("input email").locatedBy("//input[@name='emailRegisterPage']");

	public static final Target INPUT_PASSWORD = Target.the("input password")
			.locatedBy("//input[@name='passwordRegisterPage']");

	public static final Target INPUT_CONF_PASS = Target.the("input password confirm")
			.locatedBy("//input[@name='confirm_passwordRegisterPage']");

	public static final Target INPUT_FIRST = Target.the("input first name")
			.locatedBy("//input[@name='first_nameRegisterPage']");

	public static final Target INPUT_LASTNAME = Target.the("input  last name")
			.locatedBy("//input[@name='last_nameRegisterPage']");

	public static final Target INPUT_PHONE = Target.the("input number phone")
			.locatedBy("//input[@name='phone_numberRegisterPage']");

	public static final Target SELECT_COUNTRY = Target.the("select country")
			.locatedBy("//select[@name='countryListboxRegisterPage']");

	public static final Target INPUT_CITY = Target.the("input city").locatedBy("//input[@name='cityRegisterPage']");

	public static final Target INPUT_ADDREESS = Target.the("input addreess")
			.locatedBy("//input[@name='addressRegisterPage']");

	public static final Target INPUT_STATE = Target.the("input state")
			.locatedBy("//input[@name='state_/_province_/_regionRegisterPage']");

	public static final Target INPUT_POSTAL = Target.the("Campo para ingresar codigo postal")
			.locatedBy("//input[@name='postal_codeRegisterPage']");

	public static final Target CHECKBOX_OFFERS = Target.the("checkbox").
	  locatedBy("//input[@name='allowOffersPromotion']");
	 

	public static final Target CHECK_I_AGREE = Target.the("accept politics").locatedBy("//*[@name='i_agree']");

	public static final Target BUTTON_REGISTER = Target.the("button resgister")
			.locatedBy("//*[@id='register_btnundefined']");
}

package co.com.tcs.certification.advantage.user.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AdvantageHomeInterface {
	public static final Target BUTTON_USER = Target.the("Icon to access user options")
			.locatedBy("//a[@id='hrefUserIcon']//*[local-name()='svg']");
	 public static final Target BUTTON_NEW_ACCOUNT = Target.the("button create new account").
	            locatedBy("//a[@class='create-new-account ng-scope']");
	 /*public static final Target TITLE_PAGE = Target.the("page title").
	            locatedBy("//a[@class='create-new-account ng-scope']");*/
	 public static Target INPUT_USERNAME = Target.the("INPUT USERNAME").locatedBy("//input[@name='username']");
	 public static Target INPUT_PASSWORD = Target.the("INPUT PASSWORD").locatedBy("//input[@name='password']");
	 public static Target BUTTON_LOGING = Target.the("INPUT PASSWORD").locatedBy("//button[@id='sign_in_btnundefined']");
}

package co.com.tcs.certification.advantage.user.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GoToNextPageInterface{
	public static Target NEXT_PAGE = Target.the("Go to next page").locatedBy("//button[@id='next_btn']");
}

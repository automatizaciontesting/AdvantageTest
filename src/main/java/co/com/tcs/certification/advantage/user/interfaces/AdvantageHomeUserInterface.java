package co.com.tcs.certification.advantage.user.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AdvantageHomeUserInterface {
	public static Target SPAN_USER = Target.the("Container username").locatedBy("//*[@class='hi-user containMiniTitle ng-binding']");
}

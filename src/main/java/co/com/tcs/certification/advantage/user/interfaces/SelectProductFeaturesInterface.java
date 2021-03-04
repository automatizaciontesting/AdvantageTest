package co.com.tcs.certification.advantage.user.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SelectProductFeaturesInterface {
	public static Target COLOR = Target.the("COLOR PRODUCT").locatedBy("//div[@class='uiview ng-scope']//span[2]");
	public static Target QUANTILY_PRODUCTS = Target.the("queantily products").locatedBy("//div[@class='plus']");
	public static Target ADD_CAR = Target.the("ADD SHOPPING CART").locatedBy("//button[@name='save_to_cart']");
}

package co.com.tcs.certification.advantage.tasks;

import java.util.HashMap;
import java.util.Map;

import co.com.tcs.certification.advantage.user.interfaces.AdvantageFormInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class NewUserTask implements Task {

	private String userNameAccount;
    private String mailAccount;
    private String passwordAccount;
    private String confirmPassAccount;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String country;
    private String city;
    private String address;
    private String state;
    private String postalCode;
    HashMap<String, String> dataForm = new HashMap<>();
    
    public NewUserTask(Map<String, String> data) {
		this.userNameAccount = data.get("userNameAccount");
		this.mailAccount = data.get("mailAccount");
		this.passwordAccount = data.get("passwordAccount");
		this.confirmPassAccount = data.get("confirmPassAccount");
		this.firstName = data.get("firstName");
		this.lastName = data.get("lastName");
		this.phoneNumber = data.get("phoneNumber");
		this.country = data.get("country");
		this.city = data.get("city");
		this.address = data.get("address");
		this.state = data.get("state");
		this.postalCode = data.get("postalCode");
	}
    
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
		WaitUntil.the(
				AdvantageFormInterface.INPUT_FIRST, WebElementStateMatchers.isVisible()).forNoMoreThan(120).seconds(),
				Enter.theValue(userNameAccount).into(AdvantageFormInterface.INPUT_USERNAME),
				Enter.theValue(mailAccount).into(AdvantageFormInterface.INPUT_EMAIL),
				Enter.theValue(passwordAccount).into(AdvantageFormInterface.INPUT_PASSWORD),
				Enter.theValue(confirmPassAccount).into(AdvantageFormInterface.INPUT_CONF_PASS),
				Enter.theValue(firstName).into(AdvantageFormInterface.INPUT_FIRST),
				Enter.theValue(lastName).into(AdvantageFormInterface.INPUT_LASTNAME),
				Enter.theValue(phoneNumber).into(AdvantageFormInterface.INPUT_PHONE),
				SelectFromOptions.byVisibleText(country).from(AdvantageFormInterface.SELECT_COUNTRY),
				Enter.theValue(city).into(AdvantageFormInterface.INPUT_CITY),
				Enter.theValue(address).into(AdvantageFormInterface.INPUT_ADDREESS),
				Enter.theValue(state).into(AdvantageFormInterface.INPUT_STATE),
				Enter.theValue(postalCode).into(AdvantageFormInterface.INPUT_POSTAL),
				Click.on(AdvantageFormInterface.CHECKBOX_OFFERS),
				Click.on(AdvantageFormInterface.CHECK_I_AGREE),
				Click.on(AdvantageFormInterface.BUTTON_REGISTER));

	}

	public static NewUserTask registerUser(Map<String, String> data) {
		return new NewUserTask(data);
	}
}

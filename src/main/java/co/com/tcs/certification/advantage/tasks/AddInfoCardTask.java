package co.com.tcs.certification.advantage.tasks;

import java.util.Map;

import co.com.tcs.certification.advantage.user.interfaces.AddMastercardInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AddInfoCardTask implements Task{

	private String cardName;
	private String cardNumber;
	private String expMonth;
	private String expYear;
	private String cvv;
	
	public AddInfoCardTask(Map<String, String> data) {
		this.cardName = data.get("CardHolderName");
		this.cardNumber = data.get("CardNumber");
		this.expMonth = data.get("expirationMonth");
		this.expYear = data.get("expirationYear");
		this.cvv = data.get("CVVNumber");
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(cardName).into(AddMastercardInterface.CARD_NAME),
				Enter.theValue(cardNumber).into(AddMastercardInterface.CARD_NUMBER),
				SelectFromOptions.byVisibleText(expMonth).from(AddMastercardInterface.EXPE_MONTH),
				SelectFromOptions.byVisibleText(expYear).from(AddMastercardInterface.EXPE_YEAR),
				Enter.theValue(cvv).into(AddMastercardInterface.CVV),
				Click.on(AddMastercardInterface.BUTTON_PAY));	
	}
	
	public static AddInfoCardTask addCard(Map<String, String> data) {
		return new AddInfoCardTask(data);
	}
}

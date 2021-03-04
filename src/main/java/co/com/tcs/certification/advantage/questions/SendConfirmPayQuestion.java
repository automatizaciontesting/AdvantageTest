package co.com.tcs.certification.advantage.questions;

import co.com.tcs.certification.advantage.user.interfaces.ConfirmPayInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SendConfirmPayQuestion implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(ConfirmPayInterface.CONFIRMATION_MESSEGE).viewedBy(actor).asString();
	}
	
	public static SendConfirmPayQuestion sendConfirm() {
		return new SendConfirmPayQuestion();
	}
}

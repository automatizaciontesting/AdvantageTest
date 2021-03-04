package co.com.tcs.certification.advantage.questions;

import co.com.tcs.certification.advantage.user.interfaces.AdvantageHomeUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SendUserQuestion implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(AdvantageHomeUserInterface.SPAN_USER).viewedBy(actor).asString();
	}
	
	public static SendUserQuestion valueFinal() {
		return new SendUserQuestion();
	}
	
}

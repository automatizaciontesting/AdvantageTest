package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.user.interfaces.GoToNextPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoToNextPageTask implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoToNextPageInterface.NEXT_PAGE));
		
	}
	public static GoToNextPageTask goToNextPage() {
		return new GoToNextPageTask();
	}
}

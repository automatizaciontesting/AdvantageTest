package co.com.tcs.certification.advantage.tasks;

import co.com.tcs.certification.advantage.user.interfaces.SelectCategoryInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectCategoryTasks implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SelectCategoryInterface.CATEGORY));
	}
	public static SelectCategoryTasks selectCategory() {
		return new SelectCategoryTasks();
	}
	
}

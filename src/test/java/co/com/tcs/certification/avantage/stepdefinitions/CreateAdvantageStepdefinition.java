package co.com.tcs.certification.avantage.stepdefinitions;

import java.util.Map;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.com.tcs.certification.advantage.questions.SendUserQuestion;
import co.com.tcs.certification.advantage.tasks.GoFormTask;
import co.com.tcs.certification.advantage.tasks.NewUserTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CreateAdvantageStepdefinition {

	Actor junior = Actor.named("Junior");
	
	@Managed(driver  ="chrome")
	WebDriver hisdriver;
	
	@Before
	public void config(){
	  junior.can(BrowseTheWeb.with(hisdriver));
	}
	
	@Given("^he enter the Avantage Demo page$")
	public void heEnterTheAvantageDemoPage() {
	   //junior.can(BrowseTheWeb.with(MyDriver.web().inThePage("https://www.advantageonlineshopping.com/")));
		junior.wasAbleTo(Open.url("https://www.advantageonlineshopping.com/"));
	}

	@When("^he enter a new account$")
	public void heEnterANewAccount(Map<String,String> data) {
	   junior.attemptsTo(GoFormTask.buttonClic());
	   junior.attemptsTo(NewUserTask.registerUser(data));
	}

	@Then("^he can see your username '(.*)' on the screen$")
	public void heCanSeeYourUsernameUserPruebaOnTheScreen(String user) {
	   junior.should(seeThat(SendUserQuestion.valueFinal(), Matchers.is(user)));
	}
}

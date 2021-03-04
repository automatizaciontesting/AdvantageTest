package co.com.tcs.certification.avantage.stepdefinitions;

import java.util.Map;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import co.com.tcs.certification.advantage.questions.SendConfirmPayQuestion;
import co.com.tcs.certification.advantage.tasks.AddInfoCardTask;
import co.com.tcs.certification.advantage.tasks.AddShoppingCartTasks;
import co.com.tcs.certification.advantage.tasks.GoLoginTask;
import co.com.tcs.certification.advantage.tasks.GoToNextPageTask;
import co.com.tcs.certification.advantage.tasks.GoToPayTask;
import co.com.tcs.certification.advantage.tasks.SelectCategoryTasks;
import co.com.tcs.certification.advantage.tasks.SelectMethodPayTask;
import co.com.tcs.certification.advantage.tasks.SelectProductTask;
import co.com.tcs.certification.advantage.tasks.ShoppingCartTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class LoginAdvantageStepdefinition {
	Actor junior = Actor.named("Junior");

	@Managed(driver = "chrome")
	WebDriver hisdriver;

	@Before
	public void config() {
		junior.can(BrowseTheWeb.with(hisdriver));
	}

	@Given("^he is logged into the page Username  '(.*)' and Password  '(.*)'$")
	public void heIsLoggedIntoThePageUsernameUserPruebaAndPasswordIngreso(String user, String password) {
		junior.wasAbleTo(Open.url("https://www.advantageonlineshopping.com/"));
		junior.attemptsTo(GoLoginTask.goLoginForm(user, password));
	}

	@When("^he has selected a tablet and add the product to the shopping cart$")
	public void heHasSelectedATabletAndAddTheProductToTheShoppingCart() {
		 junior.attemptsTo(SelectCategoryTasks.selectCategory(),
		    		SelectProductTask.selectProduct(),
		    		AddShoppingCartTasks.addCart());
	}

	@Given("^he chooses to pay with mastercard$")
	public void heChoosesToPayWithMastercard() {
		junior.attemptsTo(ShoppingCartTask.seeShoppingCart(),
	    		GoToPayTask.goToPay(),
	    		GoToNextPageTask.goToNextPage(),
	    		SelectMethodPayTask.selectMethodPay());
	}

	@When("^he enter card information and press click pay$")
	public void heEnterCardInformationAndPressClickPay(Map<String, String> data) {
		 junior.attemptsTo(AddInfoCardTask.addCard(data));
	}

	@Then("^he can see a transaction approval message '(.*)'$")
	public void heCanSeeATransactionApprovalMessageThankYouForBuyingWithAdvantage(String menssage) {
		junior.should(seeThat(SendConfirmPayQuestion.sendConfirm(), Matchers.is(menssage)));
	}
}

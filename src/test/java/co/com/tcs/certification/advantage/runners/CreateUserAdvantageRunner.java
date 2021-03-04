package co.com.tcs.certification.advantage.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/advantage_register.feature",
glue = "co.com.tcs.certification.avantage.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class CreateUserAdvantageRunner {

}

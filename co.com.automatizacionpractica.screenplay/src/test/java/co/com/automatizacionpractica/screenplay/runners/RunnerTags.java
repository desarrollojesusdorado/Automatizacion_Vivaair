package co.com.automatizacionpractica.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/viva_air_combinacion_uno.feature",
		tags= "@tag1",
		glue= {"co.com.automatizacionpractica.screenplay.stepdefinitions", "co.com.automatizacionpractica.screenplay.util" },
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {

}

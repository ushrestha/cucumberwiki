package net.thucydides.showcase.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features={"src/test/resources/wikiSearch"}, glue={"net.thucydides.showcase.cucumber.steps"}
		)

public class SearchWiki {

}

package net.thucydides.showcase.cucumber.steps;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import net.thucydides.showcase.cucumber.steps.serenity.WikiSteps;
import objectrepo.RepositoryParser;

public class WikiMap extends PageObject {
	
	@Steps WikiSteps wikiSteps;
	private RepositoryParser parser;

	
	@Given("i have naviaged to wikiPage")
	public void openWebPage() throws IOException
	
	{
	  
		open();
	    parser= new RepositoryParser("ObjectRepo.properties");
	   
	}
	
	@When("i enter '(\\w+)' in search box")
	public void enterAppleInSearchBar(String fruit) {
		WebElement element = getDriver().findElement(parser.getObjectLocator("searchBox"));
		element.sendKeys(fruit);

	}

	@When("i click on the search button")
	public void clickSearchButton() {
		
		WebElement element = getDriver().findElement(parser.getObjectLocator("searchButton"));
		element.click();
	}

	@Then("i should see the title with '(\\w+)'")
	public void shouldSeeApple(String fruit) {
		String titleFromPage= getDriver().findElement(parser.getObjectLocator("titleFromSearch")).getText();
		Assert.assertEquals(titleFromPage, fruit);
		
		//wikiSteps.shouldSeeTitleApple(fruit);
		
	}

}

package net.thucydides.showcase.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WikiPage extends PageObject {

	@FindBy(id="searchInput")
	protected WebElementFacade searchBox;
	
	@FindBy(css="#search-form > fieldset > button > i")
	protected WebElementFacade searchButton;
	
	@FindBy(css="#search-form > fieldset > button")
	protected WebElementFacade titlePage;

	@FindBy(id="firstHeading")
	protected WebElementFacade titleFromPage;
	public void enterAppleinSearchBar(String fruit) {
		
		searchBox.type(fruit);
		
		
	}

	public void clickSearchButton() {
		searchButton.click();
		
	}
	
	public String getTitle(){
		String title = titleFromPage.getText();
		System.out.println("Title is" +title);
		return title;
	}
	
}

package net.thucydides.showcase.cucumber.steps.serenity;


import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.showcase.cucumber.pages.WikiPage;

public class WikiSteps  extends ScenarioSteps{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private WikiPage wikiPage;

     public void openWebPage(){
    	 wikiPage.open();
    	 
     }
     
     @Step

 	public void enterAppleInSearchBar(String fruit) {
 		wikiPage.enterAppleinSearchBar(fruit);
 	
 	}

 	@Step
 	public void clickSearchButton() {
 		wikiPage.clickSearchButton();
 		
 		
 	}
 	
 	@Step

 	public void shouldSeeTitleApple(String fruit) {
 		String title=wikiPage.getTitle();
 		assertThat(title.equalsIgnoreCase(fruit));
 		
 	}

}

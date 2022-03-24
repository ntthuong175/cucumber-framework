package bank.stepDefinitions;


import org.junit.Assert;

import cucumber.api.java.en.Then;
import pageObject.bankGuru.HomePageObject;

public class HomePageSteps {
	HomePageObject homePage;

	@Then("^Homepage displayed$")
	public void homepageDisplayed() {
		Assert.assertTrue(homePage.ishomepageDisplayed());
	    
	}
}

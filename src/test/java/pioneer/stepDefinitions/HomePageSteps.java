package pioneer.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;

public class HomePageSteps extends BasePage {
	WebDriver driver;
	
	public HomePageSteps() {
		driver=Hooks.openAndQuitBrowser();
	}
	@Then("^Homepage displays$")
	public void homepage_displays() {
	}


}

package bank.stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObject.bankGuru.PageGeneratorManager;
import pageObject.bankGuru.RegisterPageObject;

public class RegisterPageSteps {
	WebDriver driver;
	RegisterPageObject registerPage;
	String username, password;
	

	public RegisterPageSteps(WebDriver driver) {

		this.driver = Hooks.openAndQuitBrowser();
		registerPage = PageGeneratorManager.getRegisterPage(driver);
	}

	@When("^Input to email textbox$")
	public void inputToEmailTextbox() {
		registerPage.inputToEmailTextbox("");
	}

	@When("^Click to Submit$")
	public void clickToSubmit() {
	    registerPage.clickToSubmitButton();
	    
	}

	@Then("^Get User and password info$")
	public void getUserAndPasswordInfo() {
		username = registerPage.getUserIDText();
	    password = registerPage.getPasswordText();
	    
	    
	}

	@When("^Back to Login page$")
	public void backToLoginPage() {
	    registerPage.openLoginPage("");
	    
	}

	


}

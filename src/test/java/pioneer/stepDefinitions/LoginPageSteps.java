package pioneer.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.BasePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageUIs.bankGuru.LoginPageUI;

public class LoginPageSteps extends BasePage {
	WebDriver driver;
	public LoginPageSteps() {
		driver=Hooks.openAndQuitBrowser();
		
	}
	

	@When("^Input to Email textbox with \"([^\"]*)\"$")
	public void input_to_Email_textbox_with(String value) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_ADDRESS);
	    sendKeyToElement(driver, LoginPageUI.EMAIL_ADDRESS,value);
	    
	}

	@When("^Input to Password textbox with \"([^\"]*)\"$")
	public void input_to_Password_textbox_with(String value) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD);
	    sendKeyToElement(driver, LoginPageUI.PASSWORD,value);
	    
	}
	@When("^Click to Submit button$")
	public void click_to_Submit_button() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
	    clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}

	@Then("^Verify error message displays$")
	public void verify_error_message_displays() {
	    waitForElementVisible(driver, LoginPageUI.ERROR_MESSAGE);
	    Assert.assertTrue(isElementIsDisplayed(driver, LoginPageUI.ERROR_MESSAGE));
	}
	@Then("^Verify error message for blank field displays$")
	public void verify_error_message_for_blank_field_displays(){
		waitForElementVisible(driver, LoginPageUI.EMAIL_ADDRESS);
		Assert.assertEquals(getElementValidationMessage(driver,LoginPageUI.EMAIL_ADDRESS),"Please fill out this fields.");
	}

	


}

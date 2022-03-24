package pageObject.bankGuru;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class HomePageObject extends BasePage {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean ishomepageDisplayed() {
		waitForElementVisible(driver, null);
		return isElementIsDisplayed(driver, null);

	}
}

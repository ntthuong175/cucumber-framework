package pageObject.bankGuru;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	private static HomePageObject homePage;
	private static LoginPageObject loginPage;
	private static RegisterPageObject registerPage;
private PageGeneratorManager() {
}

public static HomePageObject getHomePage(WebDriver driver) {
	//if(homePage==null) {
	homePage = new HomePageObject(driver);
	//}
	return homePage;
}
public static LoginPageObject getLoginPage(WebDriver driver) {
	//if(homePage==null) {
	loginPage = new LoginPageObject(driver);
	//}
	return loginPage;
}
public static RegisterPageObject getRegisterPage(WebDriver driver) {
	//if(homePage==null) {
		registerPage = new RegisterPageObject(driver);
	//}
	return registerPage;
}
}

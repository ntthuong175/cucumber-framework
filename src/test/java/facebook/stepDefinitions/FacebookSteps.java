package facebook.stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {
	WebDriver driver;
	@Given("^Open facebook application$")
	public void openFacebookApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@When("^Input to Username textbox$")
	public void inputToUsernameTextbox()  {
		driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	   
	}

	@When("^Input to Password textbox$")
	public void inputToPasswordTextbox()  {
		driver.findElement(By.id("pass")).clear();
	    driver.findElement(By.id("pass")).sendKeys("123456");
	   
	}

	@When("^Click to Submit button$")
	public void clickToSubmitButton()  {
	    driver.findElement(By.name("login")).click();
	   
	}

	@Then("^Verify\\.\\.\\.$")
	public void verify()  {
	    
	   
	}

	@Then("^Close application")
	public void closeApplication() {
		driver.quit();
	}
	@When("^Input to Username textbox with \"([^\"]*)\"$")
	public void inputToUsernameTextboxWith(String password) {
		driver.findElement(By.id("pass")).clear();
	    driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("^Input to Password textbox with \"([^\"]*)\"$")
	public void inputToPasswordTextboxWith(String email){
		driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys(email);
	   
	    
	}

}

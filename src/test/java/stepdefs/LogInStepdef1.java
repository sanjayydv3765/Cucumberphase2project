package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class LogInStepdef1 {
	WebDriver driver = Hooks1.driver;

	@Given("^I have launched the application$")
	public void i_have_launched_the_application() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	}

	@When("I enter the correct username and password")
	public void i_enter_the_correct_username_and_password() {
		WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys("secret_sauce");
	}

	@When("^I enter the incorrect username and password$")
	public void i_enter_the_incorrect_username_and_password() {
		WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys("secresauce");
	}

	@Then("^I should land on the home page$")
	public void i_should_land_on_the_home_page() throws Throwable {
		throw new PendingException();
	}

	
	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message_something(String string) {
		WebElement error = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		String ActError = error.getText();
		String ExpError="Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(ExpError, ActError);
	}

	@And("I click on the LOGIN Button$")
	public void i_click_on_the_login_button()  {
		WebElement LogInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		LogInBtn.click();
	}

	@When("I enter the username as {string} and Password as {string}")
	public void i_enter_the_username_as_and_Password_as(String UserNameVal, String PwdVal) {
		// Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		username.sendKeys(UserNameVal);
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys(PwdVal);

	}

	@When("I click on the Login Button")
	public void i_click_on_the_Login_Button() {
		// Write code here that turns the phrase above into concrete actions

	}

}

package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;
	
	@Given("user has navigated to login page")
	public void user_has_navigated_to_login_page() throws InterruptedException {
		driver=Browser.getDriver();
		driver.get("http://192.168.2.55:8081");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		Thread.sleep(1000);
	}

	@When("user enters valid email address {string} into email field")
	public void user_enters_valid_email_address_into_email_field(String emailText) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys(emailText);
	}

	@When("user entered valid password {string} into password field")
	public void user_entered_valid_password_into_password_field(String passwordText) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(passwordText);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
	}

	@Then("user should get successfully logged in")
	public void user_should_get_successfully_logged_in() {

	}

	@When("user enters invalid email address {string} into email field")
	public void user_enters_invalid_email_address_into_email_field(String invalidEmailText)throws InterruptedException {
		 Thread.sleep(1000);
		 driver.findElement(By.name("email")).sendKeys(invalidEmailText);
		 Thread.sleep(1000);
	}

	@When("user entered invalid password {string} into password field")
	public void user_entered_invalid_password_into_password_field(String invalidPasswordText)throws InterruptedException {
		 Thread.sleep(1000);
		 driver.findElement(By.name("password")).sendKeys(invalidPasswordText);
		 Thread.sleep(1000);
	}

	@Then("user should get a proper warning message about credentials mismatch")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() throws InterruptedException {
		Thread.sleep(1000);
		String b=driver.findElement(By.id("feedbackSection")).getText(); 
		Assert.assertEquals("Invalid Credentials", b);
		Thread.sleep(1000);
	}

	@When("user dont entered email address into email field")
	public void user_dont_entered_email_address_into_email_field() throws InterruptedException {
		
		
	}

	@Then("user should get a proper warning message about credentials required")
	public void user_should_get_a_proper_warning_message_about_credentials_required() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertEquals("Username is required!",driver.findElement(By.xpath("//input[@data-original-title='Username is required!']")).getAttribute("data-original-title"));
		Thread.sleep(1000);
	}
	@When("user didnot enter password field")
	public void user_didnot_enter_password_field() {
		
	}
	@When("user didnt entered email address into email field")
	public void user_didnt_entered_email_address_into_email_field() throws InterruptedException {

	}
	@Then("user should get a proper warning message about password required")
	public void user_should_get_a_proper_warning_message_about_password_required() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertEquals("Password is required!",driver.findElement(By.xpath("//input[@data-original-title='Password is required!']")).getAttribute("data-original-title"));

		Thread.sleep(1000);
	}
}

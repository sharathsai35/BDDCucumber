package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import browser.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class addgroupindashboard {

WebDriver driver;
	
	@Given("user has navigated to the login page")
	public void user_has_navigated_to_the_login_page() throws InterruptedException {
		driver=Browser.getDriver();
		driver.get("http://192.168.2.55:8081");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		Thread.sleep(1000);
	}

	@When("user enters valid email address {string} into email fields")
	public void user_enters_valid_email_address_into_email_fields(String emailText) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys(emailText);
	}

	@When("user entered valid password {string} into password fields")
	public void user_entered_valid_password_into_password_field(String passwordText) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(passwordText);
	}

	@When("user clicks on login buttons")
	public void user_clicks_on_login_buttons() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
	}
	
	@Then("user should get successfully loggedin")
	public void user_should_get_successfully_loggedin() throws InterruptedException {
Thread.sleep(500);
	}
	
	@And("click on dashboard option")
	public void click_on_dashboard_option() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-app='dashboard']"));
		Thread.sleep(1000);
		
	}
	
	@And("click on add group tabss")
	public void click_on_add_group_tabss() throws InterruptedException {
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='7']"));
	    Thread.sleep(1000);
	}
	
	
	@And("clicks on add group button")
	public void clicks_on_add_group_button() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-group-btn']"));
	    Thread.sleep(1000);
		
	}
	
	@And("enter the group name")
	public void enter_the_group_name() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("New cucmber group1");   
        Thread.sleep(1000);
		
	}
	
	@And("enter the description")
	public void enter_the_description() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupDescriptionInput']")).sendKeys("New cucmber group1 description");   
        Thread.sleep(1000);	
	}
	
	
	@And("select the users in add group pages")
	public void select_the_users_in_add_group_pages() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-username='Browser']")).click();
        Thread.sleep(1000);	
		
	}
	
	
	@And("click on create button")
	public void click_on_create_button() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
        Thread.sleep(1000);	
		
	}
	
	
	@Then("validate the toast msg of the adding group")
	public void validate_the_toast_msg_of_the_adding_group() throws InterruptedException {

		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Group created successfully", a);
        Thread.sleep(1000);	
		
	}
	
	@And("Dont enter group name")
	public void Dont_enter_group_name() {

	}
	@Then("validate the toast msg of the without entering group name")
	public void validate_the_toast_msg_of_the_without_entering_group_name() throws InterruptedException {

		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Please enter group name", a);
        Thread.sleep(1000);	
		
	}
	
	@And("click on add group tabs")
	public void click_on_add_group_tabs() {

	}
	
	@And("Dont select users")
	public void Dont_enter_users() {

	}
	
	@Then("validate the toast msg of the without adding users")
	public void validate_the_toast_msg_of_the_without_adding_users() throws InterruptedException {

		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Minimum 1 users are required for creating a group!", a);
        Thread.sleep(1000);	
		
	}
	
	
	@And("click on the airtime group button")
	public void click_on_the_airtime_group_button() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='airtimeGroupCheckbox']")).click();
        Thread.sleep(1000);	
	}

	@And("Enter the group name with more than firty characters")
	public void Enter_the_group_name_with_more_than_firty_characters() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("ftjcgfxtjgcygjftgtxhxtdhjdtjxtjtvjxdrfhyrdfhdxfhtdxfhjtfj");   
        Thread.sleep(1000);
	}
	
	@Then("validate the toast msg of the adding group with more than firty characters")
	public void validate_the_toast_msg_of_the_adding_group_with_more_than_firty_characters() throws InterruptedException {

		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Group Name should be maximum of 50 characters", a);
        Thread.sleep(1000);	
		
	}
	
	@And("enter less than 3 characters in the group name")
	public void enter_less_than_3_characters_in_the_group_name() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("ftjcgfxtjgcygjftgtxhxtdhjdtjxtjtvjxdrfhyrdfhdxfhtdxfhjtfj");   
        Thread.sleep(1000);
	}
	
	@Then("it should dispay validation messageas group name should be minimum of 3 characters")
	public void it_should_dispay_validation_messageas_group_name_should_be_minimum_of_3_characters() throws InterruptedException {

		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Group Name should be minimum of 3 characters", a);
        Thread.sleep(1000);	
		
	}
	
	
	@And("try to enter more that 80 characters in group description")
	public void try_to_enter_more_that_80_characters_in_group_description() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("it should not allow more than 80 charactersand should dispay the characters left");   
        Thread.sleep(1000);
	}
	
	@Then("it should not allow more than 80 characters and should dispay the characters left as 0")
	public void it_should_not_allow_more_than_80_characters_and_should_dispay_the_characters_left_as_0() throws InterruptedException {

		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='groupDescriptionInputCharactersCount']")).getText();
		Assert.assertEquals("Characters Left 0", a);
        Thread.sleep(1000);	
		
	}
	
	@And("click on remove button")
	public void click_on_remove_button() throws InterruptedException {

		Thread.sleep(1000);
		WebElement a=driver.findElement(By.xpath("(//div[@data-removestatus=1])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(a).build().perform();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[@class='remove-selected-group-user']")).click();
	}
	
	@Then("it should remove the selected user")
	public void it_should_remove_the_selected_user() throws InterruptedException {

		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='addGroupSelectedMembersCount']")).getText();
		Assert.assertEquals("(0)", a);
        Thread.sleep(1000);	
		
	}
	
	@And("click on admin button")
	public void click_on_admin_button() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='group-member-admin active'])[1]")).click();
        Thread.sleep(1000);
	}
	
	@Then("it should dispay toaste msg as please ensure group has atleast one admin")
	public void it_should_dispay_toaste_msg_as_please_ensure_group_has_atleast_one_admin() throws InterruptedException {

		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Please ensure group has atleast one admin!", a);
        Thread.sleep(1000);	
		
	}
	
	
	@And("click on moderator button")
	public void click_on_moderator_button() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='group-member-moderator'])[1]")).click();
        Thread.sleep(1000);
	}
	
	@Then("it should dispay toaste msg as group created successfully and make the selected user as moderator")
	public void it_should_dispay_toaste_msg_as_group_created_successfully_and_make_the_selected_user_as_moderator() throws InterruptedException {

		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Group created successfully", a);
        Thread.sleep(1000);
		
	}
	
	
	@And("clik on close icon")
	public void clik_on_close_icon() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='content-close-btn']")).click();
        Thread.sleep(1000);
	}
	
	@Then("it should close the add group window")
	public void it_should_close_the_add_group_window() throws InterruptedException {

		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='add-group-btn']")).getAttribute("class");
		Assert.assertEquals("add-group-btn", a);
        Thread.sleep(1000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import browser.Browser;
import io.cucumber.java.en.And;
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
	@Then("click on user")
	public void click_on_user() throws InterruptedException {
		driver.findElement(By.xpath("//div[@data-name='kirancucumtest3']")).click();
		Thread.sleep(1000);
	}

	@Then("user enters text message")
	public void user_enters_text_message() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
	}

	@Then("click on send button")
	public void click_on_send_button() throws InterruptedException {
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
	}

	@And("validate the msg")
	public void validate_the_msg() throws InterruptedException {
		Thread.sleep(1000);
		String aa=driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		Assert.assertEquals("test" , aa );
	}

	@Then("click on rightclick")
	public void click_on_rightclick() {
		Actions ac=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//div[@class='conversation-message']"));
		ac.contextClick(e).perform();
	}

	@Then("click on forward")
	public void click_on_forward() {
		driver.findElement(By.xpath("//a[@data-action='forward']")).click();
	}

	@Then("click on forward button")
	public void click_on_forward_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).click();
		Thread.sleep(1000);
	}

	@Then("select the users and groups")
	public void select_the_users_and_groups() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='forwardUser_1568-2']")).click();
		Thread.sleep(1000);
	}

	@Then("click on send button in forward page")
	public void click_on_send_button_in_forward_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='modalForwardSendMessageBtn']")).click();
		Thread.sleep(1000);
	}
	
	@Then("click on recall")
	public void click_on_recall() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//a[@data-action='recall']")).click();
	  Thread.sleep(1000);
	}

	@Then("click on recall button")
	public void click_on_recall_button() throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		  Thread.sleep(1000);
	}

	@Then("click on yes button in popup msg")
	public void click_on_yes_button_in_popup_msg() throws InterruptedException {
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@id='recallConfirmationYesBtn']")).click();
		  Thread.sleep(1000);
	}
	
	@Then("validate the recall msg")
	public void validate_the_recall_msg() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertEquals("Message Recalled!", driver.findElement(By.xpath("//div[@id='snackbar']")).getText());
		String recall= driver.findElement(By.xpath("//div[@class='recall-conversation-text']")).getText();
		Assert.assertEquals("You recalled this message", recall);
		Thread.sleep(1000);
	}
	@Then("click on delete")
	public void click_on_delete() throws InterruptedException {
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@data-action='delete']")).click();
		  Thread.sleep(1000);
	}

	@Then("click on delete button")
	public void click_on_delete_button() throws InterruptedException {
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[@id='deleteMessageSendBtn']")).click();
		  Thread.sleep(1000);
	}

	@Then("click on yes button in delete popup msg")
	public void click_on_yes_button_in_delete_popup_msg() throws InterruptedException {
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@id='deleteConfirmationYesBtn']")).click();
		  Thread.sleep(1000);
	}

	@Then("validate the toast msg of delete")
	public void validate_the_toast_msg_of_delete() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertEquals("Message Deleted!", driver.findElement(By.xpath("//div[@id='snackbar']")).getText());
	}
	
	@Then("click on edit")
	public void click_on_edit() throws InterruptedException {
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@data-action='edit']")).click();
		  Thread.sleep(1000);
	}

	@Then("Edit the message")
	public void edit_the_message() {
	   String editcon=driver.findElement(By.xpath("//div[@class='chat-edit-message-wrapper']")).getText();
	   Assert.assertEquals("Me\n"
	   		+ "test", editcon);
	}

	@Then("validate the edited icon")
	public void validate_the_edited_icon() {
		String editicon=driver.findElement(By.xpath("//span[@class='edited-conversation-icon']")).getAttribute("class");
		Assert.assertEquals("edited-conversation-icon", editicon);
	}
	
	@Then("click on copy")
	public void click_on_copy() throws InterruptedException {
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//a[@data-action='copy']")).click();
		  Thread.sleep(1000);
	}

	@Then("click on copy button")
	public void click_on_copy_button() throws InterruptedException {
		  Thread.sleep(1000);
	   driver.findElement(By.xpath("//span[@id='copyMessageSendBtn']")).click();
	}

	@Then("validate the toast msg of copy")
	public void validate_the_toast_msg_of_copy() throws InterruptedException {
//		Thread.sleep(2000);  
//		Assert.assertEquals("Copied !", driver.findElement(By.xpath("//div[@id='snackbar']")).getText());
	}
	
	@Then("click on reply")
	public void click_on_reply() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//a[@data-action='reply']")).click();
	}
	
	@Then("validate reply con")
	public void validate_reply_con() throws InterruptedException {
	   Thread.sleep(1000);
	   String reply=driver.findElement(By.xpath("//div[@class='chat-reply-message-wrapper']")).getAttribute("class");
	   Assert.assertEquals("chat-reply-message-wrapper", reply);
	}
	
	@Then("click on flag")
	public void click_on_flag() throws InterruptedException {
		  Thread.sleep(1000);
		   driver.findElement(By.xpath("//a[@data-action='flag']")).click();
	}

	@Then("validate flag icon")
	public void validate_flag_icon() throws InterruptedException {
	   Thread.sleep(1000);
	   String flag=driver.findElement(By.xpath("//span[@class='flag-conversation-label-icon']")).getAttribute("class");
	   Assert.assertEquals("flag-conversation-label-icon", flag);
	}
	
	@Then("click on pin")
	public void click_on_pin() throws InterruptedException {
		  Thread.sleep(1000);
		   driver.findElement(By.xpath("//a[@data-action='pin']")).click();
	}

	@Then("validate pin icon")
	public void validate_pin_icon() throws InterruptedException {
		  Thread.sleep(1000);
		   String flag=driver.findElement(By.xpath("//span[@class='pin-conversation-label-icon']")).getAttribute("class");
		   Assert.assertEquals("pin-conversation-label-icon", flag);
	}
	
	@Then("click on info")
	public void click_on_info() throws InterruptedException {
		  Thread.sleep(1000);
		   driver.findElement(By.xpath("//a[@data-action='info']")).click();
	}

	@Then("validate info page")
	public void validate_info_page() throws InterruptedException {
		Thread.sleep(1000);
	   String info= driver.findElement(By.xpath("//div[@class='message-info-wrapper']")).getAttribute("class");
	   Assert.assertEquals("message-info-wrapper", info);
	}
	
	@Then("click on close button")
	public void click_on_close_button() throws InterruptedException {
		 Thread.sleep(1000);
		   driver.findElement(By.xpath("//span[@id='messageInfoModalCloseBtn']")).click();
		   Thread.sleep(1000);
	}
	
	@Then("click on forkout icon")
	public void click_on_forkout_icon() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
	}
	
	@Then("select the users and groups in forkout")
	public void select_the_users_and_groups_in_forkout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='forkoutUser-1-50-1']")).click();
		driver.findElement(By.xpath("//label[@for='forkoutUser-1-1568-2']")).click();
	}
	
	@Then("Validate the forkout icon with msg")
	public void validate_the_forkout_icon_with_msg() throws InterruptedException {
		Thread.sleep(1000);
		String forkout=driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
		Assert.assertEquals("forkout-conversation-label-icon", forkout);
	}
	
	@Then("click on read receipt icon in user chat")
	public void click_on_read_receipt_icon_in_user_chat() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
	  Thread.sleep(1000);
	}

	@Then("validate the read receipt icon")
	public void validate_the_read_receipt_icon() throws InterruptedException {
		Thread.sleep(1000);
		String readreceipt=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("class");
		Assert.assertEquals("read-receipt-chat-button", readreceipt);
	}

	@Then("click on group")
	public void click_on_group() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='desktop bridge']")).click();
	}

	@Then("group enters text message")
	public void group_enters_text_message() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
	}

	@Then("click on read recipt icon in group chat")
	public void click_on_read_recipt_icon_in_group_chat() throws InterruptedException {
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='input-read-receipt-btn input-action-btn']")).click();
		Thread.sleep(1000);
	}

	@Then("select the users")
	public void select_the_users() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='readReceipt-94-1']")).click();
		Thread.sleep(1000);
	}
	
	@Then("click on select all checkbox")
	public void click_on_select_all_checkbox() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='readReceiptSelectAllCheckbox']")).click();
		Thread.sleep(1000);
	}
	
	@Then("click on code snippet icon")
	public void click_on_code_snippet_icon() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-code-btn input-action-btn']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the code snippet")
	public void validate_the_code_snippet() throws InterruptedException {
		Thread.sleep(1000);
		String codesnippet=driver.findElement(By.xpath("//div[@class='code-snippet-wrapper']")).getAttribute("class");
		Assert.assertEquals("code-snippet-wrapper", codesnippet);
	}

	@Then("click on voice message icon")
	public void click_on_voice_message_icon() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-microphone-btn input-action-btn']")).click();
	}

	@Then("record the voice message")
	public void record_the_voice_message() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='selectMicrophoneDeviceBtn']")).click();
		Thread.sleep(5000);
	}

	@Then("validate the voice message")
	public void validate_the_voice_message() throws InterruptedException {
		Thread.sleep(1000);
		String voicemessage=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		Assert.assertEquals("audio-attachment-wrapper", voicemessage);
	}

	@Then("click on dashboard")
	public void click_on_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-app='dashboard']")).click();
		Thread.sleep(1000);
	}

	@Then("click on add group tab")
	public void click_on_add_group_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@data-tab='7']")).click();
		Thread.sleep(1000);
	}

	@Then("click on add group button")
	public void click_on_add_group_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='createGroupBtn']")).click();
		Thread.sleep(1000);
	}

	@Then("Enter group name")
	public void enter_group_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("group dashboard");
		Thread.sleep(1000);
	}

	@Then("enter description")
	public void enter_description() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupDescriptionInput']")).sendKeys("automation testing group");
		Thread.sleep(1000);
	}

	@Then("select the users in add group page")
	public void select_the_users_in_add_group_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-username='Amit Bhatia']")).click();
		driver.findElement(By.xpath("//div[@data-username='Browser']")).click();
		Thread.sleep(1000);
	}

	@Then("click on create")
	public void click_on_create() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
	}

	@Then("validate the toast msg of adding group")
	public void validate_the_toast_msg_of_adding_group() throws InterruptedException {
		Thread.sleep(1000);
		String addgroup=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Group created successfully", addgroup);
	}
	
	@Then("Dont enter the group name")
	public void dont_enter_the_group_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("");
	}

	@Then("validate the toast msg of without entering group name")
	public void validate_the_toast_msg_of_without_entering_group_name() throws InterruptedException {
		Thread.sleep(1000);
		String addgroup=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Please enter group name", addgroup);
	}
	
	@Then("Dont select the users")
	public void dont_select_the_users() throws InterruptedException {
	   Thread.sleep(1000);
	}
	
	@Then("validate the toast msg of without adding users")
	public void validate_the_toast_msg_of_without_adding_users() throws InterruptedException {
		Thread.sleep(1000);
		String addgroup=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Minimum 1 users are required for creating a group!", addgroup);
	}
	
	@Then("click on airtime group button")
	public void click_on_airtime_group_button() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//label[@for='airtimeGroupCheckbox']")).click();
	}
	
	@Then("Enter group name with more than firty characters")
	public void enter_group_name_with_more_than_firty_characters() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("daf dsaf dfas fasdf dsaf dsaf dfs fdsf dsfds fdf dsaf dsf dsaf fdsafsdf fdsaffdsf dsaf dsfdf sdf sfdsdf fsadegfgfgb dvxgg fgag");
	}
	
	@Then("validate the toast msg of adding group with more than firty characters")
	public void validate_the_toast_msg_of_adding_group_with_more_than_firty_characters() throws InterruptedException {
		Thread.sleep(1000);
		String addgroup=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Group Name should be maximum of 50 characters", addgroup);
	}
	
	@Then("click on profile pic")
	public void click_on_profile_pic() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.switchTo().frame(0);
	   driver.findElement(By.xpath("//*[@id=\"groupAttachment\"]")).click();
	   Thread.sleep(1000);
	}

	@Then("attach the attachment")
	public void attach_the_attachment() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("validate the profile pic")
	public void validate_the_profile_pic() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}

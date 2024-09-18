package stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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
		driver.switchTo().frame(0);
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
	public void validate_the_profile_pic() throws InterruptedException {
		Thread.sleep(1000);
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
	public void Dont_enter_group_name() throws InterruptedException {
		Thread.sleep(500);
	}
	
	@Then("validate the toast msg of the without entering group name")
	public void validate_the_toast_msg_of_the_without_entering_group_name() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Please enter group name", a);
		Thread.sleep(1000);	
	}

	@And("click on add group tabs")
	public void click_on_add_group_tabs() throws InterruptedException {
		Thread.sleep(1000);
	}

	@And("Dont select users")
	public void Dont_enter_users() throws InterruptedException {
		Thread.sleep(500);
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

	@Then("click on add button")
	public void click_on_add_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		Thread.sleep(1000);
	}

	@Then("click on add group in recent chat page")
	public void click_on_add_group_in_recent_chat_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
	}

	@Then("Validate the add group")
	public void validate_the_add_group() throws InterruptedException {
		Thread.sleep(1000);
		String group=driver.findElement(By.xpath("//div[@class='tab active']")).getText();
		Assert.assertEquals("", group);
	}

	@Then("Enter group name in add group")
	public void enter_group_name_in_add_group() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("test");
		Thread.sleep(1000);
	}

	@Then("click on create button in add group")
	public void click_on_create_button_in_add_group() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the toast msg")
	public void validate_the_toast_msg() throws InterruptedException {
		Thread.sleep(1000);
		String toastmsg= driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Group created successfully", toastmsg);
	}

	@Then("validate the toast msg for without group name")
	public void validate_the_toast_msg_for_without_group_name() throws InterruptedException {
		Thread.sleep(1000);
		String toastmsg= driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Please enter group name", toastmsg); 
	}
	
	@Then("Enter group name more than 100 characters in add group")
	public void enter_group_name_more_than_100_characters_in_add_group() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("testtesttesttesttest test test test test test test test test test test test test test test test test test");
		Thread.sleep(1000);
	}
	
	@Then("validate the toast msg for without group name more than 100 characters")
	public void validate_the_toast_msg_for_with_group_name_more_than_100_characters() throws InterruptedException {
		Thread.sleep(1000);
		String toastmsg= driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Group Name should be maximum of 100 characters", toastmsg); 
	}
	
	@Then("Enter group name with 1 characters in add group")
	public void enter_group_name_with_1_characters_in_add_group() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("1");
		Thread.sleep(1000);
	}
	
	@Then("validate the toast msg for without group name with 1 characters")
	public void validate_the_toast_msg_for_with_group_name_with_1_characters() throws InterruptedException {
		Thread.sleep(1000);
		String toastmsg= driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Group Name should be minimum of 3 characters", toastmsg); 
	}
	
	@Then("Enter description in add group")
	public void enter_description_in_add_group() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupDescriptionInput']")).sendKeys("test");
		Thread.sleep(1000);
	}
	
	@Then("select the users in add group")
	public void select_the_users_in_add_group() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-username='abcd']")).click();
		driver.findElement(By.xpath("//div[@data-username='Amit Bhatia']")).click();
	}
	
	@Then("Count the users")
	public void Count_the_users() throws InterruptedException {
		Thread.sleep(1000);
		String count= driver.findElement(By.xpath("//span[text()='Selected Members']")).getText();
		String count1=driver.findElement(By.xpath("//span[@id='addGroupSelectedMembersCount']")).getText();
		Assert.assertEquals("Selected Members", count);
		Assert.assertEquals("(3)", count1);
	}
	
	@Then("Click on profile pic in add group")
	public void Click_on_profile_pic_in_add_group() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"groupAttachment\"]"));
		Thread.sleep(1000);
	}

	@Then("Validate the profile pic in add group")
	public void Validate_the_profile_pic_in_add_group() throws InterruptedException {
		Thread.sleep(1000);
	}
//Add user & Add user with optional details & Add Orange user	
	@Then("click on add user button")
	public void click_on_add_user_button() throws InterruptedException {
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@class='add-user-btn']")).click();
	 Thread.sleep(1000);
	}

	@Then("validate the add user page")
	public void validate_the_add_user_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		String adduser=driver.findElement(By.xpath("//span[@class='header-text']")).getText();
		Assert.assertEquals("ADD USER", adduser);
	}

	@Then("click on add employee button")
	public void click_on_add_employee_button() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.switchTo().frame(0);
	   driver.findElement(By.xpath("//input[@id='addMemberSubmitBtn']")).click();
	}

	@Then("validate the toast msg without entering details")
	public void validate_the_toast_msg_without_entering_details() throws InterruptedException {
	   Thread.sleep(100);
	   String adduser1=driver.findElement(By.xpath("//input[@id='addMemberNameInput']")).getAttribute("data-original-title");
	   Assert.assertEquals("Please enter name", adduser1);
	}
	
	@Then("enter username")
	public void enter_username() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//input[@id='addMemberNameInput']")).sendKeys("rahul");
	  Thread.sleep(1000);
	}
	
	@Then("click on add employee button in add user")
	public void click_on_add_employee_button_in_add_user() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='addMemberSubmitBtn']")).click();
	}
	
	@Then("validate the toast msg with entering username")
	public void validate_the_toast_msg_with_entering_username() throws InterruptedException {
	   Thread.sleep(100);
	   String adduser1=driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).getAttribute("data-original-title");
	   Assert.assertEquals("Please enter email", adduser1);
	}
	
	@Then("enter email")
	public void enter_email() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).sendKeys("rahul22@tm.com");
	  Thread.sleep(1000);
	}
	
	@Then("validate the toast msg with entering details")
	public void validate_the_toast_msg_with_entering_details() throws InterruptedException {
	   Thread.sleep(1000);
	   String adduser1=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
	   Assert.assertEquals("Employee added successfully", adduser1);
	}
	
	@Then("enter duplicate email")
	public void enter_duplicate_email() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).sendKeys("rahul@tm.com");
	  Thread.sleep(1000);
	}
	
	@Then("validate the toast msg with entering duplicate details")
	public void validate_the_toast_msg_with_entering_duplicate_details() throws InterruptedException {
	   Thread.sleep(1000);
	   String adduser1=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
	   Assert.assertEquals("Employee email already exists", adduser1);
	}
	
	@Then("enter invalid email")
	public void enter_invalid_email() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).sendKeys("asdffsdaf");
	  Thread.sleep(1000);
	}
	
	@Then("validate the toast msg with entering invalid email")
	public void validate_the_toast_msg_with_entering_invalid_email() throws InterruptedException {
	   Thread.sleep(100);
	   String adduser1=driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).getAttribute("data-original-title");
	   Assert.assertEquals("Please enter a valid email", adduser1);
	}
	
	@Then("enter email in add user")
	public void enter_email_in_add_user() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).sendKeys("rahul21@tm.com");
	  Thread.sleep(1000);
	}
	
	@Then("enter email in add user1")
	public void enter_email_in_add_user1() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).sendKeys("rahul20@tm.com");
	  Thread.sleep(1000);
	}
	
	@Then("click on add button in department")
	public void click_on_add_button_in_department() throws InterruptedException {
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@id='addMemberDepartmentInput']")).click();
	}

	@Then("create the new department name")
	public void create_the_new_department_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Create new Department']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@class='form-control department-input']")).sendKeys("asdas");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@class='btn btn-success submit-btn']")).click();
	}

	@Then("validate the toast msg of adding department name")
	public void validate_the_toast_msg_of_adding_department_name() throws InterruptedException {
		Thread.sleep(1000);
		String adddepatrment=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Department added successfully", adddepatrment);
	}

	@Then("click on add button in designation")
	public void click_on_add_button_in_designation() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberDesignationInput']")).click();
	}

	@Then("create the new designation name")
	public void create_the_new_designation_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Create new Designation']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@class='form-control designation-input']")).sendKeys("asdc");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//select[@id='departmentSelection'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//option[@value='6'])[4]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@class='btn btn-success submit-btn'])[2]")).click();
	}

	@Then("validate the toast msg of adding designation name")
	public void validate_the_toast_msg_of_adding_designation_name() throws InterruptedException {
		Thread.sleep(1000);
		String adddesignation=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Designation added successfully", adddesignation);
	}

	@Then("click on add button in location")
	public void click_on_add_button_in_location() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberLocationInput']")).click();
	}

	@Then("create the new location name")
	public void create_the_new_location_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Create new Location']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@class='form-control label-input']")).sendKeys("sddd");
		Thread.sleep(500);
		driver.findElement(By.xpath("//textarea[@class='form-control address-input']")).sendKeys("madhapur");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@class='form-control city-input']")).sendKeys("hyderabad");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@class='form-control state-input']")).sendKeys("telangana");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@class='form-control country-input']")).sendKeys("india");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@class='btn btn-success submit-btn'])[3]")).click();
	}

	@Then("validate the toast msg of adding location name")
	public void validate_the_toast_msg_of_adding_location_name() throws InterruptedException {
		Thread.sleep(1000);
		String addlocation=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Location Added successfully", addlocation);
	}

	@Then("Enter mobile number")
	public void enter_mobile_number() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberMobileInput']")).sendKeys("9999911112");
	}

	@Then("Enter employee label")
	public void enter_employee_label() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberLabelInput']")).sendKeys("TA-1231");
	}
	
	@Then("enter orange user email in add user")
	public void enter_orange_user_email_in_add_user() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).sendKeys("rahulorange12@tm.com");
	   Thread.sleep(1000);
	}

	@Then("click on orange user checkbox")
	public void click_on_orange_user_checkbox() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberOrangeMemberCheckbox']")).click();
		Thread.sleep(1000);
	}
	
	@Then("click on next button in add user")
	public void click_on_next_button_in_add_user() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberNextBtn']")).click();
	}

	@Then("click on save button in permission page")
	public void click_on_save_button_in_permission_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberPermissionSubmitBtn']")).click();
		Thread.sleep(500);
	}
	
	@Then("validate the toast msg with entering orange details")
	public void validate_the_toast_msg_with_entering_orange_details() throws InterruptedException {
	   Thread.sleep(1000);
	   String adduser1=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
	   Assert.assertEquals("Employee email already exists", adduser1);
	}
	
	@Then("enter user email in add user")
	public void enter_user_email_in_add_user() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).sendKeys("rahul141@tm.com");
		Thread.sleep(1000);
	}

	@Then("click on role checkbox")
	public void click_on_role_checkbox() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='customRoleCheckBox-15']")).click();
	}
//Edit user
	@Then("click on 3 dots in add user")
	public void click_on_3_dots_in_add_user() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.switchTo().frame(0);
	   driver.findElement(By.xpath("(//div[@class='member-options-button'])[3]")).click();
	   Thread.sleep(1000);
	}

	@Then("click on edit button")
	public void click_on_edit_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='member-option'])[10]")).click();
		Thread.sleep(1000);
	}

	@Then("validate the edit user page")
	public void validate_the_edit_user_page() throws InterruptedException {
	    Thread.sleep(1000);
	    String edituser=driver.findElement(By.xpath("(//span[@class='header-text'])[1]")).getText();
	    Assert.assertEquals("EDIT USER", edituser);
	}
	
	@Then("clear the username and edit the user name")
	public void clear_the_username_and_edit_the_user_name() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='addMemberNameInput']")).clear();
	  driver.findElement(By.xpath("//input[@id='addMemberNameInput']")).sendKeys("Amit Bhatia");
	}

	@Then("click on save employee")
	public void click_on_save_employee() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='addMemberSubmitBtn']")).click();
	}

	@Then("validate the edited user toast msg")
	public void validate_the_edited_user_toast_msg() throws InterruptedException {
		Thread.sleep(1000);
		String editeduser=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Updated", editeduser);
	}
	
	@Then("clear the email and edit the email")
	public void clear_the_email_and_edit_the_email() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).clear();
	  driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).sendKeys("amit.bhatiya@tvisha.com");
	}
	
	@Then("click on 3 dots in add user1")
	public void click_on_3_dots_in_add_user1() throws InterruptedException {
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class='member-options-button'])[5]")).click();
		Thread.sleep(1000);
	}

	@Then("click on edit button for selected user")
	public void click_on_edit_button_for_selected_user() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='member-option'])[16]")).click();
		Thread.sleep(1000);
	}

	@Then("edit the department")
	public void edit_the_department() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberDepartmentInput']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='optional-info-text']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='addMemberDepartmentInput']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@data-text='Technical'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("edit the designation")
	public void edit_the_designation() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberDesignationInput']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@data-text='Developer']")).click();
		Thread.sleep(1000);
	}

	@Then("edit the location")
	public void edit_the_location() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberLocationInput']")).clear();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='optional-info-text']")).click();
		driver.findElement(By.xpath("//input[@id='addMemberLocationInput']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@data-text='adsfds']")).click();
		Thread.sleep(1000);
	}

	@Then("edit the mobile number")
	public void edit_the_mobile_number() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberMobileInput']")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='addMemberMobileInput']")).sendKeys("9911991199");
		Thread.sleep(1000);
	}

	@Then("edit the employee label")
	public void edit_the_employee_label() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberLabelInput']")).clear();
		driver.findElement(By.xpath("//input[@id='addMemberLabelInput']")).sendKeys("B.Tech");
		Thread.sleep(1000);
	}
	
	@Then("click on 3 dots in orange user")
	public void click_on_3_dots_in_orange_user() throws InterruptedException {
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class='member-options-button'])[1]")).click();
		Thread.sleep(1000);
	}

	@Then("click on edit button for orange user")
	public void click_on_edit_button_for_orange_user() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='member-option'])[2]")).click();
		Thread.sleep(1000);
	}

	@Then("edit the orange username")
	public void edit_the_orange_username() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberNameInput']")).clear();
		driver.findElement(By.xpath("//input[@id='addMemberNameInput']")).sendKeys(".*");
		Thread.sleep(1000);
	}

	@Then("Click on next button")
	public void click_on_next_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberNextBtn']")).click();
		Thread.sleep(1000);
	}

	@Then("click on save button")
	public void click_on_save_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberPermissionSubmitBtn']")).click();
		Thread.sleep(1000);
	}
	
	@Then("edit the orange user email")
	public void edit_the_orange_user_email() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).clear();
		driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).sendKeys("23@tm.com");
		Thread.sleep(1000);
	}
	
	@Then("click on view button")
	public void click_on_view_button() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//div[@class='member-option'])[9]")).click();
	   Thread.sleep(1000);
	}

	@Then("validate the view user page")
	public void validate_the_view_user_page() throws InterruptedException {
		Thread.sleep(1000);
		String view=driver.findElement(By.xpath("(//span[@class='header-text'])[1]")).getText();
		Assert.assertEquals("VIEW USER", view);
	}
	
	@Then("click on resend invite")
	public void click_on_resend_invite() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='member-option'])[11]")).click();
		   Thread.sleep(1000);
	}

	@Then("validate the toast msg in resend invite")
	public void validate_the_toast_msg_in_resend_invite() throws InterruptedException {
		Thread.sleep(1000);
		String view=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Mail sent successfully!", view);
	}
	
	@Then("click on 3 dots in add user3")
	public void click_on_3_dots_in_add_user3() throws InterruptedException {
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class='member-options-button'])[11]")).click();
		Thread.sleep(1000);
	}

	@Then("click on deactivate button")
	public void click_on_deactivate_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='member-option'])[42]")).click();
		Thread.sleep(1000);
	}

	@Then("validate the toast msg for deactivated user")
	public void validate_the_toast_msg_for_deactivated_user() throws InterruptedException {
		Thread.sleep(1000);
		String view=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Status updated successfully!", view);
	}
	
	@Then("click on yes button in popup")
	public void click_on_yes_button_in_popup() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
	}
	
	@Then("click on no button in popup")
	public void click_on_no_button_in_popup() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
	}
	
	@Then("validate the user")
	public void validate_the_user() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	@Then("click on dropdown of actions")
	public void click_on_dropdown_of_actions() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//select[@id='membersFilterAction']")).click();
	  Thread.sleep(1000);
	}

	@Then("click on terminate")
	public void click_on_terminate() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='Terminate']")).click();
	}

	@Then("validate the toast msg for terminate")
	public void validate_the_toast_msg_for_terminate() throws InterruptedException {
		Thread.sleep(1000);
		String terminate=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Please select atleast one employee", terminate);
	}
	
	@Then("select the user checkbox")
	public void select_the_user_checkbox() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.switchTo().frame(0);
	   driver.findElement(By.xpath("(//div[@class='custom-checkbox-wrapper'])[7]")).click();
	   Thread.sleep(1000);
	}
	
	@Then("click on dropdown of action")
	public void click_on_dropdown_of_action() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//select[@id='membersFilterAction']")).click();
	  Thread.sleep(1000);
	}

	@Then("validate the toast msg for terminating the user")
	public void validate_the_toast_msg_for_terminating_the_user() throws InterruptedException {
		Thread.sleep(1000);
		String terminate=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Status updated successfully!", terminate);
	}
	
	@Then("select no in popup")
	public void select_no_in_popup() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(1000);
	}

	@Then("select yes in popup")
	public void select_yes_in_popup() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
	}
	
	@Then("click on deactivate")
	public void click_on_deactivate() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='De-Activate']")).click();
	}

	@Then("validate the toast msg for deactivate")
	public void validate_the_toast_msg_for_deactivate() throws InterruptedException {
		Thread.sleep(1000);
		String terminate=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Please select atleast one employee", terminate);
	}

	@Then("validate the toast msg for deactivating the user")
	public void validate_the_toast_msg_for_deactivating_the_user() throws InterruptedException {
		Thread.sleep(1000);
		String terminate=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Status updated successfully!", terminate);
	}
//Search user list
	@Then("click on search in user list page")
	public void click_on_search_in_user_list_page() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='membersFilterSearchInput']")).click();
	   Thread.sleep(1000);
	}

	@Then("Enter the username in search")
	public void enter_the_username_in_search() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='membersFilterSearchInput']")).sendKeys("browser");
		Thread.sleep(1000);
	}

	@Then("validate the searched user")
	public void validate_the_searched_user() throws InterruptedException {
		Thread.sleep(1000);
		String user=driver.findElement(By.xpath("(//div[@class='table-row'])[2]")).getText();
		Assert.assertEquals("1\n"
				+ "BR\n"
				+ "Browser - B.Tech\n"
				+ "browser@tm.com\n"
				+ "Developer\n"
				+ "Android developer\n"
				+ "adsfds", user);
	}

	@Then("Enter the orange name in search")
	public void enter_the_orange_name_in_search() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='membersFilterSearchInput']")).sendKeys("orange");
		Thread.sleep(1000);
	}
	
	@Then("validate the searched orange user")
	public void validate_the_searched_orange_user() throws InterruptedException {
		Thread.sleep(1000);
		String user=driver.findElement(By.xpath("(//div[@class='table-row'])[2]")).getText();
		Assert.assertEquals("1\n"
				+ "DO\n"
				+ "Desktop Orange\n"
				+ "desktop@orange.com\n"
				+ "-\n"
				+ "-\n"
				+ "-", user);
	}
	
	@Then("click on dropdown of users and orange members")
	public void click_on_dropdown_of_users_and_orange_members() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//select[@id='membersFilterMembersSelection']")).click();
	   Thread.sleep(1000);
	}
	@Then("select the users and orange members")
	public void select_the_users_and_orange_members() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='Users + Orange members']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the users and orange members")
	public void validate_the_users_and_orange_members() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//option[text()='Users + Orange members']")).getText();
		Assert.assertEquals("Users + Orange members", a);
	}
	
	@Then("select the users in dropdown")
	public void select_the_users_in_dropdown() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//option[text()='Users']")).click();
	   Thread.sleep(1000);
	}
	
	@Then("validate the users")
	public void validate_the_users() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//option[text()='Users']")).getText();
		Assert.assertEquals("Users", a);
	}
	
	@Then("select the orange member in dropdown")
	public void select_the_orange_member_in_dropdown() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//option[text()='Orange members']")).click();
	   Thread.sleep(1000);
	}
	
	@Then("validate the orange member")
	public void validate_the_orange_member() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//option[text()='Orange members']")).getText();
		Assert.assertEquals("Orange members", a);
	}
	
	@Then("select the deactivated users and orange members in dropdown")
	public void select_the_deactivated_users_and_orange_members_in_dropdown() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//option[text()='De-activated Users + Orange Members']")).click();
	   Thread.sleep(1000);
	}
	
	@Then("validate the deactivated users and orange members")
	public void validate_the_deactivated_users_and_orange_members() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//option[text()='De-activated Users + Orange Members']")).getText();
		Assert.assertEquals("De-activated Users + Orange Members", a);
	}
	
	@Then("select the Ex users and Ex orange members in dropdown")
	public void select_the_Ex_users_and_Ex_orange_members_in_dropdown() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//option[text()='Ex-users + Ex-orange Members']")).click();
	   Thread.sleep(1000);
	}
	
	@Then("validate the Ex users and Ex orange members")
	public void validate_the_Ex_users_and_Ex_orange_members() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//option[text()='Ex-users + Ex-orange Members']")).getText();
		Assert.assertEquals("Ex-users + Ex-orange Members", a);
	}
	
	@Then("click on dropdown of department")
	public void click_on_dropdown_of_department() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='membersFilterDepartment']")).click();
		Thread.sleep(1000);
	}

	@Then("select the any department in dropdown")
	public void select_the_any_department_in_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='IOS developer']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the department list")
	public void validate_the_department_list() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@data-id='260']")).getText();
		Assert.assertEquals("1\n"
				+ "MD\n"
				+ "Manoj Desai\n"
				+ "manoj.desai@tvisha.com\n"
				+ "Developer\n"
				+ "IOS developer\n"
				+ "Delhi", a);
	}
	
	@Then("click on dropdown of designation")
	public void click_on_dropdown_of_designation() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='membersFilterDesignation']")).click();
		Thread.sleep(1000);
	}
	
	@Then("click on dropdown of designations")
	public void click_on_dropdown_of_designations() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='membersFilterDesignation']")).click();
		Thread.sleep(1000);
	}
	
	@Then("validate the designation list")
	public void validate_the_designation_list() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//option[text()='Designation']")).getText();
		Assert.assertEquals("Designation", a);
	}

	@Then("select the any designation in dropdown")
	public void select_the_any_designation_in_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='Developer']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the department and designation users list")
	public void validate_the_department_and_designation_users_list() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@data-id='260']")).getText();
		Assert.assertEquals("1\n"
				+ "MD\n"
				+ "Manoj Desai\n"
				+ "manoj.desai@tvisha.com\n"
				+ "Developer\n"
				+ "IOS developer\n"
				+ "Delhi", a);
	}
	
	@Then("click on dropdown of location")
	public void click_on_dropdown_of_location() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='membersFilterLocation']")).click();
		Thread.sleep(1000);
	}

	@Then("select the location")
	public void select_the_location() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='ab']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the location user list")
	public void validate_the_location_user_list() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@data-id='232']")).getText();
		Assert.assertEquals("1\n"
				+ "Hari (Orange)\n"
				+ "hari@orange.com\n"
				+ "Software Engineer\n"
				+ "Android developer\n"
				+ "ab", a);
	}
	
	@Then("select the department in dropdown")
	public void select_the_department_in_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='Android developer']")).click();
		Thread.sleep(1000);
	}

	@Then("select the designation in dropdown")
	public void select_the_designation_in_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='Developer']")).click();
		Thread.sleep(1000);
	}

	@Then("select the location in list")
	public void select_the_location_in_list() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='adsfds']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the combination user")
	public void validate_the_combination_user() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@data-id='3']")).getText();
		Assert.assertEquals("1\n"
				+ "BR\n"
				+ "Browser - B.Tech\n"
				+ "browser@tm.com\n"
				+ "Developer\n"
				+ "Android developer\n"
				+ "adsfds", a);
	}
	
	@Then("click on refresh button")
	public void click_on_refresh_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='reset-btn']")).click();
		Thread.sleep(1000);
    }

	@Then("validate the search field")
	public void validate_the_search_field() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//input[@id='membersFilterSearchInput']")).getText();
		Assert.assertEquals("", a);
	}
//home page
	@Then("click on home tab")
	public void click_on_home_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Home']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the home page")
	public void validate_the_home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='company-details-wrapper']")).getText();
		Assert.assertEquals("Tvisha\n"
				+ "Home Domain :\n"
				+ "www.tm.com", a);
	}
	
	@Then("click on user wrapper")
	public void click_on_user_wrapper() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='info-wrapper green']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the users tab page")
	public void validate_the_users_tab_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Users']")).getText();
		Assert.assertEquals("Users", a);
	}

	@Then("click on orange member wrapper")
	public void click_on_orange_member_wrapper() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='info-wrapper orange']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the orange member tab page")
	public void validate_the_orange_member_tab_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//option[text()='Orange members']")).getText();
		Assert.assertEquals("Orange members", a);
	}
	
	@Then("click on Ex users and Ex orange member wrapper")
	public void click_on_ex_users_and_ex_orange_member_wrapper() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='info-wrapper yellow']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the Ex users and Ex orange member tab page")
	public void validate_the_ex_users_and_ex_orange_member_tab_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//option[text()='Ex-users + Ex-orange Members']")).getText();
		Assert.assertEquals("Ex-users + Ex-orange Members", a);
	}
	
	@Then("click on groups wrapper")
	public void click_on_groups_wrapper() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='info-wrapper blue']")).click();
		Thread.sleep(1000);
	}

	@Then("validate the page")
	public void validate_the_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[text()='Home']")).getText();
		Assert.assertEquals("Home", a);
	}

	@Then("In exchange info change the dates")
	public void in_exchange_info_change_the_dates() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='date-filter-wrapper']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class='date-filter-option'])[6]")).click();
		Thread.sleep(1000);
	}

	@Then("validate the dates")
	public void validate_the_dates() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='exchange-info-container']")).getText();
		Assert.assertEquals("EXCHANGE INFO\n"
				+ "This Year\n"
				+ "MESSAGES\n"
				+ "2655\n"
				+ "FILES\n"
				+ "450\n"
				+ "IMAGES\n"
				+ "678\n"
				+ "VIDEOS\n"
				+ "266", a);
	}

	@Then("Add the user without entering data in home page")
	public void add_the_user_without_entering_data_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMembersSubmitBtn']")).click();
	}

	@Then("validate the toast msg of without entering user data in home page")
	public void validate_the_toast_msg_of_without_entering_user_data_in_home_page() throws InterruptedException {
		Thread.sleep(500);
		String a=driver.findElement(By.xpath("//input[@id='addMemberName']")).getAttribute("data-original-title");
		Assert.assertEquals("Please enter name", a);
	}
	
	@Then("Add the user without entering username in home page")
	public void add_the_user_without_entering_username_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberName']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='addMembersSubmitBtn']")).click();
	}

	@Then("validate the toast msg of without entering username in home page")
	public void validate_the_toast_msg_of_without_entering_username_in_home_page() throws InterruptedException {
		Thread.sleep(500);
		String a=driver.findElement(By.xpath("//input[@id='addMemberEmail']")).getAttribute("data-original-title");
		Assert.assertEquals("Please enter email", a);
	}
	
	@Then("Add the user with username and email in home page")
	public void add_the_user_with_username_and_email_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberName']")).sendKeys("kumar21");
		driver.findElement(By.xpath("//input[@id='addMemberEmail']")).sendKeys("kumar21@tm.com");
	}
	
	@Then("Add the user with username1 and email1 in home page")
	public void add_the_user_with_username1_and_email1_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberName']")).sendKeys("kumar20");
		driver.findElement(By.xpath("//input[@id='addMemberEmail']")).sendKeys("kumar20@tm.com");
	}
	
	@Then("Add the user with username2 and email2 in home page")
	public void add_the_user_with_username2_and_email2_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberName']")).sendKeys("kumar19");
		driver.findElement(By.xpath("//input[@id='addMemberEmail']")).sendKeys("kumar19@tm.com");
	}
	
	@Then("Add the user with username3 and email3 in home page")
	public void add_the_user_with_username3_and_email3_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberName']")).sendKeys("kumar18");
		driver.findElement(By.xpath("//input[@id='addMemberEmail']")).sendKeys("kumar18@tm.com");
	}
	
	@Then("click on add button in home page")
	public void click_on_add_button_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMembersSubmitBtn']")).click();
	}
	
	@Then("add the optional details")
	public void add_the_optional_details() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='addMemberDepartment']")).click();
		driver.findElement(By.xpath("//option[text()='IOS developer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='addMemberDesignation']")).click();
		driver.findElement(By.xpath("//option[text()='svs']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select[@id='addMemberLocation']")).click();
		driver.findElement(By.xpath("//option[text()='ab']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='addMemberMobile']")).sendKeys("9999988882");
		driver.findElement(By.xpath("//input[@id='addMemberLabel']")).sendKeys("TM-130");
		Thread.sleep(500);
	}
	
	@Then("validate the toast msg of added user in home page")
	public void validate_the_toast_msg_of_added_user_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Employee added successfully", a);
	}

	@Then("click on checkbox of orange member")
	public void click_on_checkbox_of_orange_member() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberOrangeMemberCheckbox']")).click();
	}

	@Then("click on add button for orange member")
	public void click_on_add_button_for_orange_member() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMembersSubmitBtn']")).click();
	}

	@Then("click on any role and add the user")
	public void click_on_any_role_and_add_the_user() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='customRoleCheckBox-15']")).click();
	}

	@Then("Enter empty department name in home page")
	public void enter_empty_department_name_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addDepartmentInput']")).sendKeys("");
	}

	@Then("click on add button for department name")
	public void click_on_add_button_for_department_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addDepartmentSubmitBtn']")).click();
	}

	@Then("validate the toast msg of empty department name in home page")
	public void validate_the_toast_msg_of_empty_department_name_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//input[@id='addDepartmentInput']")).getAttribute("data-original-title");
		Assert.assertEquals("Please enter department", a);
	}

	@Then("Enter department name in home page")
	public void enter_department_name_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addDepartmentInput']")).sendKeys("grtewersdf");
	}

	@Then("validate the toast msg of added department name in home page")
	public void validate_the_toast_msg_of_added_department_name_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Department added successfully", a);
	}

	@Then("Enter empty designation name in home page")
	public void enter_empty_designation_name_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='designationInput']")).sendKeys("");
	}

	@Then("click on add button for designation name")
	public void click_on_add_button_for_designation_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addDesignationSubmitBtn']")).click();
	}

	@Then("validate the toast msg of empty designation name in home page")
	public void validate_the_toast_msg_of_empty_designation_name_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//input[@id='designationInput']")).getAttribute("data-original-title");
		Assert.assertEquals("Please enter designation", a);
	}

	@Then("Enter designation name in home page")
	public void enter_designation_name_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='designationInput']")).sendKeys("testing06");
	}

	@Then("Donot select department name")
	public void donot_select_department_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='departmentSelection']"));
	}

	@Then("validate the toast msg of added designation name with empty department name in home page")
	public void validate_the_toast_msg_of_added_designation_name_with_empty_department_name_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//select[@id='departmentSelection']")).getAttribute("data-original-title");
		Assert.assertEquals("Please select department", a);
	}

	@Then("select department name")
	public void select_department_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='departmentSelection']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//option[text()='native developer'])[2]")).click();
	}

	@Then("validate the toast msg of added designation name in home page")
	public void validate_the_toast_msg_of_added_designation_name_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Designation added successfully", a);
	}

	@Then("Donot Enter location detais in home page")
	public void donot_enter_location_detais_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addLocationLabelInput']")).click();
	}

	@Then("click on add button for location name")
	public void click_on_add_button_for_location_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addLocationSubmitBtn']")).click();
	}

	@Then("validate the toast msg of location details in home page")
	public void validate_the_toast_msg_of_location_details_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//input[@id='addLocationLabelInput']")).getAttribute("data-original-title");
		Assert.assertEquals("Please enter label", a);
	}

	@Then("Enter label name in location detais in home page")
	public void enter_label_name_in_location_detais_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addLocationLabelInput']")).sendKeys("testing05");
	}

	@Then("Enter label1 name in location detais in home page")
	public void enter_label1_name_in_location_detais_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addLocationLabelInput']")).sendKeys("testing06");
	}
	
	@Then("validate the toast msg by entering label name in location details in home page")
	public void validate_the_toast_msg_by_entering_label_name_in_location_details_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//input[@id='addLocationCityInput']")).getAttribute("data-original-title");
		Assert.assertEquals("Please enter city", a);
	}

	@Then("Enter Address in location detais in home page")
	public void enter_address_in_location_detais_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='addLocationAddressInput']")).sendKeys("sdsad dada");
	}

	@Then("Donot Enter Address in location detais in home page")
	public void donot_enter_address_in_location_detais_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='addLocationAddressInput']")).sendKeys("");
	}
	
	@Then("Enter city in location detais in home page")
	public void enter_city_in_location_detais_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addLocationCityInput']")).sendKeys("hyd");
	}

	@Then("validate the toast msg by entering label and address and city in location details in home page")
	public void validate_the_toast_msg_by_entering_label_and_address_and_city_in_location_details_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//input[@id='addLocationStateInput']")).getAttribute("data-original-title");
		Assert.assertEquals("Please enter state", a);
	}

	@Then("Enter state in location detais in home page")
	public void enter_state_in_location_detais_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addLocationStateInput']")).sendKeys("tel");
	}

	@Then("validate the toast msg by entering label and address and city and state in location details in home page")
	public void validate_the_toast_msg_by_entering_label_and_address_and_city_and_state_in_location_details_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//input[@id='addLocationCountryInput']")).getAttribute("data-original-title");
		Assert.assertEquals("Please enter country", a);
	}

	@Then("Enter country in location detais in home page")
	public void enter_country_in_location_detais_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addLocationCountryInput']")).sendKeys("Ind");
	}

	@Then("validate the toast msg by entering location details in home page")
	public void validate_the_toast_msg_by_entering_location_details_in_home_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Location Added successfully", a);
	}

	//Personal settings
	@Then("click on personal settings tab")
	public void click_on_personal_settings_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[4]/span[1]")).click();
	}

	@Then("click on profile")
	public void click_on_profile() throws InterruptedException {
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).click();
		driver.findElement(By.xpath("//span[text()='Profile']")).click();
	}

	@Then("validate the profile page")
	public void validate_the_profile_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='messenger-settings-tab-content']")).getText();
		Assert.assertEquals("Android\n"
				+ "upload an image\n"
				+ "designation\n"
				+ "Developer\n"
				+ "email\n"
				+ "android@tm.com\n"
				+ "mobile\n"
				+ "N/A\n"
				+ "company\n"
				+ "Tvisha\n"
				+ "location\n"
				+ "Hyderabad", a);
	}
	
	@Then("click on upload image")
	public void click_on_upload_image() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='uploadProfilePic']")).click();
		Thread.sleep(1000);
		Robot rb=new Robot();
		StringSelection str = new StringSelection("/home/tvisha/Documents/1700560707012.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@id='userAvatarSaveBtn']")).click();
		Thread.sleep(3000);
	}
	
	@Then("validate the profile page of user")
	public void validate_the_profile_page_of_user() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Profile pic updated successfully!", a);
	}
	
	@Then("Remove the image")
	public void remove_the_image() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='removeProfilePic']")).click();
	}

	@Then("validate the toast msg of removed avatar")
	public void validate_the_toast_msg_of_removed_avatar() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Avatar removed", a);
	}
	
	@Then("click on change password")
	public void click_on_change_password() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//span[text()='Change Password']")).click();
	}
	
	@Then("click on save button in change password")
	public void click_on_save_button_in_change_password() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='savePasswordButton']")).click();
	}

	@Then("validate the toast msg of change password")
	public void validate_the_toast_msg_of_change_password() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Enter old password", a);
	}
	
	@Then("Enter old password")
	public void enter_old_password() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='settingsOldPasswordInput']")).sendKeys("123456");
	}
	
	@Then("validate the toast msg by entering old password")
	public void validate_the_toast_msg_by_entering_old_password() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Enter new password", a);
	}
	
	@Then("Enter new password")
	public void enter_new_password() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='settingsNewPasswordInput']")).sendKeys("654321");
	}
	
	@Then("validate the toast msg by entering old and new password")
	public void validate_the_toast_msg_by_entering_old_and_new_password() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Passwords doesn't match", a);
	}
	
	@Then("Enter confirm password")
	public void enter_confirm_password() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='settingsConfirmPasswordInput']")).sendKeys("654321");
	}
	
	@Then("Enter invalid old password")
	public void enter_invalid_old_password() throws InterruptedException {
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='settingsOldPasswordInput']")).sendKeys("321654");
	}
	
	@Then("validate the toast msg by entering invalid old password")
	public void validate_the_toast_msg_by_entering_invalid_old_password() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Invalid Old Password", a);
	}
	
	@Then("Enter new password with same old password")
	public void enter_new_password_with_same_old_password() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='settingsNewPasswordInput']")).sendKeys("123456");
	}

	@Then("Enter confirm password with same old password")
	public void enter_confirm_password_with_same_old_password() throws InterruptedException {
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='settingsConfirmPasswordInput']")).sendKeys("123456");
	}

	@Then("validate the toast msg by entering same old and new and confirm password")
	public void validate_the_toast_msg_by_entering_same_old_and_new_and_confirm_password() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Nothing to update", a);
	}
	
	@Then("Enter old password with less than 6 characters")
	public void enter_old_password_with_less_than_6_characters() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='settingsOldPasswordInput']")).sendKeys("123");
	}

	@Then("Enter new password with less than 6 characters")
	public void enter_new_password_with_less_than_6_characters() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='settingsNewPasswordInput']")).sendKeys("123");
	}

	@Then("Enter confirm password with less than 6 characters")
	public void enter_confirm_password_with_less_than_6_characters() throws InterruptedException {
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='settingsConfirmPasswordInput']")).sendKeys("123");
	}

	@Then("validate the toast msg by entering password with less than 6 characters")
	public void validate_the_toast_msg_by_entering_password_with_less_than_6_characters() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Password should contain atleast 6 characters", a);
	}
	
	@Then("Enter invalid confirm password")
	public void enter_invalid_confirm_password() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='settingsConfirmPasswordInput']")).sendKeys("123456");
	}

	@Then("validate the toast msg by entering password invalid confirm password")
	public void validate_the_toast_msg_by_entering_password_invalid_confirm_password() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Passwords doesn't match", a);
	}
	
	@Then("validate the toast msg by entering valid password")
	public void validate_the_toast_msg_by_entering_valid_password() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Password Changed Successfully", a);
	}
	
	@Then("click on Activity")
	public void click_on_activity() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Activity'])[2]")).click();
	}
	
	@Then("validate the activity page")
	public void validate_the_activity_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='messenger-settings-tab-content']")).getText();
		Assert.assertEquals("Active Devices\n"
				+ "logout from all devices\n"
				+ "Browser\n"
				+ "Usage\n"
				+ "Messages\n"
				+ "1.89 K / 165.88 KB\n"
				+ "Images & Videos\n"
				+ "409 / 618.79 MB\n"
				+ "Files\n"
				+ "209 / 863.57 MB", a);
	}

	@Then("click on logout icon")
	public void click_on_logout_icon() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='active-device-logout-btn']")).click();
	}

	@Then("validate the tm page")
	public void validate_the_tm_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//link[@href='http://192.168.2.55:8081/']")).getAttribute("href");
		Assert.assertEquals("http://192.168.2.55:8081/", a);
	}
	
	@Then("click on logout from all devices button")
	public void click_on_logout_from_all_devices_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='settingsLogoutAllDevices']")).click();
	}
	
	@Then("click on wallpapers")
	public void click_on_wallpapers() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Wallpapers'])")).click();
	}

	@Then("validate the wallpapers page")
	public void validate_the_wallpapers_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='messenger-settings-right-panel']")).getText();
		Assert.assertEquals("Reaching the Skies, Tallest Tower\n"
				+ "Search Category\n"
				+ "Classic\n"
				+ "Corporate\n"
				+ "Floral\n"
				+ "Fun\n"
				+ "Meeting\n"
				+ "Travel\n"
				+ "Pet-Lovers\n"
				+ "Serene Sea Side\n"
				+ "Abstract\n"
				+ "Celebration\n"
				+ "Music\n"
				+ "Default", a);
	}
	
	@Then("click on search in wallpapers and Enter valid search")
	public void click_on_search_in_wallpapers_and_enter_valid_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='wallpaperSearchInput']")).sendKeys("beach");
	}

	@Then("validate the searched wallpaper")
	public void validate_the_searched_wallpaper() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='messenger-wallpapers-wrapper']")).getText();
		Assert.assertEquals("", a);
	}
	
	@Then("click on search in wallpapers and Enter invalid search")
	public void click_on_search_in_wallpapers_and_enter_invalid_search() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='wallpaperSearchInput']")).sendKeys("test");
	}
	
	@Then("click on apply button for wallpaper")
	public void click_on_apply_button_for_wallpaper() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//div[@data-name='Butterflies']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).perform();
		driver.findElement(By.xpath("(//span[@class='apply-wallpaper'])[2]")).click();
	}

	@Then("validate the toast msg wallpaper")
	public void validate_the_toast_msg_wallpaper() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Applied Successfully!", a);
	}

	@Then("click on select category dropdown")
	public void click_on_select_category_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='searchCategory']")).click();
	}

	@Then("select the any name in dropdown")
	public void select_the_any_name_in_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='Classic']")).click();
	}

	@Then("click on apply button for wallpaper of selected dropdown")
	public void click_on_apply_button_for_wallpaper_of_selected_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//div[@data-name='Plain white']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).perform();
		driver.findElement(By.xpath("(//span[@class='apply-wallpaper'])[3]")).click();
	}
	
	@Then("click on apply button for searched wallpaper")
	public void click_on_apply_button_for_searched_wallpaper() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//div[@data-name='Beach']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).perform();
		driver.findElement(By.xpath("(//span[@class='apply-wallpaper'])[14]")).click();
	}
	
	@Then("click on ibuzr")
	public void click_on_ibuzr() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='iBUZR'])")).click();
	}

	@Then("validate the iBUZR page")
	public void validate_the_i_buzr_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='messenger-ibuzr-settings-container']")).getText();
		Assert.assertEquals("Quick Response Panel\n"
				+ "Show\n"
				+ "enable/disable\n"
				+ "CANNED RESPONSES LIST\n"
				+ "add a tag and press Enter\n"
				+ "hii\n"
				+ "🙂\n"
				+ "Tips:\n"
				+ "*\n"
				+ "When you double-click a Canned Response in Chat window - the message will be sent to the recipient once.\n"
				+ "*\n"
				+ "When you single-click a Canned Response in Chat window - the message will be added to message box.", a);
	}

	@Then("click on switch button to disable in ibuzr")
	public void click_on_switch_button_in_ibuzr() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[7]")).click();
	}

	@Then("validate the toast msg of iBUZR")
	public void validate_the_toast_msg_of_i_buzr() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Saved!", a);
	}

	@Then("click on switch button to enable in ibuzr")
	public void click_on_switch_button_to_enable_in_ibuzr() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[7]")).click();
	}

	@Then("Enter canned msg text")
	public void enter_canned_msg_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='canned-message-input']")).sendKeys("test");
	}
	
	@Then("click on add button in ibuzr")
	public void click_on_add_button_in_ibuzr() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-canned-message-btn']")).click();
	}
	
	@Then("Remove canned msg")
	public void remove_canned_msg_text() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='remove-canned-message'])[3]")).click();
	}
	
	@Then("click on emoji button")
	public void click_on_emoji_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='cannedMessageEmojiPreviewBtn']")).click();
	}

	@Then("Add the emojis")
	public void add_the_emojis() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='emojione emojione-32-travel _1f6e9 row-visible'])")).click();
	}
	
	@Then("Remove the emojis")
	public void remove_the_emojis() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='remove-canned-message'])[3]")).click();
	}
	
	@Then("move the canned msgs")
	public void move_the_canned_msgs() throws InterruptedException {
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//div[@class='added-canned-message-box-cell'])[1]"));
		WebElement e1=driver.findElement(By.xpath("(//div[@class='added-canned-message-box-cell'])[5]"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(e, e1).perform();
	}
	
	@Then("click on layout")
	public void click_on_layout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Layout']")).click();
	}

	@Then("validate the layout page")
	public void validate_the_layout_page() throws InterruptedException {
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='messenger-settings-tab-content']")).getText();
		Assert.assertEquals("Left panel\n"
				+ "Auto Adjust\n"
				+ "(Default)\n"
				+ "Broad Panel\n"
				+ "Narrow Panel\n"
				+ "On Large Screen\n"
				+ "On Small Screen", a);
	}
	
	@Then("change to board pannel")
	public void change_to_board_pannel() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElements(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])")).get(14).click();
	}
	
	@Then("change to narrow pannel")
	public void change_to_narrow_pannel() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElements(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])")).get(15).click();
	}
	
	@Then("change to auto adjust")
	public void change_to_auto_adjust() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElements(By.xpath("(//span[@class='messenger-settings-custom-radio-checkmark'])")).get(13).click();
	}
}


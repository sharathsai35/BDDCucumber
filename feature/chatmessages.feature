Feature: login chat conversation

  @tag1
  Scenario: Chat conversation
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user
    And user enters text message
    And click on send button
    Then validate the msg
    And click on rightclick 
    And click on forward
    And click on forward button
    And select the users and groups
    Then click on send button in forward page
		And click on rightclick
		And click on delete
		And click on delete button
		And click on yes button in delete popup msg
		Then validate the toast msg of delete
		And click on rightclick
		And click on edit
		And user enters text message
		And Edit the message
		And click on send button
		Then validate the edited icon
		And click on rightclick
		And click on reply
		And validate reply con
		And user enters text message
		And click on send button
		And click on rightclick
		And click on flag
		Then validate flag icon
		And click on rightclick
		And click on pin
		Then validate pin icon
		And click on rightclick
		And click on info
		Then validate info page
		And click on close button
		And click on rightclick
		And click on recall
		And click on recall button
		And click on yes button in popup msg
		Then validate the recall msg
		And click on rightclick
		And click on copy
		And click on copy button
		Then validate the toast msg of copy
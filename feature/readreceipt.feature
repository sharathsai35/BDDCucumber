Feature: Forkout

  @tag1
  Scenario: Forkout with users and groups conversation
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user
    And user enters text message
		And click on read receipt icon in user chat
		And click on send button
		Then validate the read receipt icon
		And click on group
		And group enters text message
		And click on read recipt icon in group chat
		And select the users
		And click on send button
		And click on group
		And group enters text message
		And click on read recipt icon in group chat
		And click on select all checkbox
		And click on send button
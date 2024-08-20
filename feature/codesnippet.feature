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
    And click on code snippet icon
    And click on send button
    Then validate the code snippet
Feature: Voice message

  @tag1
  Scenario: voice message to user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user
    And click on voice message icon
    And record the voice message
    And click on send button
    Then validate the voice message
Feature: Code snippet

  @tag1
  Scenario: Code snippet message
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
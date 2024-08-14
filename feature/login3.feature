Feature: Login functionality

@tag
  Scenario: Login with valid credentials
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in

  Scenario: Login with invalid credentials
    Given user has navigated to login page
    When user enters invalid email address "sharath123@gmail.com" into email field
    And user entered invalid password "123455654" into password field
    And user clicks on login button
    Then user should get a proper warning message about credentials mismatch
@tag1
  Scenario: Login with valid email and invalid password
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered invalid password "123455654" into password field
    And user clicks on login button
    Then user should get a proper warning message about credentials mismatch

  Scenario: Login with invalid email and valid password
    Given user has navigated to login page
    When user enters invalid email address "sharath12@gmail.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get a proper warning message about credentials mismatch
@Android
  Scenario: Login without providing any credentials
    Given user has navigated to login page
    When user dont entered email address into email field
    And user clicks on login button
    Then user should get a proper warning message about credentials required

  Scenario: Login without providing password
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user didnot enter password field
    And user clicks on login button
    Then user should get a proper warning message about password required
    
  Scenario: Login without providing email
    Given user has navigated to login page
    When user didnt entered email address into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get a proper warning message about credentials required
Feature: Add user from recent chat page

  @tag1
  Scenario: Click on add user in add button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add user button
    Then validate the add user page
    
  @tag2
  Scenario: Click on add employee in add user without entering user details
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add user button
    And click on add employee button
    Then validate the toast msg without entering details
    
  @tag3
  Scenario: Click on add employee in add user with enter only username
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add user button
    And enter username
    And click on add employee button in add user
    Then validate the toast msg with entering username
    
  @tag4
  Scenario: Click on add employee in add user with enter only email
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add user button
    And enter email
    And click on add employee button in add user
    Then validate the toast msg without entering details
    
  @tag5
  Scenario: Click on add employee in add user with entering invalid email
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add user button
    And enter username
    And enter invalid email
    And click on add employee button in add user
    Then validate the toast msg with entering invalid email  
    
  @tag6
  Scenario: Click on add employee in add user with entering username & duplicate email
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add user button
    And enter username
    And enter duplicate email
    And click on add employee button in add user
    Then validate the toast msg with entering duplicate details
    
  @tag7
  Scenario: Click on add employee in add user with entering username & email
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add user button
    And enter username
    And enter email in add user
    And click on add employee button in add user
    Then validate the toast msg with entering details
    
  @tag8
  Scenario: Click on add employee in add user with adding optional details
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add user button
    And enter username
    And enter email in add user1
    And click on add button in department
    And create the new department name
    Then validate the toast msg of adding department name
    And click on add button in designation
    And create the new designation name
    Then validate the toast msg of adding designation name  
    And click on add button in location
    And create the new location name
    Then validate the toast msg of adding location name
    And Enter mobile number
    And Enter employee label
    And click on add employee button in add user
    Then validate the toast msg with entering details
        
  @tag9
  Scenario: create orange user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add user button
    And enter username
    And enter orange user email in add user
    And click on orange user checkbox
    And click on next button in add user
    And click on save button in permission page
    Then validate the toast msg with entering orange details
    
  @tag10
  Scenario: create user with role based
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add user button
    And enter username
    And enter user email in add user
    And click on role checkbox
    And click on add employee button in add user
    Then validate the toast msg with entering details
    
    
    
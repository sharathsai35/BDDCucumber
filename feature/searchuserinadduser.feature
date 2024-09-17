Feature: Search the user in users tab 

  @tag1
  Scenario: Search the user in users page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on search in user list page
    And Enter the username in search
    Then validate the searched user
    
  @tag2
  Scenario: Search the orange user in users page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on search in user list page
    And Enter the orange name in search
    Then validate the searched orange user
    
  @tag3
  Scenario: Select users and orange members in users tab
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on dropdown of users and orange members
    And select the users and orange members
    Then validate the users and orange members
    
  @tag4
  Scenario: Select users in users tab
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on dropdown of users and orange members
    And select the users in dropdown
    Then validate the users
    
  @tag5
  Scenario: Select orange members in users tab
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on dropdown of users and orange members
    And select the orange member in dropdown
    Then validate the orange member
    
  @tag6
  Scenario: Select deactivated users and orange members in users tab
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on dropdown of users and orange members
    And select the deactivated users and orange members in dropdown
    Then validate the deactivated users and orange members
    
  @tag7
  Scenario: Select Ex-users and Ex-orange members in users tab
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on dropdown of users and orange members
    And select the Ex users and Ex orange members in dropdown
    Then validate the Ex users and Ex orange members  
    
  @tag8
  Scenario: Select Department dropdown in users tab
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on dropdown of department
    And select the any department in dropdown
    Then validate the department list
    
  @tag9
  Scenario: select designation dropdown in users tab
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on dropdown of designations
    Then validate the designation list  
    
  @tag10
  Scenario: Combination department and designation dropdown in users tab
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on dropdown of department
    And select the any department in dropdown
    And click on dropdown of designation
    And select the any designation in dropdown
    Then validate the department and designation users list  
    
  @tag11
  Scenario: select location dropdown in users tab
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on dropdown of location
    And select the location
    Then validate the location user list     
    
  @tag12
  Scenario: combination of search, users, department, designation & location in users tab
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on search in user list page
    And Enter the username in search
    And click on dropdown of users and orange members
    And select the users in dropdown
    And click on dropdown of department
    And select the department in dropdown
    And click on dropdown of designation
    And select the designation in dropdown
    And click on dropdown of location
    And select the location in list
    Then validate the combination user       
            
   @tag13
  Scenario: combination of search, users, department, designation & location in users tab and click on refresh button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on search in user list page
    And Enter the username in search
    And click on dropdown of users and orange members
    And select the users in dropdown
    And click on dropdown of department
    And select the department in dropdown
    And click on dropdown of designation
    And select the designation in dropdown
    And click on dropdown of location
    And select the location in list
    Then validate the combination user  
    Then click on refresh button
    Then validate the search field           
Feature: Add Group in recent chat page

  @tag1
  Scenario: Click on add group in add button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add group in recent chat page
    Then Validate the add group 
  
  @tag2
   Scenario: Click on create button in add group
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add group in recent chat page
 		And Enter group name in add group 
 		And click on create button in add group
 		Then validate the toast msg 
 
 @tag3
 Scenario: Dont enter group name
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add group in recent chat page
 		And click on create button in add group
 		Then validate the toast msg for without group name
 
 @tag4
 Scenario: Enter group name with more than 100 characters
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add group in recent chat page
    And Enter group name more than 100 characters in add group 
 		And click on create button in add group
 		Then validate the toast msg for without group name more than 100 characters
 
 @tag5
 Scenario: Enter group name with 1 characters
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add group in recent chat page
    And Enter group name with 1 characters in add group 
 		And click on create button in add group
 		Then validate the toast msg for without group name with 1 characters
 		
 @tag6		
 	Scenario: Enter description only
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add group in recent chat page
    And Enter description in add group 
 		And click on create button in add group
 		Then validate the toast msg for without group name	
 
  @tag7		
 	Scenario: Add the users & count the users when we are adding
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add group in recent chat page
    And Enter group name in add group
    And Enter description in add group
    And select the users in add group  
 		Then Count the users
 				
 	@tag8		
 	Scenario: Enter group name & description with selecting users
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add group in recent chat page
    And Enter group name in add group
    And Enter description in add group
    And select the users in add group 
 		And click on create button in add group
 		Then validate the toast msg 		
 
 @tag9		
 	Scenario: Added profile pic
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on add button
    And click on add group in recent chat page
    And Enter group name in add group
    And Enter description in add group
    And Click on profile pic in add group 
 		Then Validate the profile pic in add group		
 
 		 
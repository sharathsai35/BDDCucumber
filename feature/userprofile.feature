Feature: User profile 

  @tag1
  Scenario: Click on profile of user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user in recent chat page
    And click on profile of user
    Then validate the user profile page
    
  @tag2
  Scenario: Click on copy icon for email
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user in recent chat page
    And click on profile of user
    And click on copy icon for email
    Then validate the toast msg of email copied  
    
  @tag3
  Scenario: Click on copy icon for mobile num
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user in recent chat page
    And click on profile of user
    And click on copy icon for mobile
    Then validate the toast msg of mobile copied
    
  @tag4
  Scenario: Click on profile of user image
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user in recent chat page
    And click on profile of user
    And click on image in user profile
    Then validate the image viewer of the user  
    
  @tag5
  Scenario: Click on close icon in user image viewer
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user in recent chat page
    And click on profile of user
    And click on image in user profile
    And click on close icon in user image
    Then validate the user profile page
    
  @tag6
  Scenario: Add favourite icon in profile page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user in recent chat page
    And click on profile of user
    And click on favourite icon in user profile 
    Then validate the favourite text
    
  @tag7
  Scenario: Remove favourite icon in profile page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user in recent chat page
    And click on profile of user
    And Remove the favourite in user profile 
    Then validate the removed favourite text           
    
  @tag8
  Scenario: Click on mute icon in profile page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user in recent chat page
    And click on profile of user
    And click on mute icon in user profile 
    Then validate the mute text
    
  @tag9
  Scenario: Remove mute icon in profile page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user in recent chat page
    And click on profile of user
    And Remove the mute in user profile 
    Then validate the removed mute text
    
  @tag10
  Scenario: click on pin tab
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user1 in recent chat page
    And click on profile of user1
    And click on pin tab 
    Then validate pin tab     
    
    
              
Feature: Edit user in users page

  @tag1
  Scenario: Click on edit user in edit
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on 3 dots in add user
    And click on edit button
    Then validate the edit user page
    
  @tag2
  Scenario: Edit the user in username
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on 3 dots in add user
    And click on edit button
    And clear the username and edit the user name
    And click on save employee
    Then validate the edited user toast msg
    
  @tag3
  Scenario: Edit the user in email
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on 3 dots in add user
    And click on edit button
    And clear the email and edit the email
    And click on save employee
    Then validate the edited user toast msg
    
  @tag4
  Scenario: Edit the optional details for user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on 3 dots in add user1
    And click on edit button for selected user
    And edit the department
	  And edit the designation
	  And edit the location
	  And edit the mobile number
	  And edit the employee label
    And click on save employee
    Then validate the edited user toast msg
    
  @tag5
  Scenario: Edit username for orange user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on 3 dots in orange user
    And click on edit button for orange user
    And edit the orange username
	  And Click on next button
    And click on save button
    Then validate the edited user toast msg  
     
  @tag6
  Scenario: Edit email for orange user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on 3 dots in orange user
    And click on edit button for orange user
    And edit the orange user email
	  And Click on next button
    And click on save button
    Then validate the edited user toast msg     
    
  @tag7
  Scenario: Click on View button in 3 dots
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on 3 dots in add user
    And click on view button
    Then validate the view user page
    
  @tag8
  Scenario: Click on Resend invite button in 3 dots
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on 3 dots in add user
    And click on resend invite
    Then validate the toast msg in resend invite
    
  @tag9
  Scenario: Click on deactivate button in 3 dots with no button in popup
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on 3 dots in add user3
    And click on deactivate button
    And click on no button in popup
    Then validate the user  
  
  @tag10
  Scenario: Click on deactivate button in 3 dots with yes button in popup
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on 3 dots in add user3
    And click on deactivate button
    And click on yes button in popup
    Then validate the toast msg for deactivated user  
    
  @tag11
  Scenario: Click on Terminate without selecting the user 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on dropdown of actions
    And click on terminate
    Then validate the toast msg for terminate
  
  @tag12
  Scenario: Click on Terminate with selecting the user with no button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And select the user checkbox
    And click on dropdown of action
    And click on terminate
    And select no in popup
    Then validate the user
      
  @tag13
  Scenario: Click on Terminate with selecting the user with yes button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And select the user checkbox
    And click on dropdown of action
    And click on terminate
    And select yes in popup
    Then validate the toast msg for terminating the user 
  
  @tag14
  Scenario: Click on Deactivate without selecting the user 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on dropdown of actions
    And click on deactivate
    Then validate the toast msg for deactivate
      
  @tag15
  Scenario: Click on Deactivate with selecting the user with no button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And select the user checkbox
    And click on dropdown of action
    And click on deactivate
    And select no in popup
    Then validate the user 
    
  @tag16
  Scenario: Click on Deactivate with selecting the user with yes button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And select the user checkbox
    And click on dropdown of action
    And click on terminate
    And select yes in popup
    Then validate the toast msg for deactivating the user   
    
    
            
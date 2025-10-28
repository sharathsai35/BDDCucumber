Feature: Group profile 

  @tag1
  Scenario: Click on profile of group
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group in recent chat page
    And click on profile of group
    Then validate the group profile page
    
  @tag2
  Scenario: Click on info in group profile
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group in recent chat page
    And click on profile of group
    And click on info tab in group
    Then validate the info tab in group profile page  
    
  @tag3
  Scenario: Change group name with save button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group in recent chat page
    And click on profile of group
    And click on info tab in group
    And click on edit icon for group name
    And enter the group name in group profile
    And click on save button in group profile
    Then validate the toast msg of changed group name
    
  @tag4
  Scenario: Change group name with cancel button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on info tab in group
    And click on edit icon for group name
    And enter the group name in group profile
    And click on cancel button in group profile
    Then validate save and cancel button  
    
  @tag5
  Scenario: Click on save button with empty group name
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on info tab in group
    And click on edit icon for group name
    And clear the group name in group profile
    And click on save button in group profile
    Then validate toast msg of empty group name
    
  @tag6
  Scenario: Click on cancel button with empty group name
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on info tab in group
    And click on edit icon for group name
    And clear the group name in group profile
    And click on cancel button in group profile
    Then validate save and cancel button
    
  @tag7
  Scenario: Click on edit button for group profile and update the avatar
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on info tab in group
    And click on edit icon for group profile
    And select the image of group profile
    Then validate toast msg of group profile  
    
  @tag8
  Scenario: Click on edit button inside the group profile pic
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on info tab in group
    And click on edit icon inside the group profile pic
    And select the image of group profile
    Then validate toast msg of edited group profile pic   
    
  @tag9
  Scenario: Click on close button for group profile
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on info tab in group
    And click on close icon for group profile
    Then validate the group profile     
    
  @tag10
  Scenario: Click on delete button for group profile
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on info tab in group
    And click on delete icon for group profile
    Then validate toast msg of deleted group profile      
    
  @tag11
  Scenario: Click on add button to add description
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on info tab in group
    And click on add icon to add description
    And enter the description in add description
    And click on save button to added description
    Then validate toast msg of added decription
    
  @tag12
  Scenario: Click on edit button & clear the description
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on info tab in group
    And click on edit icon to edit description
    And clear the description in edit description
    And click on save button to added description
    Then validate toast msg of added decription        
    
  @tag13
  Scenario: Click on edit button & Enter with 100 characters
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on info tab in group
    And click on add icon to add description
    And enter the description with 100 characters in add description
    Then validate the count of added description
    And click on save button to added description
    Then validate toast msg of added decription
    
  @tag14
  Scenario: Click on edit button & In add description, click on cancel button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on info tab in group
    And click on edit icon to edit description
    And clear the description in edit description
    Then validate the count of added description of cleared description
    And click on cancel button to added description
    Then validate the group profile
    
  @tag15
  Scenario: Click on users tab in group profile
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on users tab in group
    Then validate the group users in group profile
    
  @tag16
  Scenario: Click on users tab in group profile & search with valid user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on users tab in group
    And click on search and enter valid username
    Then validate the searched username
    
  @tag17
  Scenario: Click on users tab in group profile & search with invalid user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on users tab in group
    And click on search and enter invalid username
    Then validate the searched invalid username
    
  @tag18
  Scenario: Click on users tab in group profile & Add the new user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on users tab in group
    And click on add button in group users tab page
    And add the user into the group 
    And validate the toast msg after adding the user
    Then validate the added user in the group page
    
  @tag19
  Scenario: Click on users tab in group profile & Remove the added user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on users tab in group
    And click on 3 dots for added user
    And remove the user from the group 
    And validate the toast msg of removing the user
    Then validate after removing user in the group                                           
    
  @tag20
  Scenario: Click on users tab in group profile & Make as admin to any user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on users tab in group
    And click on 3 dots for any user
    And make admin to any user in the group 
    Then validate the toast msg making the admin to the user
    
  @tag21
  Scenario: Click on users tab in group profile & Remove as admin to admin user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on users tab in group
    And click on 3 dots for any user
    And remove admin to admin user in the group 
    Then validate the toast msg removing the admin to the user
    
  @tag22
  Scenario: Click on users tab in group profile & Make moderator to any user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on users tab in group
    And click on 3 dots for any user
    And make moderator to any user in the group 
    Then validate the toast msg making the moderator to the user 
    
  @tag23
  Scenario: Click on users tab in group profile & Remove moderator to any user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on users tab in group
    And click on 3 dots for any user
    And remove moderator to moderator user in the group 
    Then validate the toast msg removing the moderator to the user
    
  @tag24
  Scenario: Click on users tab in group profile & Click on view in 3 dots to any user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on users tab in group
    And click on 3 dots for any user
    And Click on view 
    Then validate the user profile page from group profile
    
  @tag25
  Scenario: Click on users tab in group profile & Click on message in 3 dots to any user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on users tab in group
    And click on 3 dots for any user
    And click on message 
    Then validate the user chat page 
    
  @tag26
  Scenario: Click on logs tab in group profile
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on logs tab in group
    Then validate the logs tab
    
  @tag27
  Scenario: Click on chat history in logs tab
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on logs tab in group
    And click on chat history in logs tab
    Then validate the chat history page in chat page
    
  @tag28
  Scenario: click on pin tab with empty data
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group1 in recent chat page
    And click on profile of group1
    And click on pin tab in group
    Then validate pin tab in group
    
  @tag29
  Scenario: click on pin tab with data
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group2 in recent chat page
    And click on profile of group2
    And click on pin tab in group
    Then validate pin tab with data in group
    
  @tag30
  Scenario: In pin, Click on 3 dots & click on view
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group3 in recent chat page
    And click on profile of group3
    And click on pin tab in group
    And click on 3 dots in group for pin msg
    And click on view in group for pin msg
    Then validate the viewed data in group        
    
  @tag31
  Scenario: In pin, Click on 3 dots & click on popout
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group3 in recent chat page
    And click on profile of group3
    And click on pin tab in group
    And click on 3 dots in group for pin msg
    And click on popout in group for pin msg
    Then validate the popout data in group
    
  @tag32
  Scenario: In pin, Click on 3 dots & click on download
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group3 in recent chat page
    And click on profile of group3
    And click on pin tab in group
    And click on 3 dots in group for pin msg
    And click on download in group for pin msg
    Then validate the download data in group
    
  @tag33
  Scenario: In pin, Click on 3 dots & click on popout icon
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group3 in recent chat page
    And click on profile of group3
    And click on pin tab in group
    And click on popout icon in group for pin msg
    Then validate the popout data in group  
    
  @tag34
  Scenario: In pin, Click on 3 dots & click on unpin
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group4 in recent chat page
    And click on profile of group4
    And click on pin tab in group
    And click on 3 dots in group for pin msg
    And click on unpin in group for pin msg
    Then validate the pin tab in group
    
  @tag35
  Scenario: click on setting in group
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group3 in recent chat page
    And click on profile of group3
    And click on settings tab in group
    Then validate the settings tab in group
    
  @tag36
  Scenario: Delete all msgs and files in group with no button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group5 in recent chat page
    And click on profile of group5
    And click on settings tab in group
    And click on all msgs and files radio button in group
    And click on submit button in group
    And click on no button in group 
      
  @tag37
  Scenario: Delete all msgs and files in group with yes button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group5 in recent chat page
    And click on profile of group5
    And click on settings tab in group
    And click on all msgs and files radio button in group
    And click on submit button in group
    And click on yes button in group
    Then validate the toast msg of deleting all msgs and files  
		Then validate the logs in group chat page
    
  @tag38
  Scenario: Delete only msgs in group with no button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group5 in recent chat page
    And click on profile of group5
    And click on settings tab in group
    And click on only msgs radio button in group
    And click on submit button in group
    And click on no button in group 
      
  @tag39
  Scenario: Delete only msgs in group with yes button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group5 in recent chat page
    And click on profile of group5
    And click on settings tab in group
    And click on only msgs radio button in group
    And click on submit button in group
    And click on yes button in group
    Then validate the toast msg of deleting only msgs
		Then validate the logs in group chat page with only msgs
    
  @tag40
  Scenario: Delete only files in group with no button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group5 in recent chat page
    And click on profile of group5
    And click on settings tab in group
    And click on only files radio button in group
    And click on submit button in group
    And click on no button in group 
      
  @tag41
  Scenario: Delete only files in group with yes button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group5 in recent chat page
    And click on profile of group5
    And click on settings tab in group
    And click on only files radio button in group
    And click on submit button in group
    And click on yes button in group
    Then validate the toast msg of deleting only files                       
    Then validate the logs in group chat page with only files   
 
  @tag42
  Scenario: Delete all msgs and files in self for group with no button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group5 in recent chat page
    And click on profile of group5
    And click on settings tab in group
    And click on self tab
    And click on all msgs and files radio button in group for self
    And click on submit button in group
    And click on no button in group 
      
  @tag43
  Scenario: Delete all msgs and files in self for group with yes button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group5 in recent chat page
    And click on profile of group5
    And click on settings tab in group
    And click on self tab
    And click on all msgs and files radio button in group for self
    And click on submit button in group
    And click on yes button in group
    Then validate the toast msg of deleting all msgs and files  
		Then validate the logs in group chat page for self
    
  @tag44
  Scenario: Delete only msgs in self for group with no button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group5 in recent chat page
    And click on profile of group5
    And click on settings tab in group
    And click on self tab
    And click on only msgs radio button in group for self
    And click on submit button in group
    And click on no button in group 
      
  @tag45
  Scenario: Delete only msgs in self for group with yes button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group5 in recent chat page
    And click on profile of group5
    And click on settings tab in group
    And click on self tab
    And click on only msgs radio button in group for self
    And click on submit button in group
    And click on yes button in group
    Then validate the toast msg of deleting only msgs
		Then validate the logs in group chat page with only msgs for self
    
  @tag46
  Scenario: Delete only files in self for group with no button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group5 in recent chat page
    And click on profile of group5
    And click on settings tab in group
    And click on self tab
    And click on only files radio button in group for self
    And click on submit button in group
    And click on no button in group 
      
  @tag47
  Scenario: Delete only files in self for group with yes button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group5 in recent chat page
    And click on profile of group5
    And click on settings tab in group
    And click on self tab
    And click on only files radio button in group for self
    And click on submit button in group
    And click on yes button in group
    Then validate the toast msg of deleting only files                       
 		Then validate the logs in group chat page with only files for self
 		
 	@tag48
  Scenario: Exit from group with no button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group6 in recent chat page
    And click on profile of group6
    And click on settings tab in group
    And click on exit button
    And click on submit button to exit group
    And click on no button in group 
      
  @tag49
  Scenario: Exit from group with yes button when group is having only one admin user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group6 in recent chat page
    And click on profile of group6
    And click on settings tab in group
    And click on exit button
    And click on submit button to exit group
    And click on yes button in group
    Then validate the toast msg of exit group from only one admin user  
    
  @tag50
  Scenario: Exit from group with yes button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group8 in recent chat page
    And click on profile of group8
    And click on settings tab in group
    And click on exit button
    And click on submit button to exit group
  	And click on yes button in group
    Then validate the toast msg of exit group  
    
  @tag51
  Scenario: Delete group with no button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group7 in recent chat page
    And click on profile of group7
    And click on settings tab in group
    And click on delete group
    And click on submit button in group
    And click on no button in group 
      
  @tag52
  Scenario: Delete group with yes button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on group7 in recent chat page
    And click on profile of group7
    And click on settings tab in group
    And click on delete group
    And click on submit button in group
    And click on yes button in group
    Then validate the toast msg of deleting group
         
    
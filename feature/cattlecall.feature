Feature: Cattle call 

  @tag1
  Scenario: Click on cattle call
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    
  @tag2
  Scenario: If there is no meeting are scheduled 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    Then validate the todays meeting
    
  @tag3
  Scenario: Click on now in video conference 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    Then validate the page when we click on now button
    
  @tag4
  Scenario: Search valid username in now 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    And search the valid username
    Then validate the searched username in cattle call
    
  @tag5
  Scenario: Search invalid username in now conference call
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    And search the invalid username
    Then validate the invalid searched username in cattle call
    
  @tag6
  Scenario: Select the user in now conference call 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    And select the user in now conference call
    Then validate the users count and added user in that meeting
    
  @tag7
  Scenario: Add the external user in the cattle call meeting 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    And click on external tab
    And Add the external user in the meeting
    Then validate the users count and added external user in that meeting
    
  @tag8
  Scenario: Add the same external user multiple time in the cattle call meeting 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    And click on external tab
    And Add the external user in the meeting
    And again add the same email in the meeting
    Then validate the toast msg of duplicate email
    Then validate the users count and added external user in that meeting
    
  @tag9
  Scenario: Add the external user with incorrect email in the cattle call meeting 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    And click on external tab
    And Enter invalid email external user in the meeting
    Then validate the toast msg of invalid email
    
  @tag10
  Scenario: Remove the added external email in the meeting 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    And click on external tab
    And Add the external user in the meeting
    And validate the added email
    And remove the email from the external user list
    Then validate the removed email
    
  @tag11
  Scenario: Add the external user from external history 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    And click on external tab
    And Add the user from external history
    Then validate the added external email
    
  @tag12
  Scenario: Add the external user from external history & Deselect the external user from external history
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    And click on external tab
    And Add the user from external history
    Then validate the added external email
    And remove the user from external history
    Then validate the removed external email
    
  @tag13
  Scenario: Search the valid email in external history
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    And click on external tab
    And search the valid email in external history
    Then validate the searched valid email external history
    
  @tag14
  Scenario: Search the invalid email in external history
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    And click on external tab
    And search the invalid email in external history
    Then validate the searched invalid email external history
    
  @tag15
  Scenario: Select the users & Click on cancel button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    And select the user in now conference call
    And click on external tab
    And Add the external user in the meeting
		And validate the users count in the meeting
    And click on cancel button
    Then validate the cattle call popup page
    
  @tag16
  Scenario: Select the users & Click on invite button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on now button in cattle call
    And select the user in now conference call
    And click on external tab
    And Add the external user in the meeting
		And validate the users count in the meeting
    And click on invite button
    Then validate the calling page
    
  @tag17
  Scenario: click on later in cattle call
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on later button in cattle call
    Then validate the schedule meeting page
    
  @tag18
  Scenario: change the date in schedule meeting
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on later button in cattle call
    And change the date
    Then validate the date     
    
  @tag19
  Scenario: click on schedule meeting without entering data
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on later button in cattle call
    And click on schedule button
    Then validate the toast msg of empty data in schedule meeting page
    
  @tag20
  Scenario: click on schedule meeting by entering only title name
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on later button in cattle call
    And enter title name
    And click on schedule button
    Then validate the toast msg by entering title name in schedule meeting page
    
  @tag21
  Scenario: click on schedule meeting by entering title name & from time
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on later button in cattle call
    And enter title name
    And select the from time
    And click on schedule button
    Then validate the toast msg by entering title name & selecting from time in schedule meeting page
    
  @tag22
  Scenario: click on schedule meeting by entering title name & from & to time
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on later button in cattle call
    And enter title name
    And select the from time
    And select to time
    And click on schedule button
    Then validate the toast msg by entering title name & selecting from & to time in schedule meeting page
    
  @tag23
  Scenario: click on schedule meeting without selecting the users
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on later button in cattle call
    And enter title name
    And select the from time
    And select to time
    And click on add icon in schedule meeting
    And click on add button in adding users page
    And click on schedule button
    Then validate the toast msg without selecting users
    
  @tag24
  Scenario: Schedule the meeting by adding users
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on later button in cattle call
    And enter title name
    And select the from time
    And select to time
    And click on add icon in schedule meeting
    And select the user in schedule meeting
    And click on add button in adding users page
    And click on schedule button
    Then validate the toast msg by selecting users
    
  @tag25
  Scenario: Schedule the meeting by adding internal users and external users
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on later button in cattle call
    And enter title name
    And select the from time
    And select to time
    And click on add icon in schedule meeting
    And select the user in schedule meeting
    And click on external tab in schedule meeting
    And add the external users in schedule meeting
		And click on add button in adding users page
    And validate the users list in schedule meeting
    And click on schedule button
    Then validate the toast msg by selecting users
    
  @tag26
  Scenario: Schedule the meeting by adding users and entering description
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on later button in cattle call
    And enter title name
    And select the from time
    And select to time
    And click on add icon in schedule meeting
    And select the user in schedule meeting
    And click on external tab in schedule meeting
    And add the external users in schedule meeting
		And click on add button in adding users page
    And validate the users list in schedule meeting
    And Enter description in schedule meeting
    And click on schedule button
    Then validate the toast msg by selecting users
    
  @tag27
  Scenario: Schedule the meeting by adding users and entering description & Select no radio button in advanced options
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on later button in cattle call
    And enter title name
    And select the from time
    And select to time
    And click on add icon in schedule meeting
    And select the user in schedule meeting
    And click on external tab in schedule meeting
    And add the external users in schedule meeting
		And click on add button in adding users page
    And validate the users list in schedule meeting
    And Enter description in schedule meeting
    And Deselect the advanced options
    And click on schedule button
    Then validate the toast msg by selecting users
    
  @tag28
  Scenario: Enter invalid meeting id in join meeting
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on join meeting
    And enter the invalid meeting id
    And click on submit in join meeting
    Then validate the toast msg of invalid join meeting                      
    
  @tag29
  Scenario: Without entering meeting id in join meeting
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on join meeting
    And click on submit in join meeting
    Then validate the toast msg without entering meeting id in join meeting
    
  @tag30
  Scenario: Enter valid meeting id in join meeting
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on join meeting
    And Enter valid meeting id
    And click on submit in join meeting
    Then validate the toast msg by entering valid meeting id in join meeting
    
  @tag31
  Scenario: View the upcoming meetings
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    Then validate the upcoming meetings
    
  @tag32
  Scenario: Click on scheduled meeting id
    Given user has navigated to login page
    When user enters valid email address "maneesh@tm.com" into email field
    And user entered valid password "654321" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on scheduled meeting id
    Then validate the scheduled meeting
    
  @tag33
  Scenario: Click on start button in scheduled meeting
    Given user has navigated to login page
    When user enters valid email address "maneesh@tm.com" into email field
    And user entered valid password "654321" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on start meeting for scheduled meeting
    Then validate the started meeting
    
  @tag34
  Scenario: Click on edit button in scheduled meeting 
    Given user has navigated to login page
    When user enters valid email address "maneesh@tm.com" into email field
    And user entered valid password "654321" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on edit button for scheduled meeting
    Then validate the toast msg of edit meeting button
    Then validate the scheduled meeting page
    
  @tag35
  Scenario: Click on edit button & scheduled the meeting 
    Given user has navigated to login page
    When user enters valid email address "maneesh@tm.com" into email field
    And user entered valid password "654321" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on edit button for scheduled meeting
    Then validate the toast msg of edit meeting button
    Then validate the scheduled meeting page  
    And click on schedule button
    Then validate the toast msg by selecting users
    
  @tag36
  Scenario: Click on delete button for scheduled meeting 
    Given user has navigated to login page
    When user enters valid email address "test@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on delete button for scheduled meeting
    And click on no button in cancel meeting
    
  @tag37
  Scenario: Click on delete button for scheduled meeting 
    Given user has navigated to login page
    When user enters valid email address "test@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on delete button for scheduled meeting
    And click on yes button in cancel meeting
    Then validate the toast msg of delete meeting
    
  @tag38
  Scenario: Click on status button of yes for joining the meeting
    Given user has navigated to login page
    When user enters valid email address "browser@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on yes button for meeting id
    
  @tag39
  Scenario: Click on status button not joining the meeting 
    Given user has navigated to login page
    When user enters valid email address "browser@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on not joining the meeting
    
  @tag40
  Scenario: Click on status button may or may not joining the meeting 
    Given user has navigated to login page
    When user enters valid email address "browser@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on may or may not joining the meeting
    
  @tag41
  Scenario: Click on join button for meeting 
    Given user has navigated to login page
    When user enters valid email address "browser@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on join button
    Then validate the toast msg of meeting
        
  @tag42
  Scenario: Click on back button in meeting 
    Given user has navigated to login page
    When user enters valid email address "browser@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on scheduled meeting id
    And click on back button

  @tag43
  Scenario: Click on 3 dots in upcoming meeting 
    Given user has navigated to login page
    When user enters valid email address "browser@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on 3 dots in upcoming meeting
    Then validate the 3 dots
    
  @tag44
  Scenario: Click on schedule later in 3 dots 
    Given user has navigated to login page
    When user enters valid email address "browser@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on 3 dots in upcoming meeting
    And Click on schedule later button
    Then validate the toast msg of schedule later
    Then validate the scheduled meeting page
    
  @tag45
  Scenario: Click on cancel meeting in 3 dots 
    Given user has navigated to login page
    When user enters valid email address "browser@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on cattle call icon
    And click on 3 dots in upcoming meeting
    And Click on cancel meeting button
    Then validate the toast msg of cancel meeting
    
    
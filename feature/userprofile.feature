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
  Scenario: click on pin tab with empty data
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user1 in recent chat page
    And click on profile of user1
    And click on pin tab 
    Then validate pin tab
    
  @tag11
  Scenario: click on pin tab with data
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user2 in recent chat page
    And click on profile of user2
    And click on pin tab
    Then validate pin tab with data 
    
  @tag12
  Scenario: In pin, Click on 3 dots & click on view
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user3 in recent chat page
    And click on profile of user3
    And click on pin tab
    And click on 3 dots in pin
    And click on view in pin
    Then validate the viewed data         
    
  @tag13
  Scenario: In pin, Click on 3 dots & click on popout
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user3 in recent chat page
    And click on profile of user3
    And click on pin tab
    And click on 3 dots in pin
    And click on popout in pin
    Then validate the popout data
    
  @tag14
  Scenario: In pin, Click on 3 dots & click on download
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user3 in recent chat page
    And click on profile of user3
    And click on pin tab
    And click on 3 dots in pin
    And click on download in pin
    Then validate the download data 
    
  @tag15
  Scenario: In pin, Click on 3 dots & click on popout icon
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user3 in recent chat page
    And click on profile of user3
    And click on pin tab
    And click on popout icon in pin
    Then validate the popout data   
    
  @tag16
  Scenario: In pin, Click on 3 dots & click on unpin
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user4 in recent chat page
    And click on profile of user4
    And click on pin tab
    And click on 3 dots in pin
    And click on unpin
    Then validate the pin tab            
              
  @tag17
  Scenario: Click on common groups tab with no common group
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user4 in recent chat page
    And click on profile of user4
    And click on common group tab
    Then validate the common group page
    
  @tag18
  Scenario: Click on common groups tab 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user in recent chat page
    And click on profile of user
    And click on common group tab
    Then validate the search field in common group
    
  @tag19
  Scenario: Click on common groups tab & Click on any group 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user in recent chat page
    And click on profile of user
    And click on common group tab
    And click on group in common group tab
    Then validate the group page
    
  @tag20
  Scenario: Click on common groups tab & Search the invalid group name 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user in recent chat page
    And click on profile of user
    And click on common group tab
    And Enter invalid search in common group
    Then validate the common group
    
  @tag21
  Scenario: Click on common groups tab & Search the valid group name 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user in recent chat page
    And click on profile of user
    And click on common group tab
    And Enter valid search in common group
    Then validate the searched common group
    
  @tag22
  Scenario: Click on common groups tab & view the search 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user4 in recent chat page
    And click on profile of user4
    And click on common group tab
    And click on user in recent chat page
    And click on profile of user
    And click on common group tab
    Then validate the search field common group  
    
  @tag23
  Scenario: Click on setting tab 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user4 in recent chat page
    And click on profile of user4
    And click on settings tab
    Then validate the settings page in user
    
  @tag24
  Scenario: Click on setting tab & select all msgs & files with confirm popup yes 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user5 in recent chat page
    And click on profile of user5
    And click on settings tab
    And click on radio button of all msgs and files
    And click on submit
    And click on yes button in confirm page
    Then validate the toast msg of deletion    
    
  @tag25
  Scenario: Click on setting tab & select all msgs & files with confirm popup no 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user5 in recent chat page
    And click on profile of user5
    And click on settings tab
    And click on radio button of all msgs and files
    And click on submit
    Then click on no button in confirm page
    
  @tag26
  Scenario: Click on setting tab & select only msgs with confirm popup yes 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user5 in recent chat page
    And click on profile of user5
    And click on settings tab
    And click on radio button of only msgs
    And click on submit
    And click on yes button in confirm page
    Then validate the toast msg of deletion    
    
  @tag27
  Scenario: Click on setting tab & select only msgs with confirm popup no 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user5 in recent chat page
    And click on profile of user5
    And click on settings tab
    And click on radio button of only msgs
    And click on submit
    Then click on no button in confirm page  
    
  @tag28
  Scenario: Click on setting tab & select only files with confirm popup yes 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user5 in recent chat page
    And click on profile of user5
    And click on settings tab
    And click on radio button of only files
    And click on submit
    And click on yes button in confirm page
    Then validate the toast msg of deletion    
    
  @tag29
  Scenario: Click on setting tab & select only files with confirm popup no 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on user5 in recent chat page
    And click on profile of user5
    And click on settings tab
    And click on radio button of only files
    And click on submit
    Then click on no button in confirm page    
    
                    
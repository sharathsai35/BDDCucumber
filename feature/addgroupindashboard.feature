Feature: Add group

  @tag1
  Scenario: Add group from dashboard
   Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard option
    And click on add group tabss
    And clicks on add group button
    And enter the group name
    And enter the description
    And select the users in add group pages
    And click on create button
    Then validate the toast msg of the adding group

  @tag2
  Scenario: Add group from dashboard without entering group name
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard option
    And click on add group tabss
    And clicks on add group button
    And Dont enter group name
    And click on create button
    Then validate the toast msg of the without entering group name

  @tag3
  Scenario: Add group from dashboard without selecting users
   Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard option
    And click on add group tabs
    And clicks on add group button
    And enter the group name
    And Dont select users
    And click on create button 
    Then validate the toast msg of the without adding users

  @tag4
  Scenario: Add group from dashboard with airtime group
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard option
    And click on add group tabs
    And clicks on add group button
    And enter the group name
    And select the users in add group pages
    And click on the airtime group button
    And click on create button
    Then validate the toast msg of the adding group

  @tag5
  Scenario: Add group from dashboard by entering more than 50 characters in group name
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard option
    And click on add group tabs
    And clicks on add group button
    And Enter the group name with more than firty characters
    And click on create button
    Then validate the toast msg of the adding group with more than firty characters

  #
  #@tag6
  #Scenario: Add group from dashboard by entering more than 50 characters in group name
  #Given user has navigated to login page
    #When user enters valid email address "android@tm.com" into email field
    #And user entered valid password "123456" into password field
    #And user clicks on login button
    #Then user should get successfully logged in
  #And click on dashboard option
  #And click on add group tabs
  #And clicks on add group button
  #And Enter group name
  #And click on profile pic
  #And attach the attachment
  #Then validate the profile pic
  
  @tag6
  Scenario: Add group from dashboard by entering less than 3 characters in group name
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard option
    And click on add group tabs
    And clicks on add group button
    And enter less than 3 characters in the group name
    And click on create button
    Then it should dispay validation messageas group name should be minimum of 3 characters

  @tag7
  Scenario: Add group from dashboard by entering more than 80 characters in group description
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard option
    And click on add group tabs
    And clicks on add group button
    And enter the group name
    And try to enter more that 80 characters in group description
    And click on create button
    Then it should not allow more than 80 characters and should dispay the characters left as 0


  @tag9
  Scenario: Add group from dashboard select the user and click on create button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard option
    And click on add group tabs
    And clicks on add group button
    And enter the group name
    And select the users in add group pages
    And click on create button
    Then validate the toast msg of the adding group

  @tag10
  Scenario: Dashboard options and click on groups and click on add group and remove the selected user
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard option
    And click on add group tabs
    And clicks on add group button
    And enter the group name
    And select the users in add group pages
    And click on remove button
    Then it should remove the selected user

  @tag11
  Scenario: Dashboard options and click on groups select the user as admin
   Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard option
    And click on add group tabs
    And clicks on add group button
    And enter the group name
    And select the users in add group pages
    And click on admin button
    And click on create button
    Then it should dispay toaste msg as please ensure group has atleast one admin

  @tag12
  Scenario: Dashboard options and click on groups select the user as moderator
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard option
    And click on add group tabs
    And clicks on add group button
    And enter the group name
    And select the users in add group pages
    And click on moderator button
    And click on create button
    Then it should dispay toaste msg as group created successfully and make the selected user as moderator

  @tag13
  Scenario: Dashboard options and click on groups and click on add group and click on close button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard option
    And click on add group tabs
    And clicks on add group button
    And clik on close icon
    Then it should close the add group window
    
    
    
    
    
    
    
    

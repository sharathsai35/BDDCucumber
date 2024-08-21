Feature: Add group

  #@tag1
  #Scenario: Add group from dashboard
    #Given user has navigated to login page
    #When user enters valid email address "android@tm.com" into email field
    #And user entered valid password "123456" into password field
    #And user clicks on login button
    #Then user should get successfully logged in
    #And click on dashboard
    #And click on add group tab
    #And click on add group button
    #And Enter group name
    #And enter description
    #And select the users in add group page
    #And click on create
    #Then validate the toast msg of adding group
    #
   #@tag2
   #Scenario: Add group from dashboard without entering group name
    #Given user has navigated to login page
    #When user enters valid email address "android@tm.com" into email field
    #And user entered valid password "123456" into password field
    #And user clicks on login button
    #Then user should get successfully logged in
    #And click on dashboard
    #And click on add group tab
    #And click on add group button
    #And Dont enter the group name
    #And click on create
    #Then validate the toast msg of without entering group name
    #
   #@tag3
   #Scenario: Add group from dashboard without selecting users
    #Given user has navigated to login page
    #When user enters valid email address "android@tm.com" into email field
    #And user entered valid password "123456" into password field
    #And user clicks on login button
    #Then user should get successfully logged in
    #And click on dashboard
    #And click on add group tab
    #And click on add group button
    #And Enter group name
    #And Dont select the users
    #And click on create
    #Then validate the toast msg of without adding users
    #
   #@tag4
   #Scenario: Add group from dashboard with airtime group
    #Given user has navigated to login page
    #When user enters valid email address "android@tm.com" into email field
    #And user entered valid password "123456" into password field
    #And user clicks on login button
    #Then user should get successfully logged in
    #And click on dashboard
    #And click on add group tab
    #And click on add group button
    #And Enter group name
    #And select the users in add group page
    #And click on airtime group button
    #And click on create
    #Then validate the toast msg of adding group
    #
   #@tag5
   #Scenario: Add group from dashboard by entering more than 50 characters in group name
    #Given user has navigated to login page
    #When user enters valid email address "android@tm.com" into email field
    #And user entered valid password "123456" into password field
    #And user clicks on login button
    #Then user should get successfully logged in
    #And click on dashboard
    #And click on add group tab
    #And click on add group button
    #And Enter group name with more than firty characters
    #And click on create
    #Then validate the toast msg of adding group with more than firty characters
    
   @tag6
   Scenario: Add group from dashboard by entering more than 50 characters in group name
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on add group tab
    And click on add group button
    And Enter group name
    And click on profile pic
    And attach the attachment
    Then validate the profile pic
    
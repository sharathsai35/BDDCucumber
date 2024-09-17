Feature: Home page 

  @tag1
  Scenario: Click on home page in dashboard
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    Then validate the home page
    
  @tag2
  Scenario: Click on users wrapper in home page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And click on user wrapper
    Then validate the users tab page
    
  @tag3
  Scenario: Click on orange members wrapper in home page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And click on orange member wrapper
    Then validate the orange member tab page
    
  @tag4
  Scenario: Click on Ex-users & Ex-orange members wrapper in home page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And click on Ex users and Ex orange member wrapper
    Then validate the Ex users and Ex orange member tab page  
  
  @tag5
  Scenario: Click on groups wrapper in home page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And click on groups wrapper
    Then validate the page  
    
  @tag6
  Scenario: change the dates in exchange info
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And In exchange info change the dates
    Then validate the dates     
    
  @tag7
  Scenario: Add user without entering data in home page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Add the user without entering data in home page
    And click on add button in home page
    Then validate the toast msg of without entering user data in home page   
    
  @tag8
  Scenario: Add user with only username in home page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Add the user without entering username in home page
    And click on add button in home page
    Then validate the toast msg of without entering username in home page     
    
  @tag9
  Scenario: Add user with username & email in home page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Add the user with username and email in home page
    And click on add button in home page
    Then validate the toast msg of added user in home page       
     
  @tag10
  Scenario: Add user with username & email & optional details in home page
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Add the user with username1 and email1 in home page
    And add the optional details
    And click on add button in home page
    Then validate the toast msg of added user in home page   
    
  @tag11
  Scenario: Add the user with orange member checkbox
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Add the user with username2 and email2 in home page
    And click on checkbox of orange member
    And click on add button for orange member
    Then validate the toast msg of added user in home page  
    
  @tag12
  Scenario: Add the user with roles
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Add the user with username3 and email3 in home page
    And click on any role and add the user
    And click on add button in home page
    Then validate the toast msg of added user in home page
    
   @tag13
   Scenario: In Quick Add, Add the Department with empty data
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Enter empty department name in home page
    And click on add button for department name
    Then validate the toast msg of empty department name in home page 
      
  @tag14
   Scenario: In Quick Add, Add the Department by entering the data
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Enter department name in home page
    And click on add button for department name
    Then validate the toast msg of added department name in home page  
    
  @tag15
   Scenario: In Quick Add, Add the Designation with empty data
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Enter empty designation name in home page
    And click on add button for designation name
    Then validate the toast msg of empty designation name in home page 
      
  @tag16
   Scenario: In Quick Add, Add the Designation by entering the data of designation name & Donot enter department name
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Enter designation name in home page
    And Donot select department name
    And click on add button for designation name
    Then validate the toast msg of added designation name with empty department name in home page    
  
   @tag17
   Scenario: In Quick Add, Add the Designation by entering the data of designation name & department name
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Enter designation name in home page
    And select department name
    And click on add button for designation name
    Then validate the toast msg of added designation name in home page    
  
  @tag18
   Scenario: In Quick Add, Add the location without entering data
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Donot Enter location detais in home page
    And click on add button for location name
    Then validate the toast msg of location details in home page     
    
  @tag19
   Scenario: In Quick Add, Add the location with entering only label name
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Enter label name in location detais in home page
    And click on add button for location name
    Then validate the toast msg by entering label name in location details in home page     
    
  @tag20
   Scenario: In Quick Add, Add the location with entering label name & city & Address
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Enter label name in location detais in home page
    And Enter Address in location detais in home page
    And Enter city in location detais in home page
    And click on add button for location name
    Then validate the toast msg by entering label and address and city in location details in home page     
    
   @tag21
   Scenario: In Quick Add, Add the location with entering label name & city & Address & state
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Enter label name in location detais in home page
    And Enter Address in location detais in home page
    And Enter city in location detais in home page
    And Enter state in location detais in home page
    And click on add button for location name
    Then validate the toast msg by entering label and address and city and state in location details in home page   
    
  @tag22
   Scenario: In Quick Add, Add the location with entering total data in location
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Enter label name in location detais in home page
    And Enter Address in location detais in home page
    And Enter city in location detais in home page
    And Enter state in location detais in home page
    And Enter country in location detais in home page
    And click on add button for location name
    Then validate the toast msg by entering location details in home page   
       
  @tag23
   Scenario: In Quick Add, Add the location without entering address in location
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on dashboard
    And click on home tab
    And Enter label1 name in location detais in home page
    And Donot Enter Address in location detais in home page
    And Enter city in location detais in home page
    And Enter state in location detais in home page
    And Enter country in location detais in home page
    And click on add button for location name
    Then validate the toast msg by entering location details in home page   
      
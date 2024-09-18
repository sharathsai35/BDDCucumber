Feature: Personal settings 

  @tag1
  Scenario: Click on profile in personal settings
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on profile
    Then validate the profile page
    
  @tag2
  Scenario: Upload the profile in personal settings
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on profile
    And click on upload image
    Then validate the profile page of user
    
  @tag3
  Scenario: Remove the profile in personal settings
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on profile
    And Remove the image
    Then validate the toast msg of removed avatar  
    
  @tag4
  Scenario: Change password with empty fields
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on change password
    And click on save button in change password
    Then validate the toast msg of change password   
      
  @tag5
  Scenario: Change password by entering only old password
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on change password
    And Enter old password
    And click on save button in change password
    Then validate the toast msg by entering old password    
    
  @tag6
  Scenario: Change password by entering old & new password
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on change password
    And Enter old password
    And Enter new password
    And click on save button in change password
    Then validate the toast msg by entering old and new password 
    
  @tag7
  Scenario: Change password by entering invalid old password
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on change password
    And Enter invalid old password
    And Enter new password
    And Enter confirm password
    And click on save button in change password
    Then validate the toast msg by entering invalid old password   
      
  @tag8
  Scenario: Change password by entering old & new & confirm with same password
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on change password
    And Enter old password
    And Enter new password with same old password
    And Enter confirm password with same old password
    And click on save button in change password
    Then validate the toast msg by entering same old and new and confirm password
    
  @tag9
  Scenario: Change password by entering with less than 6 characters password
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on change password
    And Enter old password with less than 6 characters
    And Enter new password with less than 6 characters
    And Enter confirm password with less than 6 characters
    And click on save button in change password
    Then validate the toast msg by entering password with less than 6 characters 
    
  @tag10
  Scenario: Change password by entering with less than 6 characters for new & confirm password
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on change password
    And Enter old password
    And Enter new password with less than 6 characters
    And Enter confirm password with less than 6 characters
    And click on save button in change password
    Then validate the toast msg by entering password with less than 6 characters   
    
  @tag11
  Scenario: Change password by entering invalid confirm password
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on change password
    And Enter old password
    And Enter new password
    And Enter invalid confirm password
    And click on save button in change password
    Then validate the toast msg by entering password invalid confirm password 
    
  @tag12
  Scenario: Change password by entering valid password
    Given user has navigated to login page
    When user enters valid email address "maneesh@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on change password
    And Enter old password
    And Enter new password 
    And Enter confirm password 
    And click on save button in change password
    Then validate the toast msg by entering valid password 
    
  @tag13
  Scenario: Click on Activity 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on Activity
    Then validate the activity page       
    
  @tag14
  Scenario: Click on Activity & Click on logout icon
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on Activity
    And click on logout icon
    Then validate the tm page  
    
  @tag15
  Scenario: Click on Activity & Click on logout from all devices button
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on Activity
    And click on logout from all devices button
    Then validate the tm page       
    
  @tag16
  Scenario: Click on wallpapers 
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on wallpapers
    Then validate the wallpapers page    
   
  @tag17
  Scenario: Click on wallpapers & Enter valid search
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on wallpapers
    And click on search in wallpapers and Enter valid search
    Then validate the searched wallpaper
    
  @tag18
  Scenario: Click on wallpapers & Enter invalid search
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on wallpapers
    And click on search in wallpapers and Enter invalid search
    Then validate the searched wallpaper         
    
  @tag19
  Scenario: Click on apply for any wallpaper
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on wallpapers
    And click on apply button for wallpaper
    Then validate the toast msg wallpaper  
    
  @tag20
  Scenario: Click on apply by selecting category
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on wallpapers
    And click on select category dropdown
    And select the any name in dropdown
    And click on apply button for wallpaper of selected dropdown
    Then validate the toast msg wallpaper
    
  @tag21
  Scenario: Click on apply by searching wallpaper
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on wallpapers
    And click on search in wallpapers and Enter valid search
    And click on apply button for searched wallpaper
    Then validate the toast msg wallpaper        
    
  @tag22
  Scenario: Click on IBUZR
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on ibuzr
    Then validate the iBUZR page   
    
  @tag23
  Scenario: Click on IBUZR & Switch the canned response pannel to disable
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on ibuzr
    And click on switch button to disable in ibuzr
    Then validate the toast msg of iBUZR    
   
 @tag24
  Scenario: Click on IBUZR & Switch the canned response pannel to enable
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on ibuzr
    And click on switch button to enable in ibuzr
    Then validate the toast msg of iBUZR     
    
  @tag25
  Scenario: Click on IBUZR & Add the canned msg
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on ibuzr
    And Enter canned msg text
    And click on add button in ibuzr
    Then validate the toast msg of iBUZR  
    
  @tag26
  Scenario: Click on IBUZR & Remove the canned msg
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on ibuzr
    And Remove canned msg
    Then validate the toast msg of iBUZR      
    
  @tag27
  Scenario: Click on IBUZR & Add the emojis canned msg
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on ibuzr
    And click on emoji button
    And Add the emojis
    And click on add button in ibuzr
    Then validate the toast msg of iBUZR      
    
  @tag28
  Scenario: Click on IBUZR & Remove the emojis canned msg
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on ibuzr
    And Remove the emojis
    Then validate the toast msg of iBUZR   
    
  @tag29
  Scenario: Click on IBUZR & move the canned msgs
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on ibuzr
    And move the canned msgs
    Then validate the toast msg of iBUZR      
       
  @tag30
  Scenario: Click on Layout
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on layout
    Then validate the layout page
    
  @tag31
  Scenario: Click on Layout & Change to Board pannel
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on layout
    Then change to board pannel
    
  @tag32
  Scenario: Click on Layout & Change to narrow pannel
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on layout
    Then change to narrow pannel 
    
  @tag33
  Scenario: Click on Layout & Change to auto adjust
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on layout
    Then change to auto adjust    
    
                
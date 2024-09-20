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
    
  @tag34
  Scenario: Click on Tiles
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on tiles
    Then validate the tiles page    
                
  @tag35
  Scenario: Click on Tiles & Switch the cattle call button to hide
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on tiles
    And switch the cattle call button to hide
    Then validate the cattle call icon right side in tm app              
   
  @tag36
  Scenario: Click on Tiles & Switch the cattle call button to show
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on tiles
    And switch the cattle call button to show
    Then validate the cattle call icon right side in tm app               
                
  @tag37
  Scenario: Click on Tiles & Switch the admin dashboard button to hide
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on tiles
    And switch the admin dashboard button to hide
    Then validate the admin dashboard icon right side in tm app  
    
  @tag38
  Scenario: Click on Tiles & Switch the admin dashboard button to show
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on tiles
    And switch the admin dashboard button to show
    Then validate the admin dashboard icon right side in tm app  
    
  @tag39
  Scenario: Click on Tiles & Switch the Tm monitor button to hide
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on tiles
    And switch the Tm monitor button to hide
    Then validate the Tm monitor icon right side in tm app  
    
  @tag40
  Scenario: Click on Tiles & Switch the Tm monitor button to show
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on tiles
    And switch the Tm monitor button to show
    Then validate the Tm monitor icon right side in tm app                      
                
  @tag41
  Scenario: Click on Tiles & Switch the help button to hide
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on tiles
    And switch the help button to hide
    Then validate the help icon right side in tm app  
    
  @tag42
  Scenario: Click on Tiles & Switch the help button to show
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on tiles
    And switch the help button to show
    Then validate the help icon right side in tm app 
    
  @tag43
  Scenario: Click on Tiles & move the side tabs
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on tiles
    And move the tabs
    Then validate the tiles                
                
  @tag44
  Scenario: Click on Fonts and Formats
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then validate the font and format page
    
  @tag45
  Scenario: Click on Fonts and Formats & click on radio button of Roboto in Font type
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then click on roboto
    
  @tag46
  Scenario: Click on Fonts and Formats & click on radio button of Helvetica in Font type
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then click on Helvetica  
    
  @tag47
  Scenario: Click on Fonts and Formats & click on radio button of Karla in Font type
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then click on karla  
    
  @tag48
  Scenario: Click on Fonts and Formats & click on radio button of Work sans in Font type
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then click on work sans
    
  @tag49
  Scenario: Click on Fonts and Formats & click on radio button of Poppins in Font type
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then click on Poppins
      
  @tag50
  Scenario: Click on Fonts and Formats & click on radio button of 70% in Font size
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then click on 70%    
    
  @tag51
  Scenario: Click on Fonts and Formats & click on radio button of 80% in Font size
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then click on 80%        
    
  @tag52
  Scenario: Click on Fonts and Formats & click on radio button of 90% in Font size
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then click on 90%    
    
  @tag53
  Scenario: Click on Fonts and Formats & click on radio button of 100% in Font size
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then click on 100%    
    
  @tag54
  Scenario: Click on Fonts and Formats & click on radio button of 115% in Font size
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then click on 115%    
    
  @tag55
  Scenario: Click on Fonts and Formats & click on radio button of 125% in Font size
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then click on 125%    
    
  @tag56
  Scenario: Click on Fonts and Formats & click on radio button of 135% in Font size
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then click on 135%                
    
  @tag57
  Scenario: Click on Fonts and Formats & click on radio button of 150% in Font size
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then click on 150%      
    
  @tag58
  Scenario: Click on Fonts and Formats & switch the messaging format to hide in Message Entrybox Icons
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then switch the messaging format to hide
    
  @tag59
  Scenario: Click on Fonts and Formats & switch the messaging format to show in Message Entrybox Icons
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then switch the messaging format to show   
    
  @tag60
  Scenario: Click on Fonts and Formats & switch the forkout to hide in Message Entrybox Icons
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then switch the forkout to hide
    
  @tag61
  Scenario: Click on Fonts and Formats & switch the forkout to show in Message Entrybox Icons
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then switch the forkout to show  
    
  @tag62
  Scenario: Click on Fonts and Formats & switch the read receipt to hide in Message Entrybox Icons
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then switch the read receipt to hide
    
  @tag63
  Scenario: Click on Fonts and Formats & switch the read receipt to show in Message Entrybox Icons
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then switch the read receipt to show 
    
  @tag64
  Scenario: Click on Fonts and Formats & switch the voice messaging to hide in Message Entrybox Icons
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then switch the voice messaging to hide
    
  @tag65
  Scenario: Click on Fonts and Formats & switch the voice messaging to show in Message Entrybox Icons
    Given user has navigated to login page
    When user enters valid email address "android@tm.com" into email field
    And user entered valid password "123456" into password field
    And user clicks on login button
    Then user should get successfully logged in
    And click on personal settings tab
    And click on font and format
    Then switch the voice messaging to show  
            
    
            
                    
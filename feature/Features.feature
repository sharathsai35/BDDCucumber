Feature: SignUp functionality in slips application

  Scenario: Verify user signup with Google account
    Given User launches the chrome browser
    And User enters URL as "https://slips.techietalk.com"
    When User clicks on "Or sign in with Google account"
    And User click on the "Sign in with Google"
    And User enter email as "lsggujjarlamudi@gmail.com"
    And User click on "Next"
    And User enters password as "Vik@s123"
    And User clicks on "Next" again
    Then The page title should be "Slips"
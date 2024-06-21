Feature: Ezugi Provider Functionality Verification
Background: 
    Given Open the browser
    When  Enter the url
    Then  The user is on the home page
    But  The user click the Ezugi provider and redirected to the respective page.

Scenario: Verify Ezugi Provider Status
    Given The Ezugi provider should be open
    When The Ezugi provider should be functioning correctly for both casino and live casino services

Scenario: Verify User Interaction                           
    Given the user should be able to open all the games properly
    When the login popup should be displayed when user attempting to open games without logging in    
    Then the deposit popup should be displayed when user attempting to open games with low balance
    But the user should be able to place a bet successfully
    And the placed bet amounts should be correctly deducted from the wallet
    And the user should not able to play multiple Ezugi games in multiple tabs
    And the game should function properly when the user logout while playing
    And the winning amounts should be correctly added to the wallet
    And Verify whether the game opens in full-screen view
    And Verify whether the game banner name is displayed inside the game or not
    And Verify that clicking on the "One day teen patti" have to open without any error
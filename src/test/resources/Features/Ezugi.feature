Feature: Check the Ezugi Provider functionality is properly working

@login  
Scenario: Check whether Ezugiprovider should be open
Given  The user click the casino category and click the livecasino and casino1.
When  Users click ezugi provider and view the games displayed1

@TC02
Scenario: Check the Ezugi provider should be functioning correctly for both casino and live casino services
Given  The user click the casino category and click the casino service page2
When  User click the ezugi provider2
Then  The user click the casino category and click the livecasino service page2
And   User click the ezugi provider2-

@TC03
Scenario: Check the user should be able to open all the games properly
Given   The user click the casino category and click the ezugi provider3
When   Users should be able to access all ezugi provider games seamlessly3

@TC04
Scenario: Check the login popup should be displayed when user attempting to open games without logging in 
Given The user click the casino category and click the ezugi provider4
When  The user click the game inside the ezugi provider and check it open without login4

@TC05
Scenario: Check the deposit popup should be displayed when user attempting to open games with low balance
Given   The user click the casino category and click the ezugi provider5
When   The user click the game inside the ezugi provider and check it open with low balance5

@TC06
Scenario: Check the user should not able to play multiple Ezugi games in multiple tabs
Given  The user click the casino category and click the ezugi provider6
When   Users should be able to access all ezugi provider games seamlessly6

@TC07
Scenario: Check the game should function properly when the user logout while playing 
Given  The user click the casino category and click the ezugi provider7
When   User should able to access the game7
Then   User logout7
      
@TC08      
Scenario: Verify that clicking on the "One day teen patti" have to open without any error
Given   The user click the casino category and click the ezugi provider8
When   User click the onedayteenpaati game and it should open8 

   
Feature: Login into Application

Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://www.qaclickacademy.com" site
And Click on Login Link in home page to load on Secure sign in page
When User enters <username> and <password> and logs in
Then Verify that user is successfully logged in
And Close Browsers

Examples:
|username			|password		|
|test99@gmail.com	|123456			|
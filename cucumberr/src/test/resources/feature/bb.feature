Feature: Checking Login action of the Orange hrm Web Application
 
Scenario: Login using the correct credentials
 
Given User will Login Page
When User enters the valid username and password
When User Clicks the login button in login page
Then User should be able to login successfully and naviging to the dashboard page

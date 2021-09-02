Feature: Validation of Adactin Login Page

Scenario: To validate login functionality with invalid username and password
Given User launch the browser and navigate to adactin page
When user enters the username and password in adactin homepage
When user clicks the login button
Then user validates the error message

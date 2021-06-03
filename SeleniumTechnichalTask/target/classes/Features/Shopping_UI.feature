@UI
Feature: Create new user and Buy a Blouse Using BDD
#As a user I want to register in this web and buy a blouse to my cart
#-------------------------------------------------------------------------------
#Create new user 
Scenario: Register with new user in automationpractice Werbsite
Given User navigate to automationpractice web
When Enter email and click on Create button
|Email|
|"<Email>"| 
And User Fill the required fields with valid data
|FirstName|LastName|Password|Address|City|ZipCode|Phone|
|"<FirstName>"|"<LastName>"|"<Password>"|"<Address>"|"<City>"|"<ZipCode>"|"<Phone>"|
And user navigate to my account page and signout
Then user returned to the homepage
#------------------------------------------------------------------------------
#Login with the new user and add blouse to cart
Scenario: Login with the new user and add blouse to cart
Given User navigates to the login Page
And User Login with the new credentials
|Email|Password|
|"<Email>"|"<Password>"|
When Select the blouse
And Proceed checkout steps with bank wire payment option
Then Assert this order in the history page
@test 
Feature: Login feature for Vmmaps login

@login
Scenario: validate the sncenario with registered accound

Given I am on the login page 
When I enter my valid email
Then I enter my valid password
And I click on login botton
Then I Should be logged into my account

@Rgistration
Scenario: validate the Registration

Given I am on the registration page
When I click the sign up button 
When  I enter the full name
Then  I enter the email adress
And  I enter the Mobile number
Then I enter the password
And I enter the Confrim password
Then I click the Agree button
And I click the I would sign up button 
Then I Click the Register button

@Forget_password
Scenario: validate  the Forget password

Given I am on Login page
Then I click  on the forget password

 
  
Feature: Feature to test Register functionality

Scenario: Username Field Required Validation
Given the user is on "Registrationspage"
When the user enters "" in the usernamefield and submits the form
Then the system should display a validation message indicating that "Please fill out this field." for "username"

Scenario:  Character Limit for usernamefield
Given the user is on "Registrationspage"
When the user enters "more than 150 characters" in the usernamefield and submits the form
Then the system should display a validation message indicating that "the username exceeds the character limit of 150" for "username"

Scenario: Password Validation with commonly used password on Registration Form
Given the user is on "Registrationspage"
When the user enters a username with allowed charcters "@,.,+,-,_" and password with "password"
Then the system should display a validation message indicating that "password_mismatch:The two password fields didn’t match." for "paasword"

Scenario: Password Validation with entirely numeric on Registration Form
Given the user is on "Registrationspage"
When the user enters a username with allowed charcters "@,.,+,-,_" and password with "123456789"
Then the system should display a validation message indicating that "password_mismatch:The two password fields didn’t match." for "paasword"

Scenario: Password Validation with must contain at least eight characters on Registration Form
Given the user is on "Registrationspage"
When the user enters a username with allowed charcters "@,.,+,-,_" and password with "Af589"
Then the system should display a validation message indicating that "password_mismatch:The two password fields didn’t match." for "paasword"

Scenario: Password Mismatch Validation on Registration Form
Given the user is on "Registrationspage"
When the user enters different passwords in the password "admin1234" and password confirmation fields "Admin@789" and submits the form,
Then the system should display a validation message indicating that "password_mismatch:The two password fields didn’t match." for "paasword"

Scenario: Redirection to Login Page from Registration Form
Given the user is on "Registrationspage"
When the user clicks on the "Login" link
Then the system should redirect the user to the "Login"
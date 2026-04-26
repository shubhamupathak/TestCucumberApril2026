Feature: Login HR Management
I Want to validate the Username and Password field of Login Page.
Scenario: Validate HRM Login Page multiple fields
Given User is on HRM login page
When User enters username
And User enters password
Then Check username is present in username textbox
And Check password is present in password textbox
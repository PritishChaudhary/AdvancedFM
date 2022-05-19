Feature: Testing login feature

Scenario: Valid Credentials
Given User launches the App
When User enters correct credentials
Then User should see success message

Scenario: Invalid Credentials
Given User launches the App
When User enters invalid credentials
Then User should see error message


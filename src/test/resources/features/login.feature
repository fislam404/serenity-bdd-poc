Feature: Login from 
A valid user should be able to log in with valid user name and pasword

Scenario: Log on as admin
Given Admin is on the loginpage
When Admin enters valid username
And Admin enters valid password
And Admin press Login
Then Admin should successfully logged in
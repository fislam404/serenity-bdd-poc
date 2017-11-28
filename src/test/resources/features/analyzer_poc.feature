Feature: PUC - be able to login, create an analyzer report and add fields 
	A valid user should be able to log in with valid user name and password. User should be able to
	create new analyzer report with datasource. User should be able to add fields in the report by 
	drag & drop and double click.

Scenario: Creating an analyzer report with multiple fields 
	Given Admin is logged in as a valid user 
	When Admin creates new analyzer report 
	And Admin selects datasource 
	Then Admin should be in the Analyzer report page 
	When Admin adds fields by double clicking 
	And Admin adds fields by drag and drop 
	Then Admin should see the fields added to Analyzer rport
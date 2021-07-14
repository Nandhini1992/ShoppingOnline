@Scenario2
Feature: Update Personal Information (First Name) in My Account

	
Scenario Outline: 
	When User clicks sign in Link 
	Then User enters email address "<email>"
    Then User enters password "<password>"
	Then User clicks signin button
	Then user click  Personal Information Link
	Then user update firstname "<firstname>"
	Then user provide old password "<password>"
	Then user click save button
	Then user verify whether the update is successful
	
	
	Examples: 
		|email                      |password  |firstname|
		|nandhunarayanan92@gmail.com|Speed@1992|subha    |
		
	
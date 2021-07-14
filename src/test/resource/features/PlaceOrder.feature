@Scenario1
Feature: Order T-Shirt and Verify in Order History


	
Scenario Outline: 
	When User clicks sign in Link 
	Then User enters email address "<email>"
    Then User enters password "<password>"
	Then User clicks signin button
	Then user click T-Shirt link 
	Then user click product image
	Then user click add to cart button
	Then user click ProceedToCheckout
	Then user click ProceedToCheckout in summary page
	Then user click ProceedToCheckout in address page
	Then user click CheckBox Agree To Terms in Shipping Page
	Then user click ProceedToCheckout in shipping page
	Then user click PayByBankWire Payment Page
	Then user click I Confirm My Order Page
	Then user verify the order is completed
	
	
	Examples: 
		|email                      |password|
		|nandhunarayanan92@gmail.com|Speed@1992|
		
	
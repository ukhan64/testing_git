Feature: Techfios Other login functionality validation 

#Background: 
#Given user is on Techfios login page 
@uk
Scenario Outline: Other User should be able to login with valid credentials 
	Given User is on the Techfios login page 
	When User enters password as "<password>"
	When User enters username as "<username>" 
	 	When User clicks on signin button
	Then User should land on Dashboard page 
	Examples:
	|username				|password|
	|demo@techfios.com		| abc123|
#	|demo@techfios.com		| abc124|
#	|demo12@techfios.com		| abc123|
#	|demo@techfios.com		| abcdd123|
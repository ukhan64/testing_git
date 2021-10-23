Feature: Techfios login functionality validation 

#Background: 
#Given user is on Techfios login page 
@Scenario1 
Scenario: User should be able to login with valid credentials 
	Given User is on the Techfios login page 
#	When User enters username as "demo@techfios.com" 
#	When User enters password as "abc123" 
	When User enters "username" from mysql database         
	When User enters "password" from mysql database 
	When User clicks on signin button 
	Then User should land on Dashboard page 
	

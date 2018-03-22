Feature: facebook  login 

Scenario: login with right user and wrong password 
	Given I enter Username as "fredoz0999@gmail.com"
	
	Then I enter Password as "123456"
	Then clickon ".//*[@id='loginbutton']"
	
	
Scenario: fhdfsdfjksfsdfh
    Given I enter Username as "pnt@gmail.com"
    Then I enter Password as "9999999"
	Then clickon ".//*[@id='loginbutton']"
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@loginFunc
Feature: Login Functinality

		Background: Prerequisites
		Given User is on login page

  @VakidLogin
  Scenario: User login with valid credential
    When User fill valid credential and click on login button
    Then Verify user is logged in

  @InvalidLogin
  Scenario Outline: User login with invalid credential or blank credential
    When User fill username as "<username>" and password as "<password>" and click on login button
    Then Verify the error message "<error_message>" for this "<test>"

    Examples: 
      |test     |username |password   |
      |email    |wrong    |pradeep@123|
      |password |         |pradeep@123|
      |invalid  |pradeep  |wrong      |
      |password |wrong    |pradeep@12 |
      |password |pradeep  |           |

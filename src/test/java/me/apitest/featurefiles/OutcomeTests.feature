@OutcomeTests
Feature: As a user I want to see a Full Time Result market have Home, Away and Draw outcomes associated

	
  @OutcomTestOne
  Scenario: Market has a name of Full Time Result
  	Given I get a response from "http://localhost:8888/sportsbook/market/" url with id "93649304"
    Then I assert market returned has "name" label as "Full Time Result"
    
  @OutcomeTestTwo
  Scenario: Outcome associated with Full Time Result market has away type
  	 Given I get a response from "http://localhost:8888/sportsbook/outcome/" url with id "367528726"
  	 Then I assert the outcome has "type" label as "away"
  	 
  @OutcomeTestThree
  Scenario: Outcome associated with Full Time Result market has draw type
  	 Given I get a response from "http://localhost:8888/sportsbook/outcome/" url with id "367528720"
  	 Then I assert the outcome has "type" label as "draw"
  	 
  @OutcomeTestFour
  Scenario: Outcome associated with Full Time Result market has home type
  	 Given I get a response from "http://localhost:8888/sportsbook/outcome/" url with id "367528716"
  	 Then I assert the outcome has "type" label as "home"

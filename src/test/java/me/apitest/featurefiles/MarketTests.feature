@MarketTests
Feature: As a user I wish to be able to see a market for ‘Both Teams To Score’ so that I
can place a bet on this market (display property is true)

	Background:
		Given I get a response from "http://localhost:8888/sportsbook/market/" url with id "93649377"
	
  @MarketTestOne
  Scenario: I can see a market named "Both Teams To Score"
    Then I assert market returned has "name" label as "Both Teams To Score"
    
  @MarketTestTwo
  Scenario: I can see a market named "Both Teams To Score" with display property as true
    Then I assert market "status" has a "displayable" as "true"
    
  @MarketTestThree
  Scenario: I can see a market named "Both Teams To Score" with suspended property as false
    Then I assert market "status" has a "suspended" as "false"
    
  @MarketTestFour
  Scenario: I can see a market named "Both Teams To Score" with suspended property as false
    Then I assert market "status" has a "active" as "true"



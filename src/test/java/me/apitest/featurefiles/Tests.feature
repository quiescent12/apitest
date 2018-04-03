@ApiTest
Feature: Tests for sports betting api

  @TestOne
  Scenario: All events returned from the football/live api endpoint are football events
    Given I get a response from "http://localhost:8888/football/live" url
    Then I assert all events returned have "className" label as "Football"
    
  @TestTwo
  Scenario: Each event has a home and an away competitor
  	Given I get a response from "http://localhost:8888/football/live" url
  	When I assert all events "competitors" has a "position" as "away"
  	Then I assert all events "competitors" has a "position" as "home"
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/me/apitest/featurefiles/OutcomeTests.feature");
formatter.feature({
  "name": "As a user I want to see a Full Time Result market have Home, Away and Draw outcomes associated",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@OutcomeTests"
    }
  ]
});
formatter.scenario({
  "name": "Market has a name of Full Time Result",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@OutcomeTests"
    },
    {
      "name": "@OutcomTestOne"
    }
  ]
});
formatter.step({
  "name": "I get a response from \"http://localhost:8888/sportsbook/market/\" url with id \"93649304\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.getAResponseFromUrlWithId(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assert market returned has \"name\" label as \"Full Time Result\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.assertAllMarketsAre(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Outcome associated with Full Time Result market has away type",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@OutcomeTests"
    },
    {
      "name": "@OutcomeTestTwo"
    }
  ]
});
formatter.step({
  "name": "I get a response from \"http://localhost:8888/sportsbook/outcome/\" url with id \"367528726\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.getAResponseFromUrlWithId(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assert the outcome has \"type\" label as \"away\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.assertOutcomeLabelsHasTags(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Outcome associated with Full Time Result market has draw type",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@OutcomeTests"
    },
    {
      "name": "@OutcomeTestThree"
    }
  ]
});
formatter.step({
  "name": "I get a response from \"http://localhost:8888/sportsbook/outcome/\" url with id \"367528720\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.getAResponseFromUrlWithId(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assert the outcome has \"type\" label as \"draw\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.assertOutcomeLabelsHasTags(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Outcome associated with Full Time Result market has home type",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@OutcomeTests"
    },
    {
      "name": "@OutcomeTestFour"
    }
  ]
});
formatter.step({
  "name": "I get a response from \"http://localhost:8888/sportsbook/outcome/\" url with id \"367528716\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.getAResponseFromUrlWithId(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assert the outcome has \"type\" label as \"home\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.assertOutcomeLabelsHasTags(String,String)"
});
formatter.result({
  "status": "passed"
});
});
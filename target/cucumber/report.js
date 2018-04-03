$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/me/apitest/featurefiles/MarketTests.feature");
formatter.feature({
  "name": "As a user I wish to be able to see a market for ‘Both Teams To Score’ so that I",
  "description": "can place a bet on this market (display property is true)",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@MarketTests"
    }
  ]
});
formatter.scenario({
  "name": "I can see a market named \"Both Teams To Score\" with display property as true",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MarketTests"
    },
    {
      "name": "@MarketTestThree"
    }
  ]
});
formatter.step({
  "name": "I get a response from \"http://localhost:8888/sportsbook/market/\" url with id \"93649377\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.getAResponseFromUrlWithId(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assert market \"status\" has a \"suspended\" as \"false\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.assertMarketLabelsHasTags(String,String,String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: Market label status does not have suspended tag as false expected:\u003c[fals]e\u003e but was:\u003c[tru]e\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat me.apitest.stepdefs.StepDefinitions.assertMarketLabelsHasTags(StepDefinitions.java:74)\r\n\tat ✽.I assert market \"status\" has a \"suspended\" as \"false\"(src/test/java/me/apitest/featurefiles/MarketTests.feature:18)\r\n",
  "status": "failed"
});
});
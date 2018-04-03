package me.apitest.runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@MarketTestThree"}, plugin = { "pretty",
		"html:target/cucumber" }, features = "src/test/java/me/apitest/featurefiles/", glue = "me.apitest.stepdefs")
public class CucumberRunner {

}

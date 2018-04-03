package me.apitest.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import me.apitest.APIConnection;
import me.apitest.JSONObjectHandler;
import me.apitest.ResponseObject;
import cucumber.api.java.en.Then;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.internal.LinkedTreeMap;

import cucumber.api.java.en.And;

public class StepDefinitions {
	
	ResponseObject responseObject = null;
	JSONObjectHandler jsonObjectHandler = new JSONObjectHandler();

	@Given("^I get a response from \"([^\"]*)\" url$")
	  public void getAResponseFromUrl(String url) throws Throwable {
		APIConnection apiConnection = new APIConnection(url, null);
		responseObject = apiConnection.get();
	}
	
	@Given("^I get a response from \"([^\"]*)\" url with id \"([^\"]*)\"$")
	  public void getAResponseFromUrlWithId(String url, String id) throws Throwable {
		APIConnection apiConnection = new APIConnection(url, id);
		responseObject = apiConnection.get();
	}

	@When("^I assert all events returned have \"([^\"]*)\" label as \"([^\"]*)\"$")
	  public void assertAllAre(String labelName, String param) throws Throwable {
		ArrayList<LinkedTreeMap<String,Object>> array = jsonObjectHandler.getJSONObjectArray(responseObject.getReponseBody(), "events");
		for(LinkedTreeMap<String,Object> map : array) {
			String returned = (String) map.get(labelName);
			assertEquals("Value returned " + returned + " does not equal " + param, param, returned);
		}
	}

	@Then("^I assert all events \"([^\"]*)\" has a \"([^\"]*)\" as \"([^\"]*)\"$")
	  public void assertEventsLabelsHasTags(String label, String tag, String param) throws Throwable {
		ArrayList<LinkedTreeMap<String,Object>> array = jsonObjectHandler.getJSONObjectArray(responseObject.getReponseBody(), "events");
		ArrayList<String> positions = new ArrayList<String>();
		for(LinkedTreeMap<String,Object> map : array) {
			assertTrue("All events do not have label " + label, map.containsKey(label));
			ArrayList<LinkedTreeMap<String,Object>> returned = (ArrayList<LinkedTreeMap<String,Object>>) map.get(label);
			for(LinkedTreeMap<String,Object> competitors : returned) {
				assertTrue("All " + label + " do not have tag " + tag, competitors.containsKey(tag));
				String position = (String)competitors.get(tag);
				positions.add(position);
			}
			assertTrue("All " + label + " do not have a " + tag + " as " + param, positions.contains(param));
			positions.clear();
		}
		
	}

	@When("^I assert market returned has \"([^\"]*)\" label as \"([^\"]*)\"$")
	  public void assertAllMarketsAre(String labelName, String param) throws Throwable {
		LinkedTreeMap<String,Object> treeMap = jsonObjectHandler.getJSONObjectLinkedTreeMap(responseObject.getReponseBody(), "market");
		
		assertEquals("The market label " + labelName + " does not equal " + param, param, treeMap.get(labelName));
	}
	
	@Then("^I assert market \"([^\"]*)\" has a \"([^\"]*)\" as \"([^\"]*)\"$")
	  public void assertMarketLabelsHasTags(String label, String tag, String param) throws Throwable {
		LinkedTreeMap<String,Object> treeMap = jsonObjectHandler.getJSONObjectLinkedTreeMap(responseObject.getReponseBody(), "market");
		treeMap = (LinkedTreeMap<String,Object>) treeMap.get(label);
	
		assertEquals("Market label " + label + " does not have " + tag + " tag as " + param, param, treeMap.get(tag).toString());
	}
}

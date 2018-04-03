package me.apitest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import me.apitest.objects.Event;
import me.apitest.objects.Market;
import me.apitest.objects.Outcome;

public class JSONObjectHandler {

	public Outcome getJSONObjectAsOutcome(String response) {
		
		Outcome outcome = new Gson().fromJson(response, Outcome.class);
		return outcome;
	}
	
	public Market getJSONObjectAsMarket(String response) {
		Market market = new Gson().fromJson(response, Market.class);
		return market;
	}
	
	public Event getJSONObjectAsEvent(String response) {
		Event event = new Gson().fromJson(response, Event.class);
		return event;
	}
}

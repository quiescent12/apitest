package me.apitest.objects;

import java.util.ArrayList;

import com.google.gson.internal.LinkedTreeMap;

public class Event {
	
	private ArrayList<LinkedTreeMap<String,Object>> events;
	private LinkedTreeMap<String,Object> markets;
	private LinkedTreeMap<String,Object> outcomes;
	
	public ArrayList<LinkedTreeMap<String,Object>> getEvents() {
		return events;
	}
	public void setEvents(ArrayList<LinkedTreeMap<String,Object>> events) {
		this.events = events;
	}
	public LinkedTreeMap<String,Object> getMarkets() {
		return markets;
	}
	public void setMarkets(LinkedTreeMap<String,Object> markets) {
		this.markets = markets;
	}
	public LinkedTreeMap<String,Object> getOutcomes() {
		return outcomes;
	}
	public void setOutcomes(LinkedTreeMap<String,Object> outcomes) {
		this.outcomes = outcomes;
	}

}

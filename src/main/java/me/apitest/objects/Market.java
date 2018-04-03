package me.apitest.objects;

import com.google.gson.internal.LinkedTreeMap;

public class Market {
	
	private LinkedTreeMap<String,Object> market;
	
	private LinkedTreeMap<String,Object> outcomes;

	public LinkedTreeMap<String,Object> getMarket() {
		return market;
	}

	public void setMarket(LinkedTreeMap<String,Object> market) {
		this.market = market;
	}

	public LinkedTreeMap<String,Object> getOutcomes() {
		return outcomes;
	}

	public void setOutcomes(LinkedTreeMap<String,Object> outcomes) {
		this.outcomes = outcomes;
	}

}

package me.apitest.objects;

import com.google.gson.internal.LinkedTreeMap;

public class Outcome {
	
	private LinkedTreeMap<String,Object> outcome;

	public LinkedTreeMap<String,Object> getOutcome() {
		return outcome;
	}

	public void setOutcome(LinkedTreeMap<String,Object> outcome) {
		this.outcome = outcome;
	}

}

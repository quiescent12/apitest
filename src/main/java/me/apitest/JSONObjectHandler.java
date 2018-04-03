package me.apitest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.internal.LinkedTreeMap;

public class JSONObjectHandler {

	public ArrayList<LinkedTreeMap<String,Object>> getJSONObjectArray(String response, String responseContains) {
		
		Gson gson = new Gson();
		Map<String,ArrayList<LinkedTreeMap<String,Object>>> map = new HashMap<String,ArrayList<LinkedTreeMap<String,Object>>>();
		try {
		map = (Map<String,ArrayList<LinkedTreeMap<String,Object>>>) gson.fromJson(response, map.getClass());
		} catch (Exception e) {
			e.printStackTrace();
		}
		ArrayList<LinkedTreeMap<String,Object>> array = map.get(responseContains);
		return array;
	}
	
	public LinkedTreeMap<String,Object> getJSONObjectLinkedTreeMap(String response, String responseContains) {
		
		Gson gson = new Gson();
		Map<String,LinkedTreeMap<String,Object>> map = new HashMap<String,LinkedTreeMap<String,Object>>();
		try {
		map = (Map<String,LinkedTreeMap<String,Object>>) gson.fromJson(response, map.getClass());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		LinkedTreeMap<String,Object> treeMap = map.get(responseContains);
		
		return treeMap;
	}
}

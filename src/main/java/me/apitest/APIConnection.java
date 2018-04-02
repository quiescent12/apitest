package me.apitest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class APIConnection {

	private String url;
	private HttpClient httpClient;
	
	public APIConnection(String url) {
		httpClient = HttpClientBuilder.create().build();
		this.url = url;
	}
	
	public void get() {
		HttpGet request = new HttpGet(url);
		HttpResponse response;
		
		StringBuffer responseString = new StringBuffer();
		try {
			response = httpClient.execute(request);
			
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			String line = "";
			while ((line = rd.readLine()) != null) {
			responseString.append(line);
			}
			System.out.println("Reponse= " + responseString.toString());
		} catch (Exception e) {
			e.printStackTrace();;
		}
	}
}

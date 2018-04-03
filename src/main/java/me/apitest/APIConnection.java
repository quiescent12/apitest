package me.apitest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import me.apitest.objects.ResponseObject;

import static org.junit.Assert.*;

public class APIConnection {

	private String url;
	private HttpClient httpClient;
	
	public APIConnection(String url, String id) {
		httpClient = HttpClientBuilder.create().build();
		url = url + (id == null ? "" : id);
		this.url = url;
		System.out.println("URL>>> " + url);
	}
	
	public ResponseObject get() {
		
		HttpGet request = new HttpGet(url);
		HttpResponse response;
		ResponseObject responseObject = new ResponseObject();
		
		StringBuffer responseString = new StringBuffer();
		try {
			response = httpClient.execute(request);
			
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			String line = "";
			while ((line = rd.readLine()) != null) {
			responseString.append(line);
			}
			
			responseObject.setResponseBody(responseString.toString());
			System.out.println("Response= " + responseObject.getResponseBody());
			
			System.out.println("Headers= " + response.getAllHeaders());
			
			responseObject.setStatusCode(response.getStatusLine().getStatusCode());
			System.out.println("Response status code= " + responseObject.getStatusCode());
			
			responseObject.setResponsePhrase(response.getStatusLine().getReasonPhrase());
			System.out.println("Response reason phrase= " + responseObject.getResponsePhrase());
			
			validateResponseStatusCode(responseObject);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseObject;
	}
	
	public void validateResponseStatusCode(ResponseObject responseObject) {
		
		assertEquals("Response code is " + responseObject.getStatusCode() + " not 200", 200, responseObject.getStatusCode());
	}
}

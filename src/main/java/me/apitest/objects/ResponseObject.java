package me.apitest.objects;

import java.util.HashMap;

public class ResponseObject {

	private String responseBody;
	private int statusCode;
	private String responsePhrase;
	private HashMap<String, String> headers;
	
	public String getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getResponsePhrase() {
		return responsePhrase;
	}
	public void setResponsePhrase(String responsePhrase) {
		this.responsePhrase = responsePhrase;
	}
	public HashMap<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(HashMap<String, String> headers) {
		this.headers = headers;
	}
	public String getHeader(String name) {
		return headers.get(name);
	}

	public void setHeader(String name, String value) {
		this.headers.put(name, value);
	}
	
}

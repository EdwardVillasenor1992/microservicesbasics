package com.example.microservicesbasics.kittens.web;

public class KittensWebResult {
	private String id;
	private String name;
	private String apiUrl;
	
	
	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}

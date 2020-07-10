package com.example.restservice;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {

	@JsonProperty("Counter")
	private final long id;
	
	@JsonProperty("Greeting")
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
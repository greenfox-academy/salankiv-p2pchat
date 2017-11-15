package com.greenfox.salankiv.p2pchat.model;

public class Client {
	private String id;

	public Client() {
		this.id = "CHAT_APP_UNIQUE_ID";
	}

	public Client(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "client: {" + "\n" +
				"id: " + this.getId() + "\n" +
				"}";
	}
}

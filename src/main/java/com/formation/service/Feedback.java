package com.formation.service;

import java.time.LocalDateTime;

public class Feedback {
	
	private int id;
	private String user;
	private String message;
	private LocalDateTime event_time;
	
	public Feedback(int id, String user, String message) {
		super();
		this.id = id;
		this.user = user;
		this.message = message;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getEvent_time() {
		return event_time;
	}
	public void setEvent_time(LocalDateTime event_time) {
		this.event_time = event_time;
	}
	
}

package com.formation.service;

import java.time.LocalDateTime;

public class Message {
	
	private int id;
	private String fromUser;
	private String toUser;
	private String content;
	private LocalDateTime eventTime;
	
	public Message(int id, String fromUser, String toUser, String content) {
		super();
		this.id = id;
		this.fromUser = fromUser;
		this.toUser = toUser;
		this.content = content;
		this.eventTime = LocalDateTime.now();
	}
	
	public Message() {

	}
	
	public Message(int id, String content) {
		this.id = id;
		this.content = content;
		this.eventTime = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		return "Message [id=" + id + ", fromUser=" + fromUser + ", toUser=" + toUser + ", content=" + content
				+ ", eventTime=" + eventTime + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromUser() {
		return fromUser;
	}

	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}

	public String getToUser() {
		return toUser;
	}

	public void setToUser(String toUser) {
		this.toUser = toUser;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
	}

}

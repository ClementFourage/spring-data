package com.formation.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.formation.service.Message;

public interface MessageDao {
	
	public void save(Message message);
	
	public List<Message> findAllMessages();
	
	public List<Message> findMessages(String user);
	
	public List<Message> findMessagesThisDay(String user, LocalDate day);
	
	public void delete(String user);
	
	public void modify(Message oldMassage, String newContent, LocalDateTime newEventTime);

}

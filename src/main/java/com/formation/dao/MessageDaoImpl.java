package com.formation.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.formation.service.Message;

@Repository
public class MessageDaoImpl implements MessageDao {
	private EntityManager em;

	@Override
	public void save(Message message) {
		em.persist(message);
	}

	@Override
	public List<Message> findAllMessages() {
		return null;
	}

	@Override
	public List<Message> findMessages(String user) {
		return null;
	}

	@Override
	public List<Message> findMessagesThisDay(String user, LocalDate day) {
		return null;
	}

	@Override
	public void delete(String user) {
		
	}

	@Override
	public void modify(Message oldMassage, String newContent, LocalDateTime newEventTime) {
		
	}

	

}
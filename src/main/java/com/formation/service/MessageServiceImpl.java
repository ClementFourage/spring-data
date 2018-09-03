package com.formation.service;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {
	private EntityManagerFactory emf;

	@Override
	public void send(MessageDto message) {
		EntityManager em = this.emf.createEntityManager();
		Query query = em.createQuery("insert into message (id, fromUser, toUser, content, event_time) values(?,?,?,?,?)");
	
	}

	@Override
	public void edit(MessageDto editedMsg) {
		
	}

	@Override
	public void delete(String fromUser, String toUser) {
		
	}

	@Override
	public List<MessageDto> findAllMessages() {
		return null;
	}

	@Override
	public List<MessageDto> findMessageSendToAUserADay(String toUser, LocalDate day) {
		return null;
	}

	@Override
	public List<MessageDto> findAllMessageFromUser(String fromUser) {
		return null;
	}

}

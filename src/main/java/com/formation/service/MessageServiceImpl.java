package com.formation.service;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {

	@Override
	public void send(MessageDto message) {
		
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

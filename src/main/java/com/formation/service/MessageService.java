package com.formation.service;

import java.time.LocalDate;
import java.util.List;

/**
 * Interface to give feedback to the user
 */

public interface MessageService {
	void send(MessageDto message);

	void edit(MessageDto editedMsg);

	void delete(String fromUser, String toUser);

	List<MessageDto> findAllMessages();

	List<MessageDto> findMessageSendToAUserADay(String toUser, LocalDate day);

	List<MessageDto> findAllMessageFromUser(String fromUser);
	
}
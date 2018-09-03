package com.formation.user;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.formation.service.Message;
import com.formation.service.MessageService;

@Component
public class ChatConsole {
	private String currentUser;
	
	@Autowired
	private MessageService service;

	public void sendHelloTo(String toUser) {
		service.send(new Message(1, currentUser, toUser, MessageFormat.format("Hello {0} !", toUser)));
	}

	public void sendGoodbyeTo(String toUser) {
		service.send(new Message(2, currentUser, toUser, MessageFormat.format("Goodbye {0} !", toUser)));
	}
	
	public void editMessage(String content, Integer idMessage) {
		service.edit(new Message(idMessage, content));
	}
	
	public void deleteMessageToUser(String toUser) {
		service.delete(currentUser, toUser);
	}
	
	public List<Message> findMessageToUserToday(String toUser) {
		return service.findMessageSendToAUserADay(toUser, LocalDate.now());
	}

	public String getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}
	
}
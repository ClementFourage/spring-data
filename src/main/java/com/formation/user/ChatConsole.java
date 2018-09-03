package com.formation.user;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.formation.service.MessageDto;
import com.formation.service.MessageService;

@Component
public class ChatConsole {
	
	private int id;
	private String currentUser;
	
	@Autowired
	private MessageService service;

	public void sendHelloTo(String toUser) {
		service.send(new MessageDto(currentUser, toUser, MessageFormat.format("Hello {0} !", toUser)));
		id++;
	}

	public void sendGoodbyeTo(String toUser) {
		service.send(new MessageDto(currentUser, toUser, MessageFormat.format("Goodbye {0} !", toUser)));
		id++;
	}
	
	public void editMessage(String content, Integer idMessage) {
		//service.edit(new MessageDto(idMessage, content));
	}
	
	public void deleteMessageToUser(String toUser) {
		service.delete(currentUser, toUser);
	}
	
	public List<MessageDto> findAllMessages(){
		return null;
	}
	
	public List<MessageDto> findMessageToUserToday(String toUser) {
		return service.findMessageSendToAUserADay(toUser, LocalDate.now());
	}

	public String getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}
	
}
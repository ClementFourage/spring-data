package com.formation.user;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.formation.service.IFeedback;

@Component
public class UserInteraction {
	private IFeedback feedback;

	public void sayHello(String name) {
		feedback.say(MessageFormat.format("Hello {0} !", name));
	}

	public void sayGoodBye(String name) {
		feedback.say(MessageFormat.format("Goodbye {0} !", name));
	}
	
	public int sayTheCaptainAgeForAFamousThreeMast() {
		return feedback.giveMeTheCaptainAge(10, 3);
	}

	@Autowired
	public void setFeedback(IFeedback feedback) {
		this.feedback = feedback;
	}

}
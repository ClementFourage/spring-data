package com.formation.user;

import java.text.MessageFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.formation.service.Feedback;
import com.formation.service.IFeedbackService;

@Component
public class UserInteraction {
	private IFeedbackService feedbackService;

	public void sayHello(String user) {
		feedbackService.say(new Feedback(1, user, MessageFormat.format("Hello {0} !", user)));
	}

	public void sayGoodBye(String user) {
		feedbackService.say(new Feedback(2, user, MessageFormat.format("Goodbye {0} !", user)));
	}
	
	public void makeABetterHelloTo(String user) {
		// met à jour un bonjour existant par le message "Big Up !"
		}
	
	public void deleteFeedbackWith(String user) {
		//Supprime tous les feedbacks avec un utilisateur
		}
	
	public List<Feedback> listWhatWasSaidToHimToday(String user) {
		return null;
		//Récupère tous les feedbacks du jour pour un user
		}
	
	@Autowired
	public void setFeedback(IFeedbackService feedback) {
		this.feedbackService = feedback;
	}

}
package com.formation.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class FeedbackToDatabaseService implements IFeedbackService {

	@Autowired 
	private JdbcTemplate jdbc;
	
	@Override
	//Ecrire le message dans la BDD
	public void say(Feedback newFeedback) {
		this.jdbc.update("insert into feedback(id, user, message) values (?,?,?)", newFeedback.getId(), newFeedback.getUser(), newFeedback.getMessage());
	}

	@Override
	//Modifer le message
	public void amend(Feedback updatedFeedback) {
		this.jdbc.update("update feedback set user = ?, message = ? where id = ?", updatedFeedback.getUser(), updatedFeedback.getMessage(), updatedFeedback.getId());
	}

	@Override
	//Supprimer le message
	public void unSayTo(String user) {
	}

	@Override
	public List<Feedback> tellMeAll() {
		return null;
	}

	@Override
	public List<Feedback> tellMeWhatWasSaidToHimThisDay(String user, LocalDate day) {
		return null;
	}

	@Override
	public List<Feedback> listAllFeedbackWith(String user) {
		return null;
	}
	
	

}

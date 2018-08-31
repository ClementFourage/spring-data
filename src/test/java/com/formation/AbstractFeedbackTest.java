package com.formation;

import static org.junit.Assert.*;

import org.junit.Test;

import com.formation.service.FeedbackToConsole;

public class AbstractFeedbackTest {
	FeedbackToConsole feedbackConsole = new FeedbackToConsole();
	
	@Test
	public void testgiveMeTheCaptainAge() {
		assertEquals(58, feedbackConsole.giveMeTheCaptainAge(10, 3));
		assertEquals(42, feedbackConsole.giveMeTheCaptainAge(0, 0));
	}

}

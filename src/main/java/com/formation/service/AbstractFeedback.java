package com.formation.service;

public abstract class AbstractFeedback implements IFeedback {

	public int giveMeTheCaptainAge(float boatSize, int nbMast) {
		long resultat = Math.round(Math.pow(boatSize, 2.0) + Math.cos((double) nbMast) * 42);
		return (int) resultat;
	}
}

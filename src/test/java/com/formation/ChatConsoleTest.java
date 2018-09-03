package com.formation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import com.formation.user.ChatConsole;

@ContextConfiguration(classes = { AppConfig.class })

@RunWith(SpringRunner.class)
public class ChatConsoleTest  {
	
	@Autowired
	private ChatConsole chatConsole;

	@Test
	public void chatConsoleTest() {
		//Avoir une interaction avec "sam" (utilisateur courant) et "bob" = hello/goodbye puis "foo"
		chatConsole.setCurrentUser("sam");
		chatConsole.sendHelloTo("bob");
		chatConsole.sendGoodbyeTo("bob");
		chatConsole.sendHelloTo("foo");
		chatConsole.sendGoodbyeTo("foo");
		
		//TODO : Vérifier qu'on a 2 messages avec Bob en destinataire dans la base
		
		// Modifier l'interaction avec bob :
		//chatConsole.editMessage("Big Up bob !", 1);
		
		//TODO Vérifier qu'on a bien toujours 2 éléments et qu'on a un message avec le contenu "Big Up bob!"
		
		//Supprimer les interactions avec bob :
		//chatConsole.deleteMessageToUser("bob");
		
		//TODO Vérifier qu'on n' a plus d'interactions avec bob
		//chatConsole.findMessageToUserToday("foo");
		
		//TODO Vérifier ce qui a été dit à foo aujourd'hui : Hello ! et Goodbye !
	}

}

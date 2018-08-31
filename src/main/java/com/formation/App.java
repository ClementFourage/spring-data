package com.formation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.user.UserInteraction;

public class App {
	
    public static void main( String[] args ) {
    	
    	String name = "Bender";
    	
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    	UserInteraction interaction = applicationContext.getBean(UserInteraction.class);
    	
    	interaction.sayHello(name);
    	interaction.sayGoodBye(name);
    
    }
}

package com.formation;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

import com.formation.service.FeedbackToDatabaseService;
import com.formation.service.IFeedbackService;
import com.formation.user.UserInteraction;

import database.MariaDBConfig;


@Configuration
@Import(MariaDBConfig.class)
public class AppConfig {
	
	DataSource dataSource;
	
	@Autowired
	public AppConfig(DataSource dataSource) {
	this.dataSource = dataSource;
	}
	
	@Bean
	public JdbcTemplate getJDBCTemplate() {
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public IFeedbackService getFeedbackService() {
		return new FeedbackToDatabaseService();
	}
	
	@Bean
	public UserInteraction UserInteraction() {
		return new UserInteraction();
	}
	
}

package com.formation;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.formation.dao.MessageDao;
import com.formation.service.MessageService;
import com.formation.user.ChatConsole;

import database.MariaDBConfig;

@Configuration
@Import(MariaDBConfig.class)
@EnableTransactionManagement // Activation de la gestion des transaction
@ComponentScan(basePackageClasses = { MessageService.class, ChatConsole.class, MessageDao.class }) // Ajout du package du Dao dans les composants scannés

public class AppConfig {
	
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(emf);
		return txManager;
	}
	
	@Bean
	public EntityManagerFactory entityManagerFactory(DataSource dataSource) {
	HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	vendorAdapter.setGenerateDdl(true);
	vendorAdapter.setShowSql(true);
	LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
	factory.setJpaVendorAdapter(vendorAdapter);
	factory.setPackagesToScan("com.formation.dao","com.formation.entity"); // Ajouter les packages à scanner par l'EntityManager pour gérer les repositories et les entities JPA
	factory.setDataSource(dataSource);
	factory.afterPropertiesSet();
	return factory.getObject();
	}
}
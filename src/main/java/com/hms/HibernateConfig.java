package com.hms;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
public class HibernateConfig {
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/HospitalManagementSystem");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
	}
	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean(){
		LocalSessionFactoryBean sessionFactoryBean=new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setPackagesToScan("com.hms");
		Properties prop=new Properties();
		prop.put("spring.jpa.properties.hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		prop.put("spring.jpa.show-sql", "true");
		sessionFactoryBean.setHibernateProperties(prop);
		return sessionFactoryBean;
		
	}
	
	public HibernateTransactionManager transactionManager(){
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(localSessionFactoryBean().getObject());
		return transactionManager;
	}
	
	

}

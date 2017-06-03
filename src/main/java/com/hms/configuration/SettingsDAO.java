package com.hms.configuration;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class SettingsDAO {
	@Autowired
	private SessionFactory _sessionFactory;
	private Session getSession(){
		return _sessionFactory.getCurrentSession();
	}
	public void settingsSave(SettingsEntity settingsEntity) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(settingsEntity);
		
	}

}

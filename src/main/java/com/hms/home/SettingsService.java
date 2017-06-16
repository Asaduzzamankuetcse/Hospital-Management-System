package com.hms.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingsService {
	@Autowired
	private SettingsDAO settingsDAO;
	
	public void settingsSave(SettingsEntity settingsEntity) {
		// TODO Auto-generated method stub
		settingsDAO.settingsSave(settingsEntity);
		
		
	}

}

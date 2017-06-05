package com.hms.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class SettingsController {
	@Autowired
	private SettingsService settingsService;
	@GetMapping(value="/settings/create")
	public String settingsCreate(Model model){
		SettingsEntity settingsEntity=new SettingsEntity();
		model.addAttribute("settingsEntity",settingsEntity);
		//model.addAttribute("body","settings/settings_create");
		return "settings/settings_create"; 
		
		
	}
	@PostMapping(value="/settings/create")
	public String settingsSave(SettingsEntity settingsEntity){
		settingsService.settingsSave(settingsEntity);
		return "settings/settings_create"; 
		
	}
	@GetMapping(value="/")
	public String home(Model model){
		return "index/index";
		
	}

}

package com.hms.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		return "index/default";
		
	}
	@GetMapping(value="/adminlte/login")
	public String login(Model model){
		return "AdminLTE/index";
	}
	/*@Override
	protected void configure(final HttpSecurity http) throws Exception {
	    http
	        .formLogin()
	        .loginPage("/login.html")
	        .failureUrl("/login-error.html")
	      .and()
	        .logout()
	        .logoutSuccessUrl("/index.html");
	}
	@RequestMapping("/login.html")
	  public String login() {
	    return "login.html";
	  }

	  // Login form with error
	  @RequestMapping("/login-error.html")
	  public String loginError(Model model) {
	    model.addAttribute("loginError", true);
	    return "login.html";
	  }*/
	

}

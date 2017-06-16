package com.hms.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/user/create")
	public String userCreate(Model model){
		UserEntity userEntity=new UserEntity();
		model.addAttribute("userEntity",userEntity);
		model.addAttribute("body", "user/userCreate");
		return "layout/default";
		
	}
}

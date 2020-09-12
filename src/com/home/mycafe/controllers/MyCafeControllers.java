package com.home.mycafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {
	
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		
		// sending data to view/jsp page
		String myName = "Alex";
		model.addAttribute("myNameValue", myName);
		
		return "welcome-page";
	}
	
}

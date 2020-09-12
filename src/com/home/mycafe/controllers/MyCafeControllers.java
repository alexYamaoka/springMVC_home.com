package com.home.mycafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {
	
	
	
	// return the welcome page
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		
		// sending data to view/jsp page
		model.addAttribute("myWebsiteTitle", "Mom's cafe");
		
		
		return "welcome-page";
	}
	
	
	@RequestMapping("/processOrder")
	public String processOrder() {
		return "process-order";
	}
	
	
}

package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeupKit() {
		return "Ok, here is your makeup kit";
	}
	
	@ResponseBody
	@RequestMapping("/books")
	public String getBooks() {
		return "Heres your math book";
	}
}

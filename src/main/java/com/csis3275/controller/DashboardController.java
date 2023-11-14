package com.csis3275.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.model.*;

@Controller
public class DashboardController {
	
	Jack_FREELANCECONNECT jack = new Jack_FREELANCECONNECT("My name is Jack i was born in canada. I like playing video games, skiing and taking my two dogs on walks.","IMG_6924.jpg");
	
	DashboardModel dash = new DashboardModel("Freelance connect is an application meant to make communication between freelancers and employers easier");
	
	@GetMapping("/")
	public String Dashboard(Model model)
	{
		model.addAttribute("jack",jack);
		model.addAttribute("dash", dash);
		return "dashboard";
	}
}

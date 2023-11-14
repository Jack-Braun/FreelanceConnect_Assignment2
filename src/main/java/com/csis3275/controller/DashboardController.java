package com.csis3275.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.csis3275.model.*;

@Controller
public class DashboardController {
	
	DashboardModel dash = new DashboardModel("Freelance connect is an application meant to make communication between freelancers and employers easier");
	
	@GetMapping("/")
	public String Dashboard(Model model)
	{
		model.addAttribute("dash", dash);
		return "dashboard";
	}
	
}

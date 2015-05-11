package com.excilys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeWorldController {
	@RequestMapping("/welcome")
	public ModelAndView ok() {
		String message = " WELCOME PAGE ";
		return new ModelAndView("welcomepage", "message", message);
	}
}

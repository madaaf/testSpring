package com.excilys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloWordController {

	@RequestMapping("/helloWord")
	public ModelAndView helloWord(HttpServletRequest request,
			HttpServletResponse response) {

		String message = "hello";
		return new ModelAndView("hello", "message", message);

	}
}

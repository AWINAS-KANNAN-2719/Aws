package com.sella.aws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AwsRequestController {
	
	@RequestMapping("/")
	public ModelAndView init() {
		return new ModelAndView("home");
	}

}

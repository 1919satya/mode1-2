package com.hcl.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	
	public ModelAndView helloWorld() {
		return new ModelAndView("result","message","welcome to Spring");
		
	}
	@RequestMapping("/satya")
	public ModelAndView satya(){
		return new ModelAndView("result","message","welcome satya sai");
	}
}

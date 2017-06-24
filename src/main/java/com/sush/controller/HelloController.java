package com.sush.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

@RequestMapping("/welcome/{department}/{username}")
	protected ModelAndView helloWorld(@PathVariable Map<String, String> params)
			throws Exception {
	
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("msg","Hello "+params.get("username")+", you are from "+params.get("department")+" department");
		return modelAndView;
	}

}

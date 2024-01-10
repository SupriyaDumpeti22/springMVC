package com.feujiCompany.Controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.feujiCompany.DTO.Application;
import com.feujiCompany.service.FeujiService;

@Controller
public class Feuji_Controller {

	@Autowired
	FeujiService feujiService;
	
	private static Logger log = LoggerFactory
			.getLogger(Feuji_Controller.class.getSimpleName());
	
	@RequestMapping(path = "/application",method = RequestMethod.GET)
	public ModelAndView getDetails()  {
		
		return new ModelAndView("jobApplication","application",new Application());
	}
	
	@RequestMapping(path = "/applicationForm", method = RequestMethod.POST)
	public ModelAndView postDetails(@Valid @ModelAttribute(name="application") Application application,ModelMap map) {
		
		map.addAttribute("firstName", "ghjkl");
		map.put("lastName", "asdfgh");

		System.out.println(application.getLastName());

		feujiService.save(application);		
		
		return new ModelAndView("success","application", application);
	}
	@RequestMapping(path="/fetch",method=RequestMethod.GET)
	public void fetch(int id)
	{
		feujiService.get(id);
	}
}

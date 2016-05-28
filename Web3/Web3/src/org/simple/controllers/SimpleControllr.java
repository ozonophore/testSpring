package org.simple.controllers;

import org.simple.models.SimpleModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleControllr {

	@RequestMapping(path= "/index", method = RequestMethod.GET)
	public ModelAndView firstMethod(){
		return new ModelAndView("simpleJSP");
	}
	
	@RequestMapping(path= "/index", method = RequestMethod.POST)
	public ModelAndView secondMethod(SimpleModel model){
		System.out.println(model.getName());
		return new ModelAndView("result","model",model);
	}
	
}

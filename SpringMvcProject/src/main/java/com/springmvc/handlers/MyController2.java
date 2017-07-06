package com.springmvc.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController2 implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mv = new ModelAndView("/WEB-INF/jsp/myController.jsp");
		mv.addObject("message", "myController Hello World!");
		mv.getModel().put("asd", "myController Hello World!");
		return mv;
	}

}

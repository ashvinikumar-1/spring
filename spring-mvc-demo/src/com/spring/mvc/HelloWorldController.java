package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	// need a controller method to show initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}

	// need a controller to process form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}

	// need a controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String convertNameToUpperCase(HttpServletRequest request, Model model) {
		// read the request parameter from the html form
		String name = request.getParameter("studentName");
		// convert to Upper case
		name = name.toUpperCase();
		// add name to model
		model.addAttribute("message", name);

		return "helloWorld";
	}

	// need a controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersionThree")
	public String convertNameToUpperCase(@RequestParam("studentName") String name, Model model) {
		// convert to Upper case
		name = name.toUpperCase()+" Welcome!!";
		// add name to model
		model.addAttribute("message", name);

		return "helloWorld";
	}
}

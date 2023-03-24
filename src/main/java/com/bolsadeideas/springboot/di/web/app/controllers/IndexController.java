package com.bolsadeideas.springboot.di.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	//Existen otras notaciones para mapear los endpoints usar la mas conveniente
	@GetMapping({"/index","/"})
	public String index() {
		return "index";
	}
}

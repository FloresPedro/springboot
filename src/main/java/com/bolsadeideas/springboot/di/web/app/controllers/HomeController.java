package com.bolsadeideas.springboot.di.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		//Redireccionamiento a una pagina ya sea externa o interna
		return "redirect:/app/index";
		//tambien redirige pero conserva la ruta de donde estas invocando
		//return "forward:/app/index";
	}
}

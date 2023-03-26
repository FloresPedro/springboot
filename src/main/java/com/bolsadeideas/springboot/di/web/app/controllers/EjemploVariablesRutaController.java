package com.bolsadeideas.springboot.di.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "Enviar parámetros de la ruta (@PathVariable)");
		return "variables/index";
	}
	//Recibe datos que van despues de la / como si fuera una variable a diferencia de
	//httprequestparams que estos deben de ir con el signo de?
	@GetMapping("/string/{texto}")
	public String variables(@PathVariable String texto, Model model) {
		model.addAttribute("titulo", "Recibir parámetros de la ruta (@PathVariable)");
		model.addAttribute("resultado","El texto enviado en la ruta es: " + texto);
		return "variables/ver";
	}
	
	//Url variable se esta poniendo chido
	@GetMapping("/string/{texto}/{numero}")
	public String variables(@PathVariable String texto,@PathVariable Integer numero, Model model) {
		model.addAttribute("titulo", "Recibir parámetros de la ruta (@PathVariable)");
		model.addAttribute("resultado","El texto enviado en la ruta es: " + texto + " y el numero es: "+ numero);
		return "variables/ver";
	}
}

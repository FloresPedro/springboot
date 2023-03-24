package com.bolsadeideas.springboot.di.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Un controlador debe de tener la notacion controller para que se pueda cargar por la clase principal
@Controller
//Requestmappin es la ruta base por donde deben de pasar las demas url(http:localhost:8080/app/index)
@RequestMapping("/app")
public class IndexController {

	//Existen otras notaciones para mapear los endpoints usar la mas conveniente
	//por ejemplo @RequestMapping(value="/",method = RequestMethod.GET) 
	//Se pone entre llaves para tener varias rutas que respondan con el index
	@GetMapping({"/index","/"})
	//model asigna un mapa(llave-valor) y mostrarlos en el html(no es json)
	public String index(Model model) {
		model.addAttribute("titulo", "Hola SpringBoot");
		//El archivo index.html debe de existir en la ruta src/main/resources/templates/index.html
		//y debe de ser una pagina html
		return "index";
	}
}

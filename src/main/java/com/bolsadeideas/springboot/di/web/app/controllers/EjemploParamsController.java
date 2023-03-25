package com.bolsadeideas.springboot.di.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
	/**
	 * 
	 * @param texto que viene desde la url
	 * @param model componente de spring para juntar informacion 
	 * @return una pagina html donde se muestra los parametros que viajaron por la url
	 * para este ejemplo se espera que llegue una variable con el nombre de resultado
	 * se pone el required en false para que en caso de que no vaya dicha informacion 
	 * no truene al acceder al path
	 * defaultValue para poner un valor si no llega nada por la url
	 */

	@GetMapping("/string")
	public String param(@RequestParam(name = "texto", required = false, defaultValue = "no viajo valor por la url") String texto, Model model) {
		model.addAttribute("resultado", "El resultado es: ".concat(texto));
		return "params/ver";
	}
	
	/**
	 * metodo que redirecciona con informacion desde el html
	 * @param model
	 * @return
	 */
	@GetMapping("/")
	public String index(Model model) {
		
		return "params/index";
	}
	
	//Metodo que recibe mas de un parametro y de diferente tipo en la url
	@GetMapping("/mix-params")
	public String param(@RequestParam String texto,@RequestParam Integer numero, Model model) {
		model.addAttribute("resultado", "El resultado es: ".concat(texto).concat(" y el numero es ").concat(numero.toString()) );
		return "params/ver";
	}
	
}

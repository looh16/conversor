package org.conversor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NumerosRomanosController {
	
    @RequestMapping("/converte")
	public String teste(){
		System.out.println("Carregando os produtos");

		return "converter";
	}

}

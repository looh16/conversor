package org.conversor.controller;

import org.conversor.models.NumerosRomanos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NumerosRomanosController {

    @RequestMapping("/converte")
	public String teste(String numeroRomano) {
    	System.out.println(numeroRomano);
    	NumerosRomanos num = new NumerosRomanos();
    	Integer decimal = num.retornarNumeroNormal(numeroRomano);
		System.out.println("Carregando os produtos: "+numeroRomano);
		

		return "converter";
	}

}

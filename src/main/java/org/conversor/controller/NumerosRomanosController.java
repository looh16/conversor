package org.conversor.controller;

import org.conversor.config.Excessoes;
import org.conversor.models.NumerosRomanos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NumerosRomanosController {
	NumerosRomanos num = new NumerosRomanos();
	int valor;
	String romano;

	@RequestMapping("novoRomano")
	public String form() {

		return "converter";
	}

	@RequestMapping("/converte")
	public String teste(String numero) {
		if (numero != null && !numero.isEmpty()){
			romano = numero;
			valor = num.retornarNumeroNormal(romano);		
		}else{
			throw new Excessoes("Invalido");
		}
		return "redirect:mostraNumero";
	}

	@RequestMapping("/mostraNumero")
	public String mostra(String numero, Model model) {
		model.addAttribute("numeroPorConverter", String.valueOf(romano));
		model.addAttribute("numeroConvertido", String.valueOf(valor));

		return "convertido";
	}
}
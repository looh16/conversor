package org.conversor.models;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosRomanos {
	private Map<String, Integer> todosNumeros;

	public NumerosRomanos() {
		inicializaMap();
	}

	public int retornarNumeroNormal(String num) {
		int numAtual = 0;
		int numPosterior = 0;

		num = num.toUpperCase();
		validarNumerosRomanos(num);

		for (int i = num.length() - 1; i >= 0; i--) {
			int numTemporario = todosNumeros.get(new Character(num.charAt(i)).toString());
			if (numTemporario < numPosterior)
				numAtual -= numTemporario;
			else
				numAtual += numTemporario;
				numPosterior = numTemporario;
			}

		return numAtual;

		}
	
	private void validarNumerosRomanos(String romano) {
		Pattern pattern = Pattern.compile("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
		Matcher matcher = pattern.matcher(romano);
		boolean regexValido = matcher.matches();

		if (!regexValido) {
			throw new NumberFormatException("Os numeros inseridos nao sao validos.");
		}
	}

	private void inicializaMap() {
		todosNumeros = new HashMap<String, Integer>();
		todosNumeros.put("I", 1);
		todosNumeros.put("II", 2);
		todosNumeros.put("III", 3);
		todosNumeros.put("IV", 4);
		todosNumeros.put("V", 5);
		todosNumeros.put("VI", 6);
		todosNumeros.put("VII", 7);
		todosNumeros.put("VIII", 8);
		todosNumeros.put("IX", 9);
		todosNumeros.put("X", 10);
		todosNumeros.put("L", 50);
		todosNumeros.put("C", 100);
		todosNumeros.put("D", 500);
		todosNumeros.put("M", 1000);
	}
}

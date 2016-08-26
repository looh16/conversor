package org.conversor.models;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosRomanos implements Numero {
	private Map<String, Integer> todosNumeros;
	private String numero;

	public NumerosRomanos(String numero) {
		this.numero = numero;
		inicializaMap();
	}

	private Integer retornarNumeroNormal(String romano) {
		if (romano != null && !romano.isEmpty()) {
			romano = romano.toUpperCase();
			Integer decimal = todosNumeros.get(romano);

			// se nao achou direto no mapa, eh porque temos combinacoes.
			if (decimal == null) {
				decimal = 0;
				validarNumerosRomanos(romano);

				int i = 0;

				// quebra cada caractere para retornar o arabico correspondente,
				// efetuando as operacoes de soma e subtracao.
				while (i < romano.length()) {
					String romanoAtual = new Character(romano.charAt(i)).toString();
					if (todosNumeros.containsKey(romanoAtual)) {
						int numeroAtual = todosNumeros.get(romanoAtual);
						i++; // mova para a proximo posicao, para efetuar a
								// validacao dos operadores

						if (i == romano.length()) {
							// Na ultima posicao, basta adicionar o numero
							// correspondente a letra romana
							decimal += numeroAtual;
						} else {
							// Próxima letra na seqüência dos romanos.
							// Se ele for maior do que o número atual, então as
							// duas letras são contadas em conjunto.
							String romanoProximo = new Character(romano.charAt(i)).toString();
							int numeroProximo = todosNumeros.get(romanoProximo);
							if (numeroProximo > numeroAtual) {
								decimal += (numeroProximo - numeroAtual);
								i++; // passa para a próxima posição na string.
							} else {
								decimal += numeroAtual;
							}
						}
					} else {
						throw new NumberFormatException("Os numeros romanos inseridos nao sao validos.");
					}

				}
			}

			return decimal;
		}
		return null;
	}

	// Tirando V, L e D, os demais somente podem se repetir 3 vezes (I, X, C, M).

	private void validarNumerosRomanos(String romano) {
		Pattern pattern = Pattern.compile("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
		Matcher matcher = pattern.matcher(romano);
		boolean regexValido = matcher.matches();

		if (!regexValido) {
			throw new NumberFormatException("Os numeros romanos inseridos nao sao validos.");
		}
	}

	/**
	 * Efetua a conversao de romanos para arabicos.
	 * 
	 * @return Integer com o arabico correspondente.
	 * @throws NumberFormatException
	 *             caso o numero romano nao for valido.
	 */
	@SuppressWarnings("unchecked")
	public <E> E converter() {
		return (E) this.retornarNumeroNormal(numero);
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

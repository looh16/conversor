package org.conversor.models;

public class NumerosRomanos {
	private String numero;
	
	public int converter(String romano) {
		
		/*if (romano != null && !romano.isEmpty()){
			romano = romano.toUpperCase();
			
		}else{
			throw new NumberFormatException("Os numeros romanos inseridos nao sao validos.");
		}*/
			
		this.numero = romano;
		int n = 0;
		int numeralDaDireita = 0;
		for (int i = numero.length()- 1; i >= 0; i--) {
			int valor = (int) converte(numero.charAt(i));
			n += valor * Math.signum(valor + 0.5 - numeralDaDireita);
			numeralDaDireita = valor;
		}
		return n;
	}
	private double converte(char caractere) {
		return Math.floor(Math.pow(10, "IXCM".indexOf(caractere))) + 5 * Math.floor(Math.pow(10, "VLD".indexOf(caractere)));
	}	
}

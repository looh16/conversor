package org.conversor.config;

public class Excessoes extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Excessoes(String messageExcessao) {
		super(messageExcessao+":o campo nao pode estar vazio");
	}
	

}

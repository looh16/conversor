package org.conversor.testes;

import static org.junit.Assert.*;

import org.conversor.models.NumerosRomanos;
import org.junit.Before;
import org.junit.Test;

public class NumerosRomanosTest {

	NumerosRomanos num;
	int retorno;

	@Before
	public void init() {
		num = new NumerosRomanos();
	}

	@Test
	public void testaValidacaoDeConversaoParaRomanosComNulidade() {
		assertNotNull(num);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralUm() {
		retorno = num.retornarNumeroNormal("I");
		assertEquals(1, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralTres() {
		retorno = num.retornarNumeroNormal("III");
		assertEquals(3, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralCinco() {
		retorno = num.retornarNumeroNormal("V");
		assertEquals(5, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralOito() {
		retorno = num.retornarNumeroNormal("VIII");
		assertEquals(8, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralNove() {
		retorno = num.retornarNumeroNormal("IX");
		assertEquals(9, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralDoze() {
		retorno = num.retornarNumeroNormal("XII");
		assertEquals(12, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralDezenove() {
		retorno = num.retornarNumeroNormal("XIX");
		assertEquals(19, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralTrinta() {
		retorno = num.retornarNumeroNormal("XXX");
		assertEquals(30, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralQuarentaECinco() {
		retorno = num.retornarNumeroNormal("XLV");
		assertEquals(45, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralCentoENoventaENove() {
		retorno = num.retornarNumeroNormal("CXCIX");
		assertEquals(199, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralOitocentos() {
		retorno = num.retornarNumeroNormal("DCCC");
		assertEquals(800, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralMilEUm() {
		retorno = num.retornarNumeroNormal("MI");
		assertEquals(1001, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralTrezentosENoventaESete() {
		retorno = num.retornarNumeroNormal("CCCXCVII");
		assertEquals(397, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralNovecentosEOitentaENove() {
		retorno = num.retornarNumeroNormal("CMLXXXIX");
		assertEquals(989, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralMilEQuarentaEQuatro() {
		retorno = num.retornarNumeroNormal("MXLIV");
		assertEquals(1044, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralMilECinquentaETres() {
		retorno = num.retornarNumeroNormal("MMMCMXC");
		assertEquals(3990, retorno);
	}

	@Test(expected = NumberFormatException.class)
	public void testaValidacaoNumerosRomanosErradosComLetras() {
		num.retornarNumeroNormal("AVI");
	}

	@Test(expected = NumberFormatException.class)
	public void testaValidacaoNumerosRomanosErradosComDigitos() {
		num.retornarNumeroNormal("123");
	}

}

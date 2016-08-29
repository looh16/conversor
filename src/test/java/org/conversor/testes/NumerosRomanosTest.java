package org.conversor.testes;

import static org.junit.Assert.assertEquals;

import org.conversor.models.NumerosRomanos;
import org.junit.Before;
import org.junit.Test;

public class NumerosRomanosTest {

	private NumerosRomanos num;
	private int retorno;

	@Before
	public void init() {
		num = new NumerosRomanos();
	}

	@Test
	public void testaValidacaoDeConversaoParaRomanosComNulidade() {

		retorno = num.converter("586646458dkhueuubuwoa55444646");
		assertEquals(0, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralUm() {
	    retorno = num.converter("I");
		assertEquals(1, retorno);
		
	}

	@Test
	public void testaConversaoParaRomanosComNumeralTres() {
		retorno = num.converter("III");
		assertEquals(3, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralCinco() {
		retorno = num.converter("V");
		assertEquals(5, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralOito() {
		retorno = num.converter("VIII");
		assertEquals(8, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralNove() {
		retorno = num.converter("IX");
		assertEquals(9, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralDoze() {
		retorno = num.converter("XII");
		assertEquals(12, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralDezenove() {
		retorno = num.converter("XIX");
		assertEquals(19, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralTrinta() {
		retorno = num.converter("XXX");
		assertEquals(30, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralQuarentaECinco() {
		retorno = num.converter("XLV");
		assertEquals(45, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralCentoENoventaENove() {
		retorno = num.converter("CXCIX");
		assertEquals(199,retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralOitocentos() {
		retorno = num.converter("DCCC");
		assertEquals(800, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralMilEUm() {
		retorno = num.converter("MI");
		assertEquals(1001, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralTrezentosENoventaESete() {
		retorno = num.converter("CCCXCVII");
		assertEquals(397, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralNovecentosEOitentaENove() {
		retorno = num.converter("CMLXXXIX");
		assertEquals(989, retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralMilEQuarentaEQuatro() {
		retorno = num.converter("MXLIV");
		assertEquals(1044,retorno);
	}

	@Test
	public void testaConversaoParaRomanosComNumeralMilECinquentaETres() {
		retorno = num.converter("MMMCMXC");
		assertEquals(3990, retorno);
	}
}

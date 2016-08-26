package org.conversor.testes;

import static org.junit.Assert.*;

import org.conversor.models.NumerosRomanos;
import org.junit.Before;
import org.junit.Test;

public class NumerosRomanosTest {

	NumerosRomanos num;

	@Before
	public void init() {
		num = new NumerosRomanos();
	}

	@Test
	public void testaValidacaoDeConversaoParaRomanosComNulidade() {

		num.retornarNumeroNormal(null);
		assertNull(num.converter());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralUm() {
		num.retornarNumeroNormal("I");
		assertEquals(1, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralTres() {
		num.retornarNumeroNormal("III");
		assertEquals(3, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralCinco() {
		num.retornarNumeroNormal("V");
		assertEquals(5, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralOito() {
		num.retornarNumeroNormal("VIII");
		assertEquals(8, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralNove() {
		num.retornarNumeroNormal("IX");
		assertEquals(9, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralDoze() {
		num.retornarNumeroNormal("XII");
		assertEquals(12, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralDezenove() {
		num.retornarNumeroNormal("XIX");
		assertEquals(19, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralTrinta() {
		num.retornarNumeroNormal("XXX");
		assertEquals(30, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralQuarentaECinco() {
		num.retornarNumeroNormal("XLV");
		assertEquals(45, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralCentoENoventaENove() {
		num.retornarNumeroNormal("CXCIX");
		assertEquals(199, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralOitocentos() {
		num.retornarNumeroNormal("DCCC");
		assertEquals(800, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralMilEUm() {
		num.retornarNumeroNormal("MI");
		assertEquals(1001, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralTrezentosENoventaESete() {
		num.retornarNumeroNormal("CCCXCVII");
		assertEquals(397, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralNovecentosEOitentaENove() {
		num.retornarNumeroNormal("CMLXXXIX");
		assertEquals(989, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralMilEQuarentaEQuatro() {
		num.retornarNumeroNormal("MXLIV");
		assertEquals(1044, ((Integer) num.converter()).intValue());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralMilECinquentaETres() {
		num.retornarNumeroNormal("MMMCMXC");
		assertEquals(3990, ((Integer) num.converter()).intValue());
	}

	@Test(expected = NumberFormatException.class)
	public void testaValidacaoNumerosRomanosErradosComLetras() {
		num.retornarNumeroNormal("AVI");
		num.converter();
	}

	@Test(expected = NumberFormatException.class)
	public void testaValidacaoNumerosRomanosErradosComDigitos() {
		num.retornarNumeroNormal("123");
		num.converter();
	}

	@Test(expected = NumberFormatException.class)
	public void testaValidacaoNumerosRomanosRepeticaoI() {
		num.retornarNumeroNormal("IIII");
		num.converter();
	}

	@Test(expected = NumberFormatException.class)
	public void testaValidacaoNumerosRomanosRepeticaoX() {
		num.retornarNumeroNormal("XXXXXXXXXXXXXXXXX");
		num.converter();
	}

	@Test(expected = NumberFormatException.class)
	public void testaValidacaoNumerosRomanosRepeticaoC() {
		num.retornarNumeroNormal("CCCCCC");
		num.converter();
	}

	@Test(expected = NumberFormatException.class)
	public void testaValidacaoNumerosRomanosRepeticaoM() {
		num.retornarNumeroNormal("MMMMMMMM");
		num.converter();
	}

}

package org.conversor.testes;

import static org.junit.Assert.*;

import org.conversor.models.NumerosRomanos;
import org.junit.Test;

public class NumerosRomanosTest {

	@Test
	public void testaValidacaoDeConversaoParaRomanosComNulidade(){
		NumerosRomanos num = new NumerosRomanos(null);
		assertNull(num.converter());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralUm(){
		NumerosRomanos num = new NumerosRomanos("I");
		assertEquals(1,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralTres(){
		NumerosRomanos num = new NumerosRomanos("III");
		assertEquals(3,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralCinco(){
		NumerosRomanos num = new NumerosRomanos("V");
		assertEquals(5,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralOito(){
		NumerosRomanos num = new NumerosRomanos("VIII");
		assertEquals(8,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralNove(){
		NumerosRomanos num = new NumerosRomanos("IX");
		assertEquals(9,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralDoze(){
		NumerosRomanos num = new NumerosRomanos("XII");
		assertEquals(12,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralDezenove(){
		NumerosRomanos num = new NumerosRomanos("XIX");
		assertEquals(19,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralTrinta(){
		NumerosRomanos num = new NumerosRomanos("XXX");
		assertEquals(30,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralQuarentaECinco(){
		NumerosRomanos num = new NumerosRomanos("XLV");
		assertEquals(45,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralCentoENoventaENove(){
		NumerosRomanos num = new NumerosRomanos("CXCIX");
		assertEquals(199,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralOitocentos(){
		NumerosRomanos num = new NumerosRomanos("DCCC");
		assertEquals(800,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralMilEUm(){
		NumerosRomanos num = new NumerosRomanos("MI");
		assertEquals(1001,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralTrezentosENoventaESete(){
		NumerosRomanos num = new NumerosRomanos("CCCXCVII");
		assertEquals(397,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralNovecentosEOitentaENove(){
		NumerosRomanos num = new NumerosRomanos("CMLXXXIX");
		assertEquals(989,((Integer)num.converter()).intValue());
	}
			
	@Test
	public void testaConversaoParaRomanosComNumeralMilEQuarentaEQuatro(){
		NumerosRomanos num = new NumerosRomanos("MXLIV");
		assertEquals(1044,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralMilECinquentaETres(){
		NumerosRomanos num = new NumerosRomanos("MMMCMXC");
		assertEquals(3990,((Integer)num.converter()).intValue());
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaValidacaoNumerosRomanosErradosComLetras(){
		NumerosRomanos num = new NumerosRomanos("AVI");
		num.converter();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaValidacaoNumerosRomanosErradosComDigitos(){
		NumerosRomanos num = new NumerosRomanos("123");
		num.converter();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaValidacaoNumerosRomanosRepeticaoI(){
		NumerosRomanos num = new NumerosRomanos("IIII");
		num.converter();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaValidacaoNumerosRomanosRepeticaoX(){
		NumerosRomanos num = new NumerosRomanos("XXXXXXXXXXXXXXXXX");
		num.converter();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaValidacaoNumerosRomanosRepeticaoC(){
		NumerosRomanos num = new NumerosRomanos("CCCCCC");
		num.converter();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaValidacaoNumerosRomanosRepeticaoM(){
		NumerosRomanos num = new NumerosRomanos("MMMMMMMM");
		num.converter();
	}

}

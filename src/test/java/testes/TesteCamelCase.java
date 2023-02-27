package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import Entidades.ServiceCamelCase;

public class TesteCamelCase {

	
	
	@Test
	public void textoVazio() {
		ServiceCamelCase scc = new ServiceCamelCase("");
		assertNotEquals(scc.getText(),null);
	}

	@Test
	public void textoCamelCaseMinusculas() {
		ServiceCamelCase scc = new ServiceCamelCase("valentim do carmo silva");
		assertEquals(ServiceCamelCase.converterCamelCase(scc.getText()),"ValentimDoCarmoSilva");
	}
	@Test
	public void textoCamelCaseMaiusculas() {
		ServiceCamelCase scc = new ServiceCamelCase("NUMERO CPF CONTRIBUINTE");
		assertEquals(ServiceCamelCase.converterCamelCase(scc.getText()),"NumeroCpfContribuinte");
	}
	
	@Test
	public void textoCamelCaseNumeros() {
		ServiceCamelCase scc = new ServiceCamelCase("1 teste com numeros 10");
		assertNotEquals(ServiceCamelCase.converterCamelCase(scc.getText()),"1TesteComNumeros10");
	}
	
	@Test
	public void textoCamelCaseEspeciais() {
		ServiceCamelCase scc = new ServiceCamelCase("# teste com especiais !");
		assertEquals(ServiceCamelCase.converterCamelCase(scc.getText()),"#TesteComEspeciais!");
	}
	
}

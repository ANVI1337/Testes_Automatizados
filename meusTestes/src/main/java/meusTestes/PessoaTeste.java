package meusTestes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PessoaTeste {

	@Test
	void testHello() {
		Pessoa pessoa = new Pessoa();
		assertEquals("Olá JUnit!", pessoa.hello());
	}
	
	@Test
	void verificarSeORetornoEOla() {
		// Instanciar um objeto 
		Pessoa pessoa2 = new Pessoa();
		assertEquals("Olá", pessoa2.hello());
	}
	
	
	
}

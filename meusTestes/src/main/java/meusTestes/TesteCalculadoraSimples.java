package meusTestes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalculadoraSimples {

	@Test
	void doisMaisDoisExibeQuatro() {
		
		var calculadora = new CalculadoraSimples(); // estavamos usando explicitamente o tipo da variável mas será aplicado nesse objeto de forma não explicita usando o "var".
		assertEquals(4, calculadora.add(2, 2));
	}
	@Test
	void doisVezesTresRetornaSeis() {
		var calculadora2 = new CalculadoraSimples();
		assertEquals(6, calculadora2.multiplicar(2, 3));
 }
	
	
	
	
}

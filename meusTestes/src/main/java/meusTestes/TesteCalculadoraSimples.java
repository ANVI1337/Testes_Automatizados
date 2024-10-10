package meusTestes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TesteCalculadoraSimples {
	// variável não literal
	private CalculadoraSimples calculadora;

	/*
	 * Executa um código antes cada teste. utilizado para configurar o ambiente de
	 * teste (como inicializar objetos) necessários para cada teste.
	 */
	@BeforeEach
	public void setup() {
		// código de inicialização ( ex:Criar um instância de calculadora)
		calculadora = new CalculadoraSimples();
	}

	// -----------------------------------------------------------------------------//
	@Test
	void doisMaisDoisExibeQuatro() {

		//var calculadora = new CalculadoraSimples(); // estavamos usando explicitamente o tipo da variável mas será
													// aplicado nesse objeto de forma não explicita usando o "var".
		assertEquals(4, calculadora.add(2, 2));
	}

	@DisplayName("Caso de Teste que exibe a multiplicação de dois vezes tres para retornar 6.")
	@Test
	void doisVezesTresRetornaSeis() {
		//var calculadora = new CalculadoraSimples();
		assertEquals(6, calculadora.multiplicar(2, 3));
	}

	// -----------------------------------------------------------------------------//
	@DisplayName("Caso de Teste que exibe a soma de 3 mais 7 resultando em 10.")
	@Test
	void tresMaisSeteExibirDez() {
		//var calculadora = new CalculadoraSimples();
		assertEquals(10, calculadora.add(3, 7));
	}
	// ----------------------------------------------------------------------------//

	@DisplayName("Caso de Teste calcular o dobro de um valor real")
	@Test
	void oDobroDeDoisPontoQuatroRetornaQuatroPontoOito() {
		//var calculadora = new CalculadoraSimples();
		assertEquals(4.8, calculadora.dobroDeUmValor(2.4)); // metodo com variável aplicada em private final.
	}

}

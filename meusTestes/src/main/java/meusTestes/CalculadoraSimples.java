package meusTestes;

public class CalculadoraSimples {
	private final double dobro = 2;
	
	public int add(int numeroA, int numeroB) {
		return numeroA + numeroB;
	}
	public int multiplicar(int N1, int N2) {
		return N1 * N2;
	}
	public double MetodoDobrarValor(double numero) {
		return numero * 2;
	}
	public double dobroDeUmValor (double valor) {
		return valor * dobro;
	}
	
}

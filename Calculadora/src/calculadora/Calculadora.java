package calculadora;

public class Calculadora {
	
	private Calculadora() {}
	
	public static double somar(double n1, double n2) {
		return n1 + n2;
	}
	
	public static double subtrair(double n1, double n2) {
		return n1 - n2;
	}
	
	public static double multiplicar(double n1, double n2) {
		return n1 * n2;
	}
	
	public static double dividir(double n1, double n2) {
		return n1 / n2;
	}
	
	public static double potenciacao(double base, double expoente) {
		return Math.pow(base, expoente);
	}
	
	public static double raizQuadrada(double num) {
		return Math.sqrt(num);
	}
	
}
package figuras_geometricas;

public class Triangulo extends Figura {

	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return (this.base * this.altura) / 2;
	}
	
}
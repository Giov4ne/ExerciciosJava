package figuras_geometricas;

public class Retangulo extends Figura {
	
	private double ladoA;
	private double ladoB;
	
	public Retangulo(double ladoA, double ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	public double calcularArea() {
		return this.ladoA * this.ladoB;
	}
	
}

package figuras_geometricas;

public class Circulo extends Figura {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}
	
}

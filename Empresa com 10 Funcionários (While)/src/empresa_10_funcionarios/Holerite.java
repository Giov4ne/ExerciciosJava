package empresa_10_funcionarios;

public class Holerite {
	
	private double salarioInicial;
	private double auxilioAlimentacao;
	private double salarioFinal;
	
	public Holerite(double valorHora, int numHorasTrabalhadas) {
		
		salarioInicial = valorHora * numHorasTrabalhadas;
		
		if(salarioInicial < 300)
			auxilioAlimentacao = salarioInicial * 0.2;
		else if(salarioInicial >= 300 && salarioInicial <= 600)
			auxilioAlimentacao = salarioInicial * 0.15;
		else
			auxilioAlimentacao = salarioInicial * 0.05;
		
		salarioFinal = salarioInicial + auxilioAlimentacao;
		
	}
	
	public double getSalarioInicial() {
		return salarioInicial;
	}
	
	public double getAuxilioAlimentacao() {
		return auxilioAlimentacao;
	}
	
	public double getSalarioFinal() {
		return salarioFinal;
	}
	
}
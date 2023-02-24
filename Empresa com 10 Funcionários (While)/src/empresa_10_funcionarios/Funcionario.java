package empresa_10_funcionarios;

public class Funcionario {
	
	private int codigo;
	private int numHorasTrabalhadas;
	private char turno;
	private char categoria;
	private double valorHora;
	private Holerite holerite;
	
	public Funcionario(int codigo, int numHorasTrabalhadas, char turno, char categoria) {
		
		this.codigo = codigo;
		this.numHorasTrabalhadas = numHorasTrabalhadas;
		this.turno = turno;
		this.categoria = categoria;
		
		double salarioMinimo = 450;
		
		switch(categoria) {
			case 'G':
				if(turno == 'N')
					valorHora = salarioMinimo * 0.18;
				else
					valorHora = salarioMinimo * 0.15;
				break;
			case 'O':
				if(turno == 'N')
					valorHora = salarioMinimo * 0.13;
				else
					valorHora = salarioMinimo * 0.1;
				break;
		}
		
		holerite = new Holerite(valorHora, numHorasTrabalhadas);
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setNumHorasTrabalhadas(int numHorasTrabalhadas) {
		this.numHorasTrabalhadas = numHorasTrabalhadas;
	}
	
	public int getNumHorasTrabalhadas() {
		return numHorasTrabalhadas;
	}
	
	public void setTurno(char turno) {
		this.turno = turno;
	}
	
	public char getTurno() {
		return turno;
	}
	
	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}
	
	public char getCategoria() {
		return categoria;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	
	public Holerite getHolerite() {
		return holerite;
	}
	
}
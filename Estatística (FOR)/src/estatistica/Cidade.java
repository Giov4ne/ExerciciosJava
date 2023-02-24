package estatistica;

public class Cidade {
	
	private int codigo;
	private String nome;
	private int numVeiculosPasseio;
	private int numAcidentes;
	
	public Cidade(int codigo, String nome, int numVeiculosPasseio, int numAcidentes) {
		this.codigo = codigo;
		this.nome = nome;
		this.numVeiculosPasseio = numVeiculosPasseio;
		this.numAcidentes = numAcidentes;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumVeiculosPasseio() {
		return numVeiculosPasseio;
	}
	
	public int getNumAcidentes() {
		return numAcidentes;
	}
	
}
package classe_pessoa;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public String seApresentar() {
		return "Olá, me chamo " + getNome() + ", tenho " + getIdade() + " anos, e " + getAltura() + "m de altura.";
	}
	
	public void fazerAniversario() {
		idade++;
	}
	
}
package emprestimo_livros.classes;

public class Pessoa {

	private String nome;
	private int idade;
	private char sexo;
	
	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public String getSexo() {
		return (this.sexo == 'M') ? "masculino" : "feminino";
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome + ", " + this.idade + " anos, sexo " + this.getSexo();
	}
	
}

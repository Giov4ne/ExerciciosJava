package emprestimo_livros.classes;

public class Livro {

	private String nome;
	private String autor;
	private String status;
	
	public Livro(String nome, String autor) {
		this.nome = nome;
		this.autor = autor;
		this.status = "Disponível";
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		if(status.equalsIgnoreCase("Disponível") || status.equalsIgnoreCase("Indisponível"))
			this.status = status;
		else
			System.out.println("Status inválido!!");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome + " (" + this.autor + ")";
	}
	
}

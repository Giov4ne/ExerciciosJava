package emprestimo_livros.classes;

public class Emprestimo {
	
	private Livro livro;
	private Pessoa pessoa;
	
	public Emprestimo(Livro livro, Pessoa pessoa) {
		this.livro = livro;
		this.pessoa = pessoa;
	}

	public Livro getLivro() {
		return this.livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Empréstimo do livro " + this.livro + ", que está com " + this.pessoa + ".";
	}
	
}

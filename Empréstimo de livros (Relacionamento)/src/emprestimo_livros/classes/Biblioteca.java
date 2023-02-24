package emprestimo_livros.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
	
	private String nome;
	private List<Livro> livros;
	private List<Emprestimo> emprestimos;
	private List<Pessoa> pessoas;
	
	public Biblioteca(String nome, List<Livro> livros) {
		this.nome = nome;
		this.pessoas = new ArrayList<Pessoa>();
		this.emprestimos = new ArrayList<Emprestimo>();
		this.livros = new ArrayList<Livro>();
		livros.forEach(livro -> this.livros.add(livro));
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void exibirLivros() {
		this.livros.forEach(livro -> System.out.println(livro + " - " + livro.getStatus()));
	}
	
	public void exibirLivrosDisponiveis() {
		for(Livro livro : this.livros) {
			if(livro.getStatus().equals("Disponível")) {
				System.out.println(livro);
			}
		}
	}
	
	public void exibirPessoas() {
		this.pessoas.forEach(pessoa -> System.out.println(pessoa));
	}
	
	public void exibirEmprestimos() {
		this.emprestimos.forEach(emprestimo -> System.out.println(emprestimo));
	}
	
	public void cadastrarLivro(Scanner scanner) {
		String nome = "", autor = "";
		while(nome.equals("")) {
			System.out.print("Nome do livro: ");
			nome = scanner.nextLine();
			if(nome.equals(""))
				System.out.println("Digite o nome do livro.\n");
		}
		while(autor.equals("")) {
			System.out.print("Nome do autor: ");
			autor = scanner.nextLine();
			if(autor.equals(""))
				System.out.println("Digite o nome do autor.\n");
		}
		this.livros.add(new Livro(nome, autor));
		System.out.println("Livro cadastrado com sucesso!!\n");
	}
	
	public void cadastrarEmprestimo(Scanner scanner) {
		String nomePessoa = "";
		int idade = 0;
		char sexo = '0';
		while(nomePessoa.equals("")) {
			System.out.print("Nome da pessoa que fará empréstimo: ");
			nomePessoa = scanner.nextLine();
			if(nomePessoa.equals(""))
				System.out.println("Digite o nome da pessoa.\n");
		}
		while(idade <= 0 || idade > 130) {
			System.out.print("Idade: ");
			try {
				idade = Integer.parseInt(scanner.nextLine());
				if(idade <= 0 || idade > 130)
					System.out.println("Idade inválida.\n");
			} catch(NumberFormatException e) {
				System.out.println("ERRO: insira um valor inteiro.\n");
			}
		}
		while(sexo != 'M' && sexo != 'F') {
			System.out.print("Sexo [M/F]: ");
			try {
				sexo = scanner.nextLine().toUpperCase().charAt(0);
				if(sexo != 'M' && sexo != 'F')
					System.out.println("Digite 'M' para masculino ou 'F' para feminino.\n");
			} catch(StringIndexOutOfBoundsException e) {
				System.out.println("Digite o sexo.\n");
			}
		}
		this.pessoas.add(new Pessoa(nomePessoa, idade, sexo));
		
		System.out.println();
		System.out.println("LIVROS DISPONÍVEIS:");
		this.exibirLivrosDisponiveis();
		System.out.println();
		String nomeLivro = "";
		boolean livroExiste = false;
		while(!livroExiste) {
			System.out.print("Nome do livro a ser emprestado: ");
			nomeLivro = scanner.nextLine();
			if(nomeLivro.equals("")) {
				System.out.println("Digite o nome do livro.");
				continue;
			}
			for(Livro livro : this.livros) {
				if(livro.getNome().equalsIgnoreCase(nomeLivro)) {
					livroExiste = true;
					livro.setStatus("Indisponível");
					this.emprestimos.add(new Emprestimo(new Livro(livro.getNome(), livro.getAutor()), new Pessoa(nomePessoa, idade, sexo)));
				}
			}
			if(!livroExiste)
				System.out.println("Este livro não existe ou não está disponível na biblioteca.");
		}
		System.out.println("Empréstimo cadastrado com sucesso!!\n");
	}
	
}
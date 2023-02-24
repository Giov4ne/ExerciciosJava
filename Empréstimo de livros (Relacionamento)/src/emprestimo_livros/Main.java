package emprestimo_livros;

import emprestimo_livros.classes.Biblioteca;
import emprestimo_livros.classes.Livro;
import emprestimo_livros.classes.Pessoa;
import emprestimo_livros.classes.Emprestimo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	// TODO Faça um programa para controle de empréstimo de livros, com as classes Emprestimo, Livro e Pessoa.
	
	public static void main(String[] args) {
		
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(new Livro("Dom Casmurro", "Machado de Assis"));
		livros.add(new Livro("Senhora", "José de Alencar"));
		livros.add(new Livro("O Cortiço", "Aluísio Azevedo"));
		Biblioteca biblioteca = new Biblioteca("São José", livros);
		Scanner scanner = new Scanner(System.in);
		executarPrograma(biblioteca, scanner);
		
	}
	
	private static void executarPrograma(Biblioteca biblioteca, Scanner scanner) {
		boolean condicao = true;
		byte opcao = 0;
		while(condicao) {
			System.out.println("Selecione uma opção:");
			System.out.println("1 - Ver todos os livros;");
			System.out.println("2 - Ver livros disponíveis;");
			System.out.println("3 - Ver pessoas que fizeram empréstimo;");
			System.out.println("4 - Ver lista de empréstimos realizados;");
			System.out.println("5 - Cadastrar novo livro;");
			System.out.println("6 - Cadastrar novo empréstimo;");
			System.out.println("7 - Encerrar o programa.");
			try {
				opcao = Byte.parseByte(scanner.nextLine());
				switch(opcao) {
					case 1:
						exibirLivros(biblioteca);
						break;
					case 2:
						exibirLivrosDisponiveis(biblioteca);
						break;
					case 3:
						exibirPessoas(biblioteca);
						break;
					case 4:
						exibirEmprestimos(biblioteca);
						break;
					case 5:
						cadastrarLivro(biblioteca, scanner);
						break;
					case 6:
						cadastrarEmprestimo(biblioteca, scanner);
						break;
					case 7:
						condicao = false;
						System.out.println("Encerrando...");
						break;
				}
			} catch(NumberFormatException e) {
				System.out.println("ERRO: insira um número inteiro.\n");
			}
		}
	}
	
	private static void exibirLivros(Biblioteca biblioteca) {
		biblioteca.exibirLivros();
		System.out.println();
	}
	
	private static void exibirLivrosDisponiveis(Biblioteca biblioteca) {
		biblioteca.exibirLivrosDisponiveis();
		System.out.println();
	}
	
	private static void exibirPessoas(Biblioteca biblioteca) {
		biblioteca.exibirPessoas();
		System.out.println();
	}
	
	private static void exibirEmprestimos(Biblioteca biblioteca) {
		biblioteca.exibirEmprestimos();
		System.out.println();
	}
	
	private static void cadastrarLivro(Biblioteca biblioteca, Scanner scanner) {
		biblioteca.cadastrarLivro(scanner);
	}
	
	private static void cadastrarEmprestimo(Biblioteca biblioteca, Scanner scanner) {
		biblioteca.cadastrarEmprestimo(scanner);
	}
	
}
/*Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:

void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); - informa em que posição da agenda está a pessoa
void imprimeAgenda(); - imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); - imprime os dados da pessoa que está na posição “i” da agenda. */

package agenda;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		lerOperacaoDesejada(new Scanner(System.in), agenda);
		
	}
	
	private static void lerOperacaoDesejada(Scanner scanner, Agenda agenda) {
		boolean condicao = true;
		int opcao = 0;
		while(condicao) {
			System.out.println("Escolha a operação desejada: ");
			System.out.println("1 - Armazenar pessoa;");
			System.out.println("2 - Remover pessoa;");
			System.out.println("3 - Buscar pessoa;");
			System.out.println("4 - Imprimir agenda;");
			System.out.println("5 - Imprimir pessoa;");
			System.out.println("6 - Encerrar programa.");
			try {
				opcao = Integer.parseInt(scanner.nextLine());
				if(opcao < 1 || opcao > 6) {
					System.out.println("Escolha de 1 a 6.\n");
				}
			} catch(NumberFormatException e) {
				System.out.println("ERRO: valor não numérico inserido.\n");
			}
			switch(opcao) {
				case 1:
					armazenarPessoa(scanner, agenda);
					break;
				case 2:
					removerPessoa(scanner, agenda);
					break;
				case 3:
					buscarPessoa(scanner, agenda);
					break;
				case 4:
					imprimirAgenda(agenda);
					break;
				case 5:
					imprimirPessoa(scanner, agenda);
					break;
				case 6:
					condicao = false;
					System.out.println("Encerrando...");
					break;
			}
		}
	}
	
	private static void armazenarPessoa(Scanner scanner, Agenda agenda) {
		if(agenda.getNumDePessoasArmazenadas() < 10) {
			String nome = "";
			int idade = 0;
			float altura = 0F;
			while(nome.equals("")) {
				System.out.print("Nome: ");
				nome = scanner.nextLine();
				if(nome.equals(""))
					System.out.println("Digite um nome.\n");
			}
			while(idade <= 0 || idade > 130) {
				System.out.print("Idade: ");
				try {
					idade = Integer.parseInt(scanner.nextLine());
					if(idade <= 0 || idade > 130)
						System.out.println("Digite uma idade válida.\n");
				} catch(NumberFormatException e) {
					System.out.println("ERRO: o valor precisa ser um número inteiro.\n");
				}
			}
			while(altura <= 0F || altura > 3F) {
				System.out.print("Altura: ");
				try {
					altura = Float.parseFloat(scanner.nextLine());
					if(altura <= 0F || altura > 3F)
						System.out.println("Digite uma altura válida.\n");
				} catch(NumberFormatException e) {
					System.out.println("ERRO: valor não numérico inserido.\n");
				}
			}
			agenda.armazenarPessoa(nome, idade, altura);
			System.out.println("Pessoa cadastrada com sucesso!!\n");
		} else {
			System.out.println("Você não pode cadastrar mais pessoas, a agenda está cheia!!\n");
		}
	}
	
	private static void removerPessoa(Scanner scanner, Agenda agenda) {
		String nome = "";
		while(nome.equals("")) {
			System.out.print("Nome da pessoa a ser removida: ");
			nome = scanner.nextLine();
			if(nome.equals(""))
				System.out.println("Digite um nome.\n");
		}
		agenda.removerPessoa(nome);
	}
	
	private static void buscarPessoa(Scanner scanner, Agenda agenda) {
		String nome = "";
		if(nome.equals("")) {
			System.out.print("Nome da pessoa a ser buscada: ");
			nome = scanner.nextLine();
			if(nome.equals(""))
				System.out.println("Digite um nome.\n");
		}
		int index = agenda.buscarPessoa(nome);
		System.out.println((index == -1) ? "Pessoa não encontrada!!\n" : nome + " está na posição " + index + " da agenda.\n");
	}
	
	private static void imprimirAgenda(Agenda agenda) {
		agenda.imprimirAgenda();
	}
	
	private static void imprimirPessoa(Scanner scanner, Agenda agenda) {
		int index = -1;
		while(index < 0) {
			System.out.print("Buscar pessoa na posição: ");
			try {
				index = Integer.parseInt(scanner.nextLine());
				if(index < 0)
					System.out.println("O índice precisa ser maior ou igual a 0.");
			} catch(NumberFormatException e) {
				System.out.println("ERRO: o valor precisa ser um número inteiro.\n");
			}
		}
		agenda.imprimirPessoa(index);
	}
	
}
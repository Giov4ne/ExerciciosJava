/*Faça um programa que apresente o menu de opções a seguir, permita ao usuário escolher a opção desejada, receba os dados necessários para executar a operação e mostre o resultado. Verifique a possibilidade de opção inválida e não se preocupe com restrições do tipo salário inválido.

Menu de opções: 1 – Imposto, 2 – Novo Salário, 3 – Classificação, 4 – Finalizar o programa, 5 – Finalizar o programa. Digite a opção desejada. 

Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor do imposto usando as regras da tabela 3. 

Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor do novo salário usando as regras da tabela 4. 

Na opção 3: receber o salário de um funcionário e mostrar sua classificação usando a tabela 5.*/

package menu_opcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		executarPrograma(new Scanner(System.in));
		
	}
	
	private static void executarPrograma(Scanner scanner) {
		
		boolean continuar = true;
		int opcao = 0;
		
		do {
			System.out.println("Menu de opções:");
			System.out.println("1 - Imposto;");
			System.out.println("2 - Novo salário;");
			System.out.println("3 - Classificação;");
			System.out.println("4 - Finalizar o programa.");
			try {
				opcao = Integer.parseInt(scanner.nextLine());
				switch(opcao) {
					case 1:
						calcularImposto(scanner);
						break;
					case 2:
						calcularNovoSalario(scanner);
						break;
					case 3:
						exibirClassificacao(scanner);
						break;
					case 4:
						System.out.println("Encerrando...");
						continuar = !continuar;
						break;
					default:
						System.out.println("Opção inválida!!");
						break;
				}
				System.out.println();
			} catch(NumberFormatException e) {
				System.out.println("ERRO: insira um número inteiro.\n");
			}
		} while(continuar);
		
	}
	
	private static void calcularImposto(Scanner scanner) {
		
		double salario = 0, imposto = 0;
		
		do {
			System.out.print("Salário: ");
			try {
				salario = Double.parseDouble(scanner.nextLine());
				if(salario <= 0) {
					System.out.println("Insira um salário acima de 0.\n");
				} else if(salario < 500) {
					imposto = salario * 0.05;
				} else if(salario >= 500 && salario <= 850) {
					imposto = salario * 0.1;
				} else {
					imposto = salario * 0.15;
				}
				System.out.println("Valor do imposto: R$ " + imposto);
			} catch(NumberFormatException e) {
				System.out.println("ERRO: valor não numérico inserido.\n");
			}
		} while(salario <= 0);
		
	}
	
	private static void calcularNovoSalario(Scanner scanner) {
		
		double salario = 0, aumento = 0;
		
		do {
			System.out.print("Salário: ");
			try {
				salario = Double.parseDouble(scanner.nextLine());
				if(salario <= 0) {
					System.out.println("Insira um salário acima de 0.\n");
				} else if(salario > 1500) {
					aumento = 250;
				} else if(salario >= 750 && salario <= 1500) {
					aumento = 50;
				} else if(salario >= 450 && salario < 750) {
					aumento = 75;
				} else {
					aumento = 100;
				}
				System.out.println("Novo salário: R$ " + (salario + aumento));
			} catch(NumberFormatException e) {
				System.out.println("ERRO: valor não numérico inserido.\n");
			}
		} while(salario <= 0);
		
	}
	
	private static void exibirClassificacao(Scanner scanner) {
		
double salario = 0;
		
		do {
			System.out.print("Salário: ");
			try {
				salario = Double.parseDouble(scanner.nextLine());
				if(salario <= 0) {
					System.out.println("Insira um salário acima de 0.\n");
				} else if(salario <= 700) {
					System.out.println("Classificação: mal remunerado.");
				} else {
					System.out.println("Classificação: bem remunerado.");
				}
			} catch(NumberFormatException e) {
				System.out.println("ERRO: valor não numérico inserido.\n");
			}
		} while(salario <= 0);
		
	}

}

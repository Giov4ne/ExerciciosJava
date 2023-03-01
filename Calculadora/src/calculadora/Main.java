package calculadora;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		executarPrograma(scanner);
		
	}
	
	private static void executarPrograma(Scanner scanner) {
		int opcao = 0;
		while(opcao != 7) {
			System.out.println("Escolha uma operação:");
			System.out.println("[1] - Soma;");
			System.out.println("[2] - Subtração;");
			System.out.println("[3] - Multiplicação;");
			System.out.println("[4] - Divisão;");
			System.out.println("[5] - Potenciação;");
			System.out.println("[6] - Raiz quadrada;");
			System.out.println("[7] - Encerrar programa.");
			System.out.print("\nOperação desejada: ");
			try {
				opcao = Integer.parseInt(scanner.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("ERRO: insira um valor numérico inteiro.");
			}
			System.out.println();
			switch(opcao) {
				case 1:
					double n1 = lerValor(scanner, "Número 1");
					double n2 = lerValor(scanner, "Número 2");
					System.out.println(n1 + " + " + n2 + " = " + Calculadora.somar(n1, n2));
					break;
				case 2:
					double n3 = lerValor(scanner, "Número 1");
					double n4 = lerValor(scanner, "Número 2");
					System.out.println(n3 + " - " + n4 + " = " + Calculadora.subtrair(n3, n4));
					break;
				case 3:
					double n5 = lerValor(scanner, "Número 1");
					double n6 = lerValor(scanner, "Número 2");
					System.out.println(n5 + " x " + n6 + " = " + Calculadora.multiplicar(n5, n6));
					break;
				case 4:
					double n7 = lerValor(scanner, "Número 1");
					double n8 = lerValor(scanner, "Número 2");
					System.out.println(n7 + " / " + n8 + " = " + Calculadora.dividir(n7, n8));
					break;
				case 5:
					double base = lerValor(scanner, "Base");
					double expoente = lerValor(scanner, "Expoente");
					System.out.println(base + " elevado a " + expoente + " = " + Calculadora.potenciacao(base, expoente));
					break;
				case 6:
					double num = lerValor(scanner, "Número");
					System.out.println("Raiz quadrada de " + num + " = " + Calculadora.raizQuadrada(num));
					break;
				case 7:
					System.out.println("Encerrando...");
					break;
				default:
					System.out.println("Insira um número inteiro entre 1 e 7.");
					break;
			}
			System.out.println();
		}
	}
	
	private static double lerValor(Scanner scanner, String info) {
		double num = 0;
		while(true) {
			System.out.print(info + ": ");
			try {
				num = Double.parseDouble(scanner.nextLine());
				break;
			} catch(NumberFormatException e) {
				System.out.println("ERRO: valor não numérico inserido.\n");
			}
		}
		return num;
	}
	
}
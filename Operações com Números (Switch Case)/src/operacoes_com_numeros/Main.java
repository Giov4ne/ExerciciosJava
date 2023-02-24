// Faça um programa que receba dois números e execute as operações listadas a seguir, de acordo com a escolha do usuário.

package operacoes_com_numeros;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double n1 = 0, n2 = 0;
		
		System.out.print("Número 1: ");
		
		try {
			n1 = Double.parseDouble(scanner.nextLine());
		} catch(NumberFormatException e) {
			System.out.println("ERRO: valor não numérico inserido.");
		}
		
		System.out.print("Número 2: ");
		
		try {
			n2 = Double.parseDouble(scanner.nextLine());
		} catch(NumberFormatException e) {
			System.out.println("ERRO: valor não numérico inserido.");
		}
		
		byte operacao = 0;
		
		while(operacao < 1 || operacao > 4) {
			
			System.out.println();
			System.out.println("Escolha uma operação:");
			System.out.println("1 - Média entre os números digitados;");
			System.out.println("2 - Diferença do maior pelo menor;");
			System.out.println("3 - Produto entre os números digitados;");
			System.out.println("4 - Divisão do primeiro pelo segundo.");
			System.out.println();
			
			System.out.print("Operação desejada: ");
			try {
				operacao = Byte.parseByte(scanner.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("ERRO: valor não numérico inserido.");
			}
			
			if(operacao < 1 || operacao > 4) {
				System.out.println("Escolha entre 1 e 4.");
			}
			
		}
		
		double resultado = 0;
		
		switch(operacao) {
			case 1:
				resultado = (n1 + n2) / 2;
				break;
			case 2:
				resultado = n1 - n2;
				if(resultado < 0)
					resultado *= -1;
				break;
			case 3:
				resultado = n1 * n2;
				break;
			case 4:
				resultado = n1 / n2;
				break;
		}
		
		System.out.println("\n=======================\nResultado: " + resultado);
		
		scanner.close();
		
	}
	
}
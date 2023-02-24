/*Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. 
Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja válida e 
ACESSO NEGADO caso a senha seja inválida.*/

package validar_senha;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int senha = 1234;
		
		System.out.print("Digite a senha: ");
		
		if(scanner.nextInt() == senha) {
			System.out.print("\nACESSO PERMITIDO!");
		} else {
			System.out.print("\nACESSO NEGADO!");
		}
		
		scanner.close();
	}
	
}
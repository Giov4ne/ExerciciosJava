/*Faça um programa que leia um conjunto não determinado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. 
Finalize a entrada de dados com um valor negativo ou zero.*/

package conjunto_valores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double n = 1;
		
		while(n > 0) {
			
			System.out.print("Digite um número: ");
			try {
				n = Double.parseDouble(scanner.nextLine());
			} catch(NumberFormatException e) {
				n = 0;
				System.out.println("\nERRO: valor não numérico inserido.");
			}
			
			if(n > 0) {
				System.out.println("\nValor lido: " + n);
				System.out.println("Seu quadrado: " + Math.pow(n, 2));
				System.out.println("Seu cubo: " + Math.pow(n, 3));
				System.out.println("Sua raíz quadrada: " + Math.sqrt(n));
				System.out.println();
			} else {
				System.out.println("\nFim da execução!!");
			}
			
		}
		
		scanner.close();
		
	}
	
}
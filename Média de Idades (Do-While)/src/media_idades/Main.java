// Faça um programa que receba várias idades, calcule e mostre a média das idades digitadas. Finalize digitando idade igual a zero.

package media_idades;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numIdades = 0, idade = -1;
		double somaDasIdades = 0;
		
		do {
			System.out.print("Idade " + (numIdades + 1) + ": ");
			try {
				idade = Integer.parseInt(scanner.nextLine());
				if(idade != 0) {
					numIdades++;
					somaDasIdades += idade;
				}
			} catch(NumberFormatException e) {
				System.out.println("ERRO: insira apenas valores inteiros.\n");
			}
		} while(idade != 0);
		
		System.out.println("Média das idades: " + somaDasIdades/numIdades);
	
		scanner.close();
		
	}

}

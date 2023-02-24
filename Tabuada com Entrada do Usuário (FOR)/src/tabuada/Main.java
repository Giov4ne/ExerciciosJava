// Faça um programa para calcular a tabuada de qualquer número digitado pelo usuário.

package tabuada;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		boolean numOk = false;
		
		do {
			try {
				System.out.print("Digite um número qualquer para calcular a tabuada: ");
				num = Integer.parseInt(scan.next());
			} catch(NumberFormatException e) {
				System.out.println("Erro: precisa ser um valor do tipo inteiro.\n");
				continue;
			}
			numOk = true;
		} while(numOk == false);
		
		System.out.println("\nTABUADA DE " + num + ":");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
		
		scan.close();
		
	}
	
}
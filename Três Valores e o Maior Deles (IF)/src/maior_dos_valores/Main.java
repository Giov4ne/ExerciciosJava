// Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não informará valores iguais.

package maior_dos_valores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Valor 1: ");
		int v1 = scanner.nextInt();
		
		System.out.print("Valor 2: ");
		int v2 = scanner.nextInt();
		
		System.out.print("Valor 3: ");
		int v3 = scanner.nextInt();
		
		if(v1 != v2 && v1 != v3 && v2 != v3) {
			if(v1 > v2 && v1 > v3){
				System.out.println(v1 + " é o maior valor.");
			} else if(v2 > v1 && v2 > v3) {
				System.out.println(v2 + " é o maior valor.");
			} else if(v3 > v1 && v3 > v1) {
				System.out.println(v3 + " é o maior valor.");
			}
		} else {
			System.out.println("Há valores repetidos.");
		}
		
		scanner.close();
		
	}

}

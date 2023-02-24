/*Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes Fórmulas:

para homens: (72.7 * Altura) – 58
para mulheres: (62.1 * Altura) – 44.7*/

package altura_sexo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int genero = -1;
		double altura = 0;
		
		System.out.println("1 - Feminino\n2 - Masculino\n");
		
		while(genero != 1 && genero != 2) {
			try {
				System.out.print("Qual o seu gênero? Digite 1 ou 2: ");
				genero = Integer.parseInt(scanner.nextLine());
				if(genero != 1 && genero != 2) {
					System.out.println("O valor precisa ser 1 para Feminino ou 2 para Masculino.\n");
				}
			} catch(NumberFormatException e) {
				System.out.println("O valor precisa ser 1 ou 2.\n");
			}
		}
		
		System.out.print("\n");
		
		while(altura <= 0) {
			try {
				System.out.print("Digite sua altura (m): ");
				altura = Double.parseDouble(scanner.nextLine());
				if(altura <= 0) {
					System.out.println("O valor precisa ser maior que 0.\n");
				}
			} catch(NumberFormatException e) {
				System.out.println("O valor precisa ser do tipo numérico.\n");
			}
		}
		
		System.out.println("\n==============================");
		System.out.println("Seu peso ideal: " + calcularPesoIdeal(genero, altura) + " kg");
		
		scanner.close();
		
	}
	
	public static double calcularPesoIdeal(int genero, double altura) {
		
		if(genero == 1) {
			return (62.1 * altura) - 44.7;
		}
		
		return (72.7 * altura) - 58;
		
	}
	
}
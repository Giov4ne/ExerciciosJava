/*Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.

Sendo que:

Triângulo Equilátero: possui os 3 lados iguais.
Triângulo Isóscele: possui 2 lados iguais.
Triângulo Escaleno: possui 3 lados diferentes.*/

package tipo_triangulo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double lado1 = 0, lado2 = 0, lado3 = 0;
		
		while(lado1 <= 0 && lado2 <= 0 && lado3 <= 0) {
			while(lado1 <= 0) {
				try {
					System.out.print("Lado 1: ");
					lado1 = Double.parseDouble(scanner.nextLine());
					if(lado1 <= 0) {
						System.out.println("O valor precisa ser maior do que 0.\n");
					}
				} catch(NumberFormatException e) {
					System.out.println("O valor precisa ser do tipo numérico.\n");
				}
			}
			System.out.print("\n");
			while(lado2 <= 0) {
				try {
					System.out.print("Lado 2: ");
					lado2 = Double.parseDouble(scanner.nextLine());
					if(lado2 <= 0) {
						System.out.println("O valor precisa ser maior do que 0.\n");
					}
				} catch(NumberFormatException e) {
					System.out.println("O valor precisa ser do tipo numérico.\n");
				}
			}
			System.out.print("\n");
			while(lado3 <= 0) {
				try {
					System.out.print("Lado 3: ");
					lado3 = Double.parseDouble(scanner.nextLine());
					if(lado3 <= 0) {
						System.out.println("O valor precisa ser maior do que 0.\n");
					}
				} catch(NumberFormatException e) {
					System.out.println("O valor precisa ser do tipo numérico.\n");
				}
			}
		}
		
		scanner.close();
		
		getTipoTriangulo(lado1, lado2, lado3);
		
	}
	
	static void getTipoTriangulo(double lado1, double lado2, double lado3) {
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.println("\nO triângulo é Equilátero.");
		} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("\nO triângulo é Isósceles.");
		} else {
			System.out.println("\nO triângulo é Escaleno.");
		}
	}
	
}

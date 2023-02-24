package triangulo;

import java.util.Scanner;

public class Main {

	// TODO Faça um programa para calcular a área de um triângulo e que não 
	// permita a entrada de dados inválidos, ou seja, medidas menores ou iguais à zero.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double base = lerBase(scanner);
		double altura = lerAltura(scanner);
		double area = calcularArea(base, altura);
		System.out.println("Área: " + area + " cm²");
	}
	
	private static double lerBase(Scanner scanner) {
		double base = 0;
		
		do {
			System.out.print("Medida da base (cm): ");
			try {
				base = Double.parseDouble(scanner.nextLine());
				if(base <= 0)
					System.out.println("A base precisa ter medida maior que 0 cm.\n");
			} catch(NumberFormatException e) {
				System.out.println("ERRO: valor não numérico inserido.\n");
			}
		} while(base <= 0);
		
		return base;
	}
	
	private static double lerAltura(Scanner scanner) {
		double altura = 0;
		
		do {
			System.out.print("Medida da altura (cm): ");
			try {
				altura = Double.parseDouble(scanner.nextLine());
				if(altura <= 0)
					System.out.println("A altura precisa ter medida maior que 0 cm.\n");
			} catch(NumberFormatException e) {
				System.out.println("ERRO: valor não numérico inserido.\n");
			}
		} while(altura <= 0);
		
		return altura;
	}
	
	private static double calcularArea(double base, double altura) {
		return base*altura/2;
	}
	
}

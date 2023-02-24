/*Com o uso de herança e polimorfismo, crie um programa que calcule a área de uma figura geométrica. 
Aceite quatro tipos de figura geométrica: quadrado, retângulo, triângulo e círculo.*/

package figuras_geometricas;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		while(opcao < 1 || opcao > 4) {
			System.out.println("Calcular área de:");
			System.out.println("1 - Quadrado;");
			System.out.println("2 - Retângulo;");
			System.out.println("3 - Triângulo;");
			System.out.println("4 - Círculo.");
			System.out.print("\nOpção: ");
			try {
				opcao = Integer.parseInt(scanner.nextLine());
				if(opcao < 1 || opcao > 4) {
					System.out.println("Escolha entre 1 e 4.\n");
				}
			} catch(NumberFormatException e) {
				System.out.println("ERRO: insira um valor inteiro.\n");
			}
		}
		
		System.out.println();
		
		switch(opcao) {
			case 1:
				lerQuadrado(scanner);
				break;
			case 2:
				lerRetangulo(scanner);
				break;
			case 3:
				lerTriangulo(scanner);
				break;
			case 4:
				lerCirculo(scanner);
				break;
		}
		
	}
	
	private static void lerQuadrado(Scanner scanner) {
		double lado = 0;
		while(lado <= 0) {
			System.out.print("Medida do lado: ");
			try {
				lado = Integer.parseInt(scanner.nextLine());
				if(lado <= 0) {
					System.out.println("O lado precisa ser maior que 0.\n");
				}
			} catch(NumberFormatException e) {
				System.out.println("ERRO: insira um valor numérico.\n");
			}
		}
		Quadrado quadrado = new Quadrado(lado);
		System.out.println("Área do quadrado: " + quadrado.calcularArea());
	}
	
	private static void lerRetangulo(Scanner scanner) {
		double ladoA = 0, ladoB = 0;
		while(ladoA <= 0) {
			System.out.print("Medida do lado A: ");
			try {
				ladoA = Integer.parseInt(scanner.nextLine());
				if(ladoA <= 0) {
					System.out.println("O lado precisa ser maior que 0.\n");
				}
			} catch(NumberFormatException e) {
				System.out.println("ERRO: insira um valor numérico.\n");
			}
		}
		while(ladoB <= 0) {
			System.out.print("Medida do lado B: ");
			try {
				ladoB = Integer.parseInt(scanner.nextLine());
				if(ladoB <= 0) {
					System.out.println("O lado precisa ser maior que 0.\n");
				}
			} catch(NumberFormatException e) {
				System.out.println("ERRO: insira um valor numérico.\n");
			}
		}
		Retangulo retangulo = new Retangulo(ladoA, ladoB);
		System.out.println("Área do retângulo: " + retangulo.calcularArea());
	}
	
	private static void lerTriangulo(Scanner scanner) {
		double base = 0, altura = 0;
		while(base <= 0) {
			System.out.print("Medida da base: ");
			try {
				base = Integer.parseInt(scanner.nextLine());
				if(base <= 0) {
					System.out.println("A base precisa ser maior que 0.\n");
				}
			} catch(NumberFormatException e) {
				System.out.println("ERRO: insira um valor numérico.\n");
			}
		}
		while(altura <= 0) {
			System.out.print("Medida da altura: ");
			try {
				altura = Integer.parseInt(scanner.nextLine());
				if(altura <= 0) {
					System.out.println("A altura precisa ser maior que 0.\n");
				}
			} catch(NumberFormatException e) {
				System.out.println("ERRO: insira um valor numérico.\n");
			}
		}
		Triangulo triangulo = new Triangulo(base, altura);
		System.out.println("Área do triângulo: " + triangulo.calcularArea());
	}
	
	private static void lerCirculo(Scanner scanner) {
		double raio = 0;
		while(raio <= 0) {
			System.out.print("Medida do raio: ");
			try {
				raio = Integer.parseInt(scanner.nextLine());
				if(raio <= 0) {
					System.out.println("O raio precisa ser maior que 0.\n");
				}
			} catch(NumberFormatException e) {
				System.out.println("ERRO: insira um valor numérico.\n");
			}
		}
		Circulo circulo = new Circulo(raio);
		System.out.println("Área do círculo: " + circulo.calcularArea());
	}
	
}
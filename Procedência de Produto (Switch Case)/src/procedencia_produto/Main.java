// Faça um programa que receba o preço de um produto e seu código de origem e mostre sua procedência. A procedência obedece à tabela a seguir.

package procedencia_produto;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double preco = 0;
		int codigo = 0;
		
		while(preco <= 0) {
			System.out.print("Valor do produto: ");
			try {
				preco = Double.parseDouble(scanner.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("ERRO: o valor precisa ser numérico.\n");
				continue;
			}
			if(preco <= 0)
				System.out.println("O valor precisa ser maior que 0.\n");
		}
		
		while(codigo < 1 || codigo > 30) {
			System.out.print("Código de origem (1-30): ");
			try {
				codigo = Integer.parseInt(scanner.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("ERRO: o valor precisa ser numérico.\n");
				continue;
			}
			if(codigo < 1 || codigo > 30)
				System.out.println("O código precisa ser entre 1 e 30.\n");
		}
		
		String procedencia = obterProcedencia(codigo);
		
		System.out.println("\n===================");
		System.out.println("Preço: R$ " + preco);
		System.out.println("Código de origem: " + codigo);
		System.out.println("Procedência: " + procedencia);
		
		scanner.close();
		
	}
	
	private static String obterProcedencia(int codigo) {
		
		String procedencia = "";
		
		switch(codigo) {
			case 1:
				procedencia = "Sul";
				break;
			case 2:
				procedencia = "Norte";
				break;
			case 3:
				procedencia = "Leste";
				break;
			case 4:
				procedencia = "Oeste";
				break;
			case 5:
				procedencia = "Nordeste";
				break;
			case 6:
				procedencia = "Nordeste";
				break;
			case 7:
				procedencia = "Sudeste";
				break;
			case 8:
				procedencia = "Sudeste";
				break;
			case 9:
				procedencia = "Sudeste";
				break;
			case 10:
				procedencia = "Centro-Oeste";
				break;
			case 11:
				procedencia = "Centro-Oeste";
				break;
			case 12:
				procedencia = "Centro-Oeste";
				break;
			case 13:
				procedencia = "Centro-Oeste";
				break;
			case 14:
				procedencia = "Centro-Oeste";
				break;
			case 15:
				procedencia = "Centro-Oeste";
				break;
			case 16:
				procedencia = "Centro-Oeste";
				break;
			case 17:
				procedencia = "Centro-Oeste";
				break;
			case 18:
				procedencia = "Centro-Oeste";
				break;
			case 19:
				procedencia = "Centro-Oeste";
				break;
			case 20:
				procedencia = "Centro-Oeste";
				break;
			case 21:
				procedencia = "Nordeste";
				break;
			case 22:
				procedencia = "Nordeste";
				break;
			case 23:
				procedencia = "Nordeste";
				break;
			case 24:
				procedencia = "Nordeste";
				break;
			case 25:
				procedencia = "Nordeste";
				break;
			case 26:
				procedencia = "Nordeste";
				break;
			case 27:
				procedencia = "Nordeste";
				break;
			case 28:
				procedencia = "Nordeste";
				break;
			case 29:
				procedencia = "Nordeste";
				break;
			case 30:
				procedencia = "Nordeste";
				break;
		}
		
		return procedencia;
		
	}
	
}

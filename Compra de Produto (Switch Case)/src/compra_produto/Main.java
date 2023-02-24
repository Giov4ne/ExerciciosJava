/*Faça um programa que receba:

O código do produto comprado; e
A quantidade comprada do produto.
Calcule e mostre:

O preço unitário do produto comprado, seguindo a Tabela abaixo;
O preço total da nota;
O valor do desconto, seguindo a Tabela abaixo e aplicado sobre o preço total da nota; e
O preço final da nota depois do desconto.*/

package compra_produto;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		byte codigo = 0;
		int quantidade = 0;
		double precoUnitario, precoTotalNota, desconto, precoFinalNota;
		
		while(codigo < 1 || codigo > 40) {
			System.out.print("Código do produto (1-40): ");
			try {
				codigo = Byte.parseByte(scanner.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("ERRO: o valor precisa ser numérico.\n");
				continue;
			}
			if(codigo < 1 || codigo > 40)
				System.out.println("O código precisa ser entre 1 e 40.\n");
		}
		
		while(quantidade <= 0) {
			System.out.print("Quantidade comprada: ");
			try {
				quantidade = Integer.parseInt(scanner.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("ERRO: o valor precisa ser numérico.\n");
				continue;
			}
			if(quantidade <= 0)
				System.out.println("A quantidade precisa ser maior que 0.\n");
		}
		
		if(codigo >= 1 && codigo <= 10)
			precoUnitario = 10;
		else if(codigo >= 11 && codigo <= 20)
			precoUnitario = 15;
		else if(codigo >= 21 && codigo <= 30)
			precoUnitario = 20;
		else
			precoUnitario = 30;
		
		precoTotalNota = precoUnitario * quantidade;
		
		if(precoTotalNota < 250)
			desconto = precoTotalNota * 0.05;
		else if(precoTotalNota >= 250 && precoTotalNota <= 500 )
			desconto = precoTotalNota * 0.1;
		else
			desconto = precoTotalNota * 0.15;
		
		precoFinalNota = precoTotalNota - desconto;
		
		System.out.println("\n==========================");
		System.out.println("Preço unitário: R$ " + precoUnitario);
		System.out.println("Preço total da nota: R$ " + precoTotalNota);
		System.out.println("Desconto: R$ " + desconto);
		System.out.println("Valor final: R$ " + precoFinalNota);
		
		scanner.close();
		
	}
	
}

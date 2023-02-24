/*Faça um programa que receba o preço, a categoria (1 – limpeza; 2 – alimentação; ou 3 – vestuário) e a situação (R – produtos que necessitam de refrigeração; e N – produtos que não necessitam de refrigeração). Calcule e mostre:

O valor do aumento, usando as regras que se seguem.
tab1.jpg

 

O valor do imposto, usando as regras a seguir.
 

O produto que preencher pelo menos um dos seguintes requisitos pagará imposto equivalente a 5% do preço; caso contrário, pagará 8%. Os requisitos são:

Categoria: 2

Situação: R

O novo preço, ou seja, o preço mais aumento menos imposto.
A classificação, usando as regras a seguir.
tab2.jpg*/

package preco_produtos;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double preco = 0;
		byte categoria = 0;
		char situacao = '0';
		
		while(preco <= 0) {
			System.out.print("Valor do produto: ");
			try {
				preco = Double.parseDouble(scanner.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("ERRO: o valor precisa ser numérico.\n");
				continue;
			}
			if(preco <= 0) {
				System.out.println("O valor precisa ser maior que 0.\n");
			}
		}
		
		while(categoria < 1 || categoria > 3) {
			System.out.print("Categoria (1-limpeza; 2-alimentação; 3-vestuário): ");
			try {
				categoria = Byte.parseByte(scanner.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("ERRO: você precisa digitar 1, 2 ou 3.\n");
				continue;
			}
			if(categoria < 1 || categoria > 3) {
				System.out.println("Escolha entre 1, 2 ou 3.\n");
			}
		}
		
		while(situacao != 'R' && situacao != 'N') {
			System.out.print("Situação (R – necessita refrigeração; N - não necessita refrigeração): ");
			situacao = ((scanner.nextLine()).toUpperCase()).charAt(0);
			if(situacao != 'R' && situacao != 'N') {
				System.out.println("Escolha entre R e N.\n");
			}
		}
		
		Produto produto = new Produto(preco, categoria, situacao);
		
		System.out.println("\n==================================");
		System.out.println("Valor do aumento: R$ " + produto.getAumento());
		System.out.println("Valor do imposto: R$ " + produto.getImposto());
		System.out.println("Preço final: R$ " + produto.getValorFinal());
		System.out.println("Classificação: " + produto.getClassificacao());
		
		scanner.close();
		
	}
	
}
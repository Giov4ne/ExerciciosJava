package compra_macas;

import java.util.Scanner;

public class Maca {
	
	private double preco;
	
	public void comprar() {
		
		Scanner scanner = new Scanner(System.in);
		int qtd = 0;
		
		while(qtd < 1) {
			try {
				System.out.print("Quantas maçãs deseja comprar? ");
				qtd = Integer.parseInt(scanner.nextLine());
				if(qtd < 1) {
					System.out.println("Pelo menos 1 maçã deve ser comprada.\n");
				}
			} catch(NumberFormatException e) {
				System.out.println("O valor precisa ser inteiro.\n");
				continue;
			}
		}
		
		if(qtd < 12) {
			preco = 0.30;
		} else {
			preco = 0.25;
		}
		
		System.out.println("\n===================================\nValor total a pagar: R$ " + calcularValorTotal(qtd));;
		scanner.close();
		
	}
	
	private double calcularValorTotal(int qtd) {
		return qtd * preco;
	}
	
}
// Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

package idade_voto;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int anoNasc = 0;
		int anoAtual = 2022;
		
		do {
			try {
				System.out.print("Em que ano você nasceu? ");
				anoNasc = Integer.parseInt(scanner.nextLine());
				if(anoNasc < 1900) {
					System.out.println("Data inválida, você não deve ser tão velho assim!\n");
				} else if(anoNasc > 2022) {
					System.out.println("Data inválida, você não é nem nascido!\n");
				} else {
					int idade = anoAtual - anoNasc;
					if(idade < 16) {
						System.out.println("Não pode votar!");
					} else if(idade < 18 || idade >= 70) {
						System.out.println("Pode votar, porém não é obrigatório!");
					} else {
						System.out.println("Pode e deve votar!");
					}
				}
			} catch(NumberFormatException e) {
				System.out.println("O valor precisa ser um número inteiro!\n");
				continue;
			}
		} while(anoNasc < 1900 || anoNasc > 2022);
		
		scanner.close();
		
	}
	
}
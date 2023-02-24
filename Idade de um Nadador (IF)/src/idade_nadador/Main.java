// Faça um programa que receba a idade de um nadador e mostre sua categoria, usando as regras a seguir. Para idade inferior a 5, deverá mostrar mensagem.

package idade_nadador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int idade = -1;
		boolean tudoOk = true;
		
		try {
			System.out.print("Qual sua idade? ");
			idade = leitor.nextInt();
			while(idade < 0 || idade > 150) {
				System.out.println("Idade inválida.");
				System.out.print("\nDigite sua idade: ");
				idade = leitor.nextInt();
			}
		} catch(InputMismatchException e) {
			System.out.print("\nErro: o valor precisa ser um número inteiro.");
			tudoOk = false;
		} finally {
			if(tudoOk) {
				System.out.println("\nCategoria: " + exibirCategoria(idade));
			} else {
				System.out.print("\nReexecute o código se ainda deseja ver sua categoria.");
			}
		}
		
		leitor.close();
			
	}
	
	public static String exibirCategoria(int idade) {
		
		String categoria;
		
		if(idade < 5) {
			categoria = "Sem categoria. Precisa ter no mínimo 5 anos de idade.";
		} else if(idade >= 5 && idade <= 7) {
			categoria = "Infantil";
		} else if(idade >= 8 && idade <= 10) {
			categoria = "Juvenil";
		} else if(idade >= 11 && idade <= 15) {
			categoria = "Adolescente";
		} else if(idade >= 16 && idade <= 30) {
			categoria = "Adulto";
		} else {
			categoria = "Sênior";
		}
		
		return categoria;
		
	}
	
}
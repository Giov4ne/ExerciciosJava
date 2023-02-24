// Faça um programa que receba a idade e o peso de uma pessoa. De acordo com a tabela a seguir, verifique e mostre em qual grupo de risco essa pessoa se encaixa.

package idade_peso;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int idade = 0;
		double peso = 0;
		
		System.out.print("Qual a sua idade? ");
		idade = leitor.nextInt();
		while(idade < 0) {
			System.out.println("\nIdade inválida.");
			System.out.print("Qual é a sua idade? ");
			idade = leitor.nextInt();
		}
		
		System.out.print("\nQual o seu peso (em KG)? ");
		peso = leitor.nextDouble();
		while(peso < 0) {
			System.out.println("\nPeso inválido.");
			System.out.print("Qual é o seu peso (em KG)? ");
			peso = leitor.nextDouble();
		}
		
		int grupoRisco = verificarGrupoDeRisco(idade, peso);
		
		System.out.println("\nGrupo de risco: " + grupoRisco);
		
		leitor.close();
		
	}
	
	private static int verificarGrupoDeRisco(int idade, double peso) {
		
		int num = 0;
		
		if(idade < 20) {
			
			if(peso < 60) {
				num = 9;
			} else if(peso >= 60 && peso <= 90) {
				num = 8;
			} else {
				num = 7;
			}
			
		} else if(idade >= 20 && idade <= 50) {
			
			if(peso < 60) {
				num = 6;
			} else if(peso >= 60 && peso <= 90) {
				num = 5;
			} else {
				num = 4;
			}
			
		} else {
			
			if(peso < 60) {
				num = 3;
			} else if(peso >= 60 && peso <= 90) {
				num = 2;
			} else {
				num = 1;
			}
			
		}
		
		return num;
		
	}
	
}
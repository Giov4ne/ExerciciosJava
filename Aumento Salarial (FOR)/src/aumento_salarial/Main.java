/*Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que:

a) esse funcionário foi contratado em 2000, com salário inicial de R$1.000,00;

b) Em 2001, ele recebeu aumento de 1,5%, sobre o seu salário inicial;

c) A partir de 2002 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.

Faça um programa que determine o salário desse funcionário dos anos de 2000 à 2017. Apresente todos os valores.*/

package aumento_salarial;

public class Main {
	
	public static void main(String[] args) {
		
		double salario = 1000;
		double aumento = 0.015;
		int anoFinal = 2017;
		
		for(int ano = 2000; ano <= anoFinal; ano++) {
			if(ano > 2000) {
				salario += salario*aumento;
				aumento *= 2;
			}
			System.out.print("Ano " + ano + ", salário: R$");
			System.out.format("%.2f", salario);
			System.out.println();
		}
		
	}
	
}
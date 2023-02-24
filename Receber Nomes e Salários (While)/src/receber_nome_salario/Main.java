/*Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se que outro funcionário, João, 
tem salário equivalente a um terço do salário de Carlos. Carlos aplicará seu salário integralmente na caderneta 
de poupança, que rende 2% ao mês, e João aplicará seu salário integralmente no fundo de renda fixa, que rende 5% 
ao mês. O programa deverá calcular e mostrar a quantidade de meses necessários para que o valor pertencente a João 
iguale ou ultrapasse o valor pertencente a Carlos.*/

package receber_nome_salario;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double salarioCarlos = 0;
		
		while(salarioCarlos <= 0) {
			System.out.print("Salário de Carlos: ");
			try {
				salarioCarlos = Double.parseDouble(scanner.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("ERRO: o valor precisa ser numérico.\n");
				continue;
			}
			if(salarioCarlos <= 0) {
				System.out.println("O salário precisa ser superior a 0.\n");
			}
		}
		
		double salarioJoao = salarioCarlos / 3;
		int qtdMeses = 0;
		
		while(salarioJoao < salarioCarlos) {
			salarioCarlos += salarioCarlos * 0.02;
			salarioJoao += salarioJoao * 0.05;
			qtdMeses++;
		}
		
		System.out.println("\nSerão necessários " + qtdMeses + " meses para o salário de João se igualar ou ultrapassar o de Carlos.");
		
		scanner.close();
		
	}
	
}
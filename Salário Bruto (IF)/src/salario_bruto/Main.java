//Faça um programa que receba o salário bruto de um funcionário e, usando a tabela a seguir, calcule e mostre o valor a receber. Sabe-se que este é composto pelo salário bruto acrescido de gratificação e descontado o imposto de 7% sobre o salário.

package salario_bruto;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double salarioBruto = 0;
		
		do {
			try {
				System.out.print("Insira seu salário bruto: ");
				salarioBruto = Double.parseDouble(scan.nextLine());
				if(salarioBruto <= 0) {
					System.out.println("Seu salário precisa ser maior que 0.\n");
				}
			} catch(NumberFormatException e) {
				if(salarioBruto == 0.0) {
					continue;
				} else {
					System.out.println("ERRO: impossível ler valores de tipo não numérico.\n");
				}
			}
		} while(salarioBruto <= 0);
		
		double gratificacao = calcularGratificacao(salarioBruto);
		double imposto = salarioBruto * 0.07;
		double salarioLiquido = salarioBruto + gratificacao - imposto;
		System.out.println("\n==============================================\nValor total a receber: R$ " + salarioLiquido);
		
		scan.close();
	}
	
	private static double calcularGratificacao(double salario) {
		
		double valor = 0;
		
		if(salario <= 350) {
			valor = 100;
		} else if(salario >= 351 && salario <= 600) {
			valor = 75;
		} else if(salario >= 601 && salario <= 900) {
			valor = 50;
		} else {
			valor = 35;
		}
		
		return valor;
		
	}
	
}
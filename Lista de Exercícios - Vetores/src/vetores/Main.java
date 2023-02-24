package vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		Lista de Exercícios JAVA - 03
//		01) Dado um vetor V = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, criar um programa que imprima estes valores na tela.
		
//		int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		for(int i=0; i<v.length; i++) {
//			System.out.println(v[i]);
//		}
		
		
		
//		02) Dado um vetor V = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10} criar um programa que efetua a soma dos valores e 
//		imprima o resultado.
		
//		int v[] = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10}, soma = 0;
//		
//		for(int i=0; i<v.length; i++) {
//			soma += v[i];
//		}
//		
//		System.out.println(soma);
		
		
		
//		03) Dado um vetor V = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0}, criar um programa que efetua 
//		a média dos valores e imprima o resultado.

//		double v[] = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0}, soma = 0, media;
//		
//		for(int i=0; i<v.length; i++) {
//			soma += v[i];
//		}
//		
//		media = soma / v.length;
//		
//		System.out.println(media);
		
		
		
//		04)       Dado um vetor V = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, criar um programa que imprima este conjunto acompanhado 
//		do seu elemento simétrico em relação a sua posição no conjunto, ou seja, a impressão será: 1 - 10, 2 - 9, 3 - 8, 4 - 7, 5 
//		- 6, 6 - 5, 7 - 4, 8 - 3, 9 - 2, 10 - 1.

//		int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		for(int i=0, j=v.length-1; i<v.length; i++, j--) {
//			System.out.println(v[i] + " - " + v[j]);
//		}
		
		
		
//		05) Dado um vetor V = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}, criar um programa a que receba 
//		um número pelo teclado, verifique e imprima na tela se este número existe no vetor.

//		int v[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}, numero = 0;
//		
//		boolean condicao = false;
//		
//		while(!condicao) {
//			System.out.print("Número: ");
//			numero = scanner.nextInt();
//			
//			for(int i=0; i<v.length; i++) {
//				if(numero == v[i])
//					condicao = true;
//			}
//			
//			if(!condicao) {
//				System.out.println("Número não existente no vetor.");
//			} else {
//				System.out.println("Número existente no vetor, fim da execução!!");
//			}
//		}
		
		
		
//		06) Dado um vetor V = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9}, criar um programa que leia um 
//		número e informe na tela quantas vezes este número foi encontrado no vetor.
		
//		int v[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9}, n, qtd = 0;
//		
//		System.out.print("Digite um número: ");
//		n = scanner.nextInt();
//		
//		for(int i=0; i<v.length; i++) {
//			if(n == v[i]) {
//				qtd++;
//			}	
//		}
//		
//		System.out.println("O número " + n + " foi encontrado " + qtd + ((qtd > 1 || qtd == 0) ? " vezes" : " vez") + " no vetor.");
		
		
		
//		07) Criar um programa preencha um vetor de inteiros de 10 posições, via teclado. Após o preenchimento do 
//		vetor, o programa deverá verificar quais são os elementos ímpares e gerar um novo vetor com esses elementos. Por 
//		fim, o programa deverá exibir na tela os dois vetores.
		
		int v1[] = new int[10];
		
		System.out.println("Digite 10 números:");
		
		int c = 0;
		
		while(c < v1.length) {
			v1[c] = scanner.nextInt();
			c++;
		}
		
		int j = 0;
		
		for(int i=0; i<v1.length; i++) {
			if(v1[i] % 2 != 0) {
				j++;
			}
		}
		
		int v2[] = new int[j];
		
		System.out.print("Vetor 1: ");
		
		for(int k=0, l=0; k<v1.length; k++) {
			System.out.print(v1[k] + " ");
			if(v1[k] % 2 != 0) {
				v2[l] = v1[k];
				l++;
			}
		}
		
		System.out.print("\nVetor 2: ");
		
		for(int m=0; m<v2.length; m++) {
			System.out.print(v2[m] + " ");
		}
		
		
		
		
	}
	
}

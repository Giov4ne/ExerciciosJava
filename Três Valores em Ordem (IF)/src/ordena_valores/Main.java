// Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

package ordena_valores;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int valores[] = new int[3];
		int i = 0;
		
		while(i < valores.length) {
			try {
				System.out.print((i+1) + "º valor: ");
				valores[i] = Integer.parseInt(scanner.nextLine());
				if(i == 1) {
					if(valores[i] == valores[0]) {
						System.out.println("Valor já inserido, escolha outro valor.\n");
						continue;
					}
				} else if(i == 2) {
					if(valores[i] == valores[0] || valores[i] == valores[1]) {
						System.out.println("Valor já inserido, escolha outro valor.\n");
						continue;
					}
				}
			} catch(NumberFormatException e) {
				System.out.println("O valor precisa ser do tipo inteiro.\n");
				continue;
			}
			System.out.print("\n");
			i++;
		}
		
		System.out.println("\n====== VALORES EM ORDEM CRESCENTE ======\n");
		System.out.println(ordenarValores(valores));
		
		scanner.close();
		
	}
	
	public static String ordenarValores(int[] valores) {
		
		String listaOrdenada = "";
		
		if(valores[0] < valores[1] && valores[1] < valores[2]) {
			listaOrdenada = valores[0] + ", " + valores[1] + ", " + valores[2];
		} else if(valores[0] < valores[2] && valores[2] < valores[1]) {
			listaOrdenada = valores[0] + ", " + valores[2] + ", " + valores[1];
		} else if(valores[1] < valores[0] && valores[0] < valores[2]) {
			listaOrdenada = valores[1] + ", " + valores[0] + ", " + valores[2];
		} else if(valores[1] < valores[2] && valores[2] < valores[0]) {
			listaOrdenada = valores[1] + ", " + valores[2] + ", " + valores[0];
		} else if(valores[2] < valores[0] && valores[0] < valores[1]) {
			listaOrdenada = valores[2] + ", " + valores[0] + ", " + valores[1];
		} else if(valores[2] < valores[1] && valores[1] < valores[0]){
			listaOrdenada = valores[2] + ", " + valores[1] + ", " + valores[0];
		}
		
		return listaOrdenada;
		
	}
	
}
// Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.

package numero_maior;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int valor1 = 0;
		boolean valor1EstaOk = false;
		int valor2 = 0;
		boolean valor2EstaOk = false;
		
		do {
			try {
				System.out.print("Valor 1: ");
				valor1 = Integer.parseInt(scan.next());
			} catch(NumberFormatException e) {
				System.out.println("Erro: o valor precisa ser um número inteiro.\n");
				continue;
			}
			
			valor1EstaOk = true;
			System.out.println("");
			
		} while(!valor1EstaOk);
		
		do {
			try {
				System.out.print("Valor 2: ");
				valor2 = Integer.parseInt(scan.next());
				if(valor2 == valor1) {
					System.out.println("Os valores não podem ser iguais!\n");
					continue;
				}
			} catch(NumberFormatException e) {
				System.out.println("Erro: o valor precisa ser um número inteiro.\n");
				continue;
			}
			
			valor2EstaOk = true;
		} while(!valor2EstaOk || valor2 == valor1);
		
		System.out.println(identificarOMaior(valor1, valor2));
		
	}
	
	public static String identificarOMaior(int valor1, int valor2) {
		return (valor1 > valor2) ? "\nO valor 1 é maior!" : "\nO valor 2 é maior!";
	}
	
}
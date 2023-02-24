// Desenvolva um programa que dado um número, imprima uma das mensagens: é múltiplo de 3 ou não é múltiplo de 3. 

package multiplo_de_3;

public class Main {

	public static void main(String[] args) {
		
		int n = 42;
		System.out.println((n % 3 == 0) ? "É divisível por 3." : "Não é divisível por 3.");
		System.out.println((n % 7 == 0) ? "É divisível por 7." : "Não é divisível por 7.");
		
	}

}

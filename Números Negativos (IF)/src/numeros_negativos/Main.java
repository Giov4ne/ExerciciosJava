// Desenvolva um programa que dados três números inteiros, informe quantos são negativos.

package numeros_negativos;

public class Main {

	public static void main(String[] args) {

		int numbers[] = {-1, -2, 3}, c=0;
		
		for(int n : numbers) {
			if(n<0) c++;
		}
		
		System.out.println("Há " + c + " número(s) negativo(s).");
		
	}

}

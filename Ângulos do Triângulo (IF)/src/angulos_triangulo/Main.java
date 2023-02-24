/*Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo.

Sendo que:

Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
TriânguloAcutângulo: possui três ângulos agudos. (menor que 90º*/

package angulos_triangulo;

public class Main {

	public static void main(String[] args) {
		
		double anguloA = 100, anguloB = 60, anguloC = 20;
		
		if(anguloA + anguloB + anguloC == 180) {
			
			if(anguloA == 90 || anguloB == 90 || anguloC == 90)
				System.out.println("Triângulo Retângulo");
			else if(anguloA > 90 || anguloB > 90 || anguloC > 90)
				System.out.println("Triângulo Obtusângulo");
			else
				System.out.println("Triângulo Acutângulo");
			
		} else {
			System.out.println("Triângulo inválido");
		}
		
	}
	
}

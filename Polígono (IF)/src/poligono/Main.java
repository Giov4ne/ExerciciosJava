/*Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).

Calcular e imprimir o seguinte:

Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área

Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.

Se o número de lados for igual a 5 escrever PENTÁGONO.

Obs: O foco aqui é a lógica com o comando de controle IF, demais conhecimentos envolvidos pesquise mais. */

package poligono;

public class Main {

    public static void main(String[] args) {

        Poligono poligono = new Poligono();
        poligono.setNumLados();
        
        System.out.println("\n=====================================");
        System.out.println("Polígono: " + poligono.getPoligono());
        System.out.println(poligono.getArea());

    }

}

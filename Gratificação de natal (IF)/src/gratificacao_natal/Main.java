/*Uma empresa decidiu dar uma gratificação de Natal a seus funcionários, baseada no número de horas extras e no número de horas que o funcionário faltou ao trabalho. O valor do prêmio é obtido pela consulta à tabela que se segue, na qual:

H = número de horas extras – (2/3 * ( número de horas falta ))*/

package gratificacao_natal;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int horasExtras = 0;
		int horasFalta = 0;
		
		System.out.print("Número de horas extras: ");
		horasExtras = leitor.nextInt();
		
		System.out.print("\nNúmero de horas que o funcionário faltou ao trabalho: ");
		horasFalta = leitor.nextInt();
		
		double h = horasExtras - (2/3 * horasFalta);
		double min = h*60;
		
		double premio = calcularPremio(min);
		
		System.out.print("\nPrêmio: R$ " + premio);
		
		leitor.close();
		
	}
	
	private static double calcularPremio(double min) {
		
		if(min < 600) {
			return 100;
		} else if(min >= 600 && min <= 1200) {
			return 200;
		} else if(min > 1200 && min <= 1800) {
			return 300;
		} else if(min > 1800 && min <= 2400) {
			return 400;
		} else {
			return 500;
		}
		
	}
	
}
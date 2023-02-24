// Desenvolva um programa que dada a data de nascimento de uma pessoa e a data atual, informe a idade dessa pessoa em anos completos.

package idade_completa;

import java.time.LocalDate;
import java.time.Period;

public class Main {

	public static void main(String[] args) {

		LocalDate dataNascimento = LocalDate.of(2005, 3, 7);
		LocalDate dataAtual = LocalDate.now();
		
		Period idade = Period.between(dataNascimento, dataAtual);
		System.out.println(idade.getYears() + " anos.");
		
	}

}

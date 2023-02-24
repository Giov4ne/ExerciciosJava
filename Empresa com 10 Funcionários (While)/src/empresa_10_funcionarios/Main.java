/*Uma empresa possui dez funcionários com as seguintes características: código, número de horas trabalhadas no mês,
turno de trabalho (M – matutino; V – vespertino; N – noturno), categoria (O – operário; ou G – gerente),
valor da hora trabalhada. Sabendo-se que essa empresa deseja informatizar sua folha de pagamento, 
faça um programa que: a) Leia as informações dos funcionários, exceto o valor da hora trabalhada, 
não permitindo que sejam informações dos turnos e nem categorias inexistentes. Trabalhe sempre com a digitação de 
letras maiúsculas; b) Calcule o valor da hora trabalhada, conforme a tabela 1. Adote o valor de R$450,00 para o 
salário mínimo; c) Calcule o salário inicial dos funcionários com base no valor da hora trabalhada e no número de horas 
trabalhadas; d) Calcule o valor do auxílio alimentação recebido pelo funcionário de acordo com seu salário inicial, 
conforme a tabela 2; e) Mostre o código, número de horas trabalhadas, valor da hora trabalhada, salário inicial, 
auxílio alimentação e salário final (salário inicial + auxílio alimentação).*/

package empresa_10_funcionarios;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Funcionario funcionarios[] = new Funcionario[10];
		
		byte i = 0;
		while(i < 10) {
			funcionarios[i] = lerFuncionario(i+1);
			i++;
		}
		
		byte j = 0;
		while(j < funcionarios.length) {
			exibirFuncionario(funcionarios[j]);
			j++;
		}
		
	}
	
	private static Funcionario lerFuncionario(int codigo) {
		
		Scanner scanner = new Scanner(System.in);
		int numHorasTrabalhadas = 0;
		char turno = '0';
		char categoria = '0';
		
		System.out.println("--> Funcionário n° " + codigo);
		
		while(numHorasTrabalhadas <= 0) {
			System.out.print("Número de horas trabalhadas no mês: ");
			try {
				numHorasTrabalhadas = Integer.parseInt(scanner.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("ERRO: o valor precisa ser numérico e inteiro.");
				continue;
			}
			if(numHorasTrabalhadas <= 0) {
				System.out.println("O valor precisa ser maior que 0.");
			}
		}
		
		while(turno != 'M' && turno != 'V' && turno != 'N') {
			System.out.print("Turno de trabalho (M – matutino; V – vespertino; N – noturno): ");
			try {
				turno = scanner.nextLine().toUpperCase().charAt(0);
			} catch(StringIndexOutOfBoundsException e) {
				System.out.println("Escolha entre M (matutino), V (vespertino) ou N (noturno).");
				continue;
			}
			if(turno != 'M' && turno != 'V' && turno != 'N') {
				System.out.println("Escolha entre M (matutino), V (vespertino) ou N (noturno).");
			}
		}
		
		while(categoria != 'O' && categoria != 'G') {
			System.out.print("Categoria (O – operário; ou G – gerente): ");
			try {
				categoria = scanner.nextLine().toUpperCase().charAt(0);
			} catch(StringIndexOutOfBoundsException e) {
				System.out.println("Escolha entre O (operário) ou G (gerente).");
				continue;
			}
			if(categoria != 'O' && categoria != 'G') {
				System.out.println("Escolha entre O (operário) ou G (gerente).");
			}
		}
		
		System.out.println();
		
		return new Funcionario(codigo, numHorasTrabalhadas, turno, categoria);
		
	}
	
	private static void exibirFuncionario(Funcionario funcionario) {
		
		System.out.println("\n============ " + funcionario.getCodigo() + "° Funcionário ============");
		System.out.println("Código: " + funcionario.getCodigo());
		System.out.println("Número de horas trabalhadas: " + funcionario.getNumHorasTrabalhadas());
		System.out.println("Valor da hora trabalhada: R$ " + funcionario.getValorHora());
		System.out.println("Salário inicial: R$ " + funcionario.getHolerite().getSalarioInicial());
		System.out.println("Auxílio alimentação: R$ " + funcionario.getHolerite().getAuxilioAlimentacao());
		System.out.println("Salário final: R$ " + funcionario.getHolerite().getSalarioFinal());
		
	}
	
}
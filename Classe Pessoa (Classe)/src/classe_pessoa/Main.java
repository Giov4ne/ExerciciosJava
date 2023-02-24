/*Crie uma classe para representar uma pessoa, com os atributos privados de nome, idade e altura.

Crie os métodos públicos necessários para gets e sets e também um método para imprimir todos dados de uma pessoa.

Crie um método "fazerAniversario()" para incrementar a idade da pessoa. */

package classe_pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Pedro");
		pessoa1.setIdade(18);
		pessoa1.setAltura(1.75);
		pessoa1.fazerAniversario();
		System.out.print(pessoa1.seApresentar());
	}
	
}

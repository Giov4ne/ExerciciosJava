/*Desenvolva um programa para determinar a média final e a situação (Aprovado, Reprovado ou Exame) 
de um aluno em uma disciplina. São dadas as notas de três provas, o número de aulas ministradas e o número de faltas 
do aluno. Sabe-se que a média final é a média aritmética dessas três provas e que a média para aprovação é 7, menor 
do que 3 para reprovação e as demais em exame. Entretanto, o aluno estará reprovado se tiver faltado a mais do que 
25% das aulas.*/

package media_final_aluno;

public class Main {

	public static void main(String[] args) {

		double nota1 = 9, nota2 = 10, nota3 = 8.5;
		int numAulas = 100, numFaltas = 15;
		double media = (nota1 + nota2 + nota3)/3;
		String situacao;
		
		if(media >= 7) {
			situacao = "Aprovado";
		} else if(media < 7 && media >= 3) {
			situacao = "Exame";
		} else {
			situacao = "Reprovado";
		}
		
		if(numFaltas > numAulas*0.25) {
			situacao = "Reprovado";
		}
		
		System.out.println(situacao);
			
	}

}

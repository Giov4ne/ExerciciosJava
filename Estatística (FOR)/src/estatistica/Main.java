/*Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:

a) código da cidade;

b) número de veículos de passeio;

c) número de acidentes de trânsito com vítimas.

Deseja-se saber:

a) Qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem;

b) Qual é a média de veículos nas cinco cidades juntas;

c) Qual é a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.*/

package estatistica;

public class Main {
	
	public static void main(String[] args) {
		
		Estatistica estatistica = new Estatistica();
		
		estatistica.setCidades();
		estatistica.getMaiorMenorIndiceAcidentes();
		estatistica.getMediaVeiculos();
		estatistica.getMediaAcidentes();
		
	}
	
}

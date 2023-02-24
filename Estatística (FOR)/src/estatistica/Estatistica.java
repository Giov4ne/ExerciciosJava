package estatistica;

import java.util.Scanner;

public class Estatistica {
	
	private Cidade[] cidades = new Cidade[5];
	
	public void setCidades() {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < cidades.length; i++) {
			
			int codigo = 0;
			String nome = "";
			int numVeiculosPasseio = 0;
			int numAcidentes = -1;
			
			while(codigo <= 0) {
				try {
					System.out.print("Cód. " + (i+1) + "ª cidade: ");
					codigo = Integer.parseInt(scanner.nextLine());
					if(codigo <= 0) {
						System.out.println("O valor precisa ser acima de 0.");
					}
				} catch(NumberFormatException e) {
					System.out.println("O valor precisa ser do tipo inteiro.");
					continue;
				}
			}
			
			while(nome == "") {
				System.out.print("Nome da " + (i+1) + "ª cidade: ");
				nome = scanner.nextLine();
				if(nome == "") {
					System.out.println("Informe o nome da cidade.");
				}
			}
			
			while(numVeiculosPasseio <= 0) {
				try {
					System.out.print("Número de veículos de passeio da " + (i+1) + "ª cidade: ");
					numVeiculosPasseio = Integer.parseInt(scanner.nextLine());
					if(numVeiculosPasseio <= 0) {
						System.out.println("O valor precisa ser maior que 0.");
					}
				} catch(NumberFormatException e) {
					System.out.println("O valor precisa ser do tipo inteiro.");
					continue;
				}
			}
			
			while(numAcidentes < 0) {
				try {
					System.out.print("Número de acidentes de trânsito da " + (i+1) + "ª cidade: ");
					numAcidentes = Integer.parseInt(scanner.nextLine());
					if(numAcidentes < 0) {
						System.out.println("O valor precisa ser maior ou igual a 0.");
					}
				} catch(NumberFormatException e) {
					System.out.println("O valor precisa ser do tipo inteiro.");
					continue;
				}
			}
			
			cidades[i] = new Cidade(codigo, nome, numVeiculosPasseio, numAcidentes);
			
			System.out.print("\n");
				
		}
		
		scanner.close();
		
	}
	
	public void getMaiorMenorIndiceAcidentes() {
		
		System.out.print("=================================================\n");
		
		int maiorNum = Integer.MIN_VALUE;
		int maiorIndex = -1;
		
		for(int i = 0; i < cidades.length; i++) {
			if(cidades[i].getNumAcidentes() > maiorNum) {
				maiorNum = cidades[i].getNumAcidentes();
				maiorIndex = i;
			}
		}
		
		System.out.println("Maior índice de acidentes: " + maiorNum + ", em " + cidades[maiorIndex].getNome());
		
		int menorNum = Integer.MAX_VALUE;
		int menorIndex = -1;
		
		for(int i = 0; i < cidades.length; i++) {
			if(cidades[i].getNumAcidentes() < menorNum) {
				menorNum = cidades[i].getNumAcidentes();
				menorIndex = i;
			}
		}
		
		System.out.println("Menor índice de acidentes: " + menorNum + ", em " + cidades[menorIndex].getNome());		
		
	}
	
	public void getMediaVeiculos() {
		
		int totalVeiculos = 0;
		double numCidades = cidades.length;
		
		for(int i = 0; i < cidades.length; i++) {
			totalVeiculos += cidades[i].getNumVeiculosPasseio();
		}
		
		double mediaVeiculos = totalVeiculos / numCidades;
		
		System.out.println("Média de veículos: " + mediaVeiculos);
		
	}
	
	
	public void getMediaAcidentes() {
		
		int totalAcidentes = 0;
		double numCidades = 0;
		
		for(int i = 0; i < cidades.length; i++) {
			if(cidades[i].getNumVeiculosPasseio() < 2000) {
				totalAcidentes += cidades[i].getNumAcidentes();
				numCidades++;
			}
		}
		
		double mediaAcidentes = totalAcidentes / numCidades;
		
		System.out.println("Média de acidentes nas cidades com menos de 2000 veiculos: " + mediaAcidentes);
		
	}
	
}

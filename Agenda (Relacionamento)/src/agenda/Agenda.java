package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private List<Pessoa> pessoas;
	
	public Agenda() {
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	public void armazenarPessoa(String nome, int idade, float altura) {
		this.pessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public void removerPessoa(String nome) {
		if(this.buscarPessoa(nome) >= 0) {
			pessoas.remove(this.buscarPessoa(nome));
			System.out.println(nome + " foi removido(a) com sucesso!!\n");
		} else {
			System.out.println("Pessoa não encontrada!!\n");
		}
	}
	
	public int buscarPessoa(String nome) {
		for(Pessoa pessoa : pessoas) {
			if(pessoa.getNome().equalsIgnoreCase(nome)) {
				return pessoas.indexOf(pessoa);
			}
		}
		return -1;
	}
	
	public void imprimirAgenda() {
		if(this.pessoas.size() > 0) {
			System.out.println("Pessoas cadastradas:");
			this.pessoas.forEach(pessoa -> System.out.println(pessoa));
		} else {
			System.out.println("Ninguém foi cadastrado até o momento!!");
		}
		System.out.println();
	}
	
	public void imprimirPessoa(int index) {
		try {
			System.out.println(this.pessoas.get(index) + "\n");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Pessoa com índice " + index + " não existe na agenda!!\n");
		}
	}
	
	public int getNumDePessoasArmazenadas() {
		return this.pessoas.size();
	}
	
}
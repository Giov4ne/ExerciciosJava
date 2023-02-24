package preco_produtos;

public class Produto {
	
	private double preco;
	private double aumento;
	private double imposto;
	private double valorFinal;
	private byte categoria;
	private char situacao;
	private String classificacao;
	
	public Produto(double preco, byte categoria, char situacao) {
		this.preco = preco;
		this.categoria = categoria;
		this.situacao = situacao;
		calcAumento();
		calcImposto();
		calcValorFinal();
		setClassificacao();
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	private void calcAumento() {
		if(preco <= 25) {
			switch(categoria) {
				case 1:
					aumento = preco * 0.05;
					break;
				case 2:
					aumento = preco * 0.08;
					break;
				case 3:
					aumento = preco * 0.1;
					break;
			}
		} else {
			switch(categoria) {
				case 1:
					aumento = preco * 0.12;
					break;
				case 2:
					aumento = preco * 0.15;
					break;
				case 3:
					aumento = preco * 0.18;
					break;
			}
		}
	}
	
	public double getAumento() {
		return aumento;
	}
	
	private void calcImposto() {
		if(categoria == 2 || situacao == 'R')
			imposto = preco * 0.05;
		else
			imposto = preco * 0.08;
	}
	
	public double getImposto() {
		return imposto;
	}
	
	private void calcValorFinal() {
		valorFinal = preco + aumento - imposto;
	}
	
	public double getValorFinal() {
		return valorFinal;
	}
	
	public void setCategoria(byte categoria) {
		this.categoria = categoria;
	}
	
	public byte getCategoria() {
		return categoria;
	}
	
	public void setSituacao(char situacao) {
		this.situacao = situacao;
	}
	
	public char getSituacao() {
		return situacao;
	}
	
	private void setClassificacao() {
		if(valorFinal <= 50)
			classificacao = "Barato";
		else if(valorFinal > 50 && valorFinal < 120)
			classificacao = "Normal";
		else
			classificacao = "Caro";
	}
	
	public String getClassificacao() {
		return classificacao;
	}
	
}
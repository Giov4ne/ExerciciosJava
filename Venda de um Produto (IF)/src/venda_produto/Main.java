/*Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00;
caso contrário, o lucro será de 30%. Desenvolva um programa que dado o valor do produto, imprimir o valor de venda.*/

package venda_produto;

public class Main {

	public static void main(String[] args) {

		double valorCompra = 100.00, valorVenda;
		
		if(valorCompra < 20) {
			valorVenda = valorCompra * 1.45;
		} else {
			valorVenda = valorCompra * 1.3;
		}
		
		System.out.println("Valor da venda: R$ " + valorVenda);
		
	}

}

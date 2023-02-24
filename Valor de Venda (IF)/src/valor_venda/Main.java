/*Um comerciante calcula o valor de venda, tendo em vista a tabela a seguir:
Valor da compra    | Valor da venda
< 10,00	           | Lucro de 70%
>= 10,00 e < 30,00 | Lucro de 50%
>= 30,00 e < 50,00 | Lucro de 40%
>= 50,00	       | Lucro de 30%
Crie um programa que possa entrar com o valor da compra e imprimir o valor da venda.*/

package valor_venda;

public class Main {

	public static void main(String[] args) {
		
		double valorDaCompra = 100, valorDaVenda;
		
		if(valorDaCompra < 10) {
			valorDaVenda = valorDaCompra + valorDaCompra * 0.7;
		} else if(valorDaCompra >= 10 && valorDaCompra < 30) {
			valorDaVenda = valorDaCompra + valorDaCompra * 0.5;
		} else if(valorDaCompra >= 30 && valorDaCompra < 50) {
			valorDaVenda = valorDaCompra + valorDaCompra * 0.4;
		} else {
			valorDaVenda = valorDaCompra + valorDaCompra * 0.3;
		}
		
		System.out.println("Valor da venda: R$ " + valorDaVenda);
		
	}
	
}

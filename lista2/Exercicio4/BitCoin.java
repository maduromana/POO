/*Exercicio 4
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 05/10/2023*/

package src;

public class BitCoin implements IMoeda{
	private Float valorBitCoin;

	public BitCoin(Float valorBitCoin) {
		this.valorBitCoin = valorBitCoin;
	}

	public Float getValorBitCoin() {
		return valorBitCoin;
	}

	public void setValorBitCoin(Float valorBitCoin) {
		this.valorBitCoin = valorBitCoin;
	}

	public void imprimir() {
		System.out.println("VALOR EM BITCOIN: " + valorBitCoin);
	}


	
}

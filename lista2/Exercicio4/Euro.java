/*Exercicio 4
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 05/10/2023*/

package src;

public class Euro implements IMoeda{
	private Float valorEuro;

	public Euro(Float valorEuro) {
		this.valorEuro = valorEuro;
	}

	public Float getValorEuro() {
		return valorEuro;
	}

	public void setValorEuro(Float valorEuro) {
		this.valorEuro = valorEuro;
	}
	
	public void imprimir() {
		System.out.println("VALOR EM EURO: " + valorEuro);
	}
	
}

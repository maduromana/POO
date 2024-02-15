/*Exercicio 4
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 05/10/2023*/

package src;

public class Real implements IMoeda{
	private Float valorReal;

	public Real(Float valorReal) {
		this.valorReal = valorReal;
	}

	public Float getValorReal() {
		return valorReal;
	}

	public void setValorReal(Float valorReal) {
		this.valorReal = valorReal;
	}
	
	public void imprimir() {
		System.out.println("VALOR EM REAL: " + valorReal);
	}

}

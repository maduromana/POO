/*Exercicio 4
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 05/10/2023*/

package src;

public interface IVeiculo {
	public Float emitirPassagem();

	public Float calcularPagamento(Float distancia);

	public Float calcularTempoViagem(Float xA, Float xB, Float yA, Float yB);
}

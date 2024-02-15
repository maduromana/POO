/*Exercicio 2
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 02/10/2023*/

package src;

public class Barco extends Veiculo {
	private Integer qtdeCadeiras;
	private Integer qtdeMesas;


	public Barco(Integer qtdeCadeiras, Integer qtdeMesas, String nome, Float taxa, Float valorCalcularPagamento, Float tempoVeiculo) {
		super(nome, taxa, valorCalcularPagamento, tempoVeiculo);
		this.qtdeCadeiras = qtdeCadeiras;
		this.qtdeMesas = qtdeMesas;

	}

	public Integer getQtdeCadeiras() {
		return qtdeCadeiras;
	}

	public void setQtdeCadeiras(Integer qtdeCadeiras) {
		this.qtdeCadeiras = qtdeCadeiras;
	}

	public Integer getQtdeMesas() {
		return qtdeMesas;
	}

	public void setQtdeMesas(Integer qtdeMesas) {
		this.qtdeMesas = qtdeMesas;
	}


	public String toString() {
		return getNome() + " - CADEIRAS: " + getQtdeCadeiras() + ", MESAS: " + getQtdeMesas();
	}
	
}
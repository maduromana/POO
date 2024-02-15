/*Exercicio 2
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 02/10/2023*/

package src;

public class Onibus extends Veiculo {
	private Integer qtdePassageiros;
	private String tipo;

	
	
	public Onibus(Integer qtdePassageiros, String tipo, String nome, Float taxa, Float valorCalcularPagamento, Float tempoVeiculo) {
		super(nome, taxa, valorCalcularPagamento, tempoVeiculo);
		this.qtdePassageiros = qtdePassageiros;
		this.tipo = tipo;
	}

	public Integer getQtdePassageiros() {
		return qtdePassageiros;
	}
	
	public void setQtdePassageiros(Integer qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String toString() {
		return getNome() + " - PASSAGEIROS: " + getQtdePassageiros() + ", TIPO: " + getTipo();
	}
	
	
}
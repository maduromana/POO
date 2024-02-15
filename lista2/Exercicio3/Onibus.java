/*Exercicio 3
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
	
	public Float emitirPassagem() {
		this.taxa = 5.0f;
		return taxa;
	}

	public Float calcularPagamento(Float distancia) {
		this.pagamento = 50.0f * distancia + this.taxa;
		return pagamento;
	}

	public Float calcularTempoViagem(Float xA, Float xB, Float yA, Float yB) {
		this.distanciaEntrePontos = (float) (Math.sqrt((Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2))));
		this.tempo = (float) (50 * distanciaEntrePontos);
		return tempo;
	}
	
	public Float rendimentoVeiculo() {
		return this.rendimento = 10.0f;
	}
	
	public Float calcularCombustivel() {
		this.combustivel = this.distanciaEntrePontos * this.rendimento;
		return combustivel;
	}
	
	
	public Float calcularSeguro() {
		this.valorSeguro = 200000.f;
		return valorSeguro;
	}
	
	public Float calcularVelocidade() {
		this.velocidade = this.distanciaEntrePontos / this.tempo;
		return this.velocidade;
	}

	public Float calcularValorTotalCombustivel() {
		this.valorTotalCombustivel = (this.distanciaEntrePontos / this.rendimento) * 5.0f;
		return valorTotalCombustivel;
	}
	
	
}
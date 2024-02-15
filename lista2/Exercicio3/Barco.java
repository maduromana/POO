/*Exercicio 3
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
		return this.rendimento = 15.0f;
	}

	public Float calcularCombustivel() {
		this.combustivel = this.distanciaEntrePontos * this.rendimento;
		return combustivel;
	}

	public Float calcularSeguro() {
		this.valorSeguro = 500000.f;
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
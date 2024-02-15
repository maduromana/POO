/*Exercicio 2
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 02/10/2023*/

package src;

public class Veiculo implements IVeiculo {
	private String nome;
	private Float taxa;
	private Float pagamento;
	private Float tempo;
	private Float valorCalcularPagamento;
	private Float tempoVeiculo;
	
	public Veiculo(String nome, Float taxa, Float valorCalcularPagamento, Float tempoVeiculo) {
		this.nome = nome;
		this.taxa = taxa;
		this.valorCalcularPagamento = valorCalcularPagamento;
		this.tempoVeiculo = tempoVeiculo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Float emitirPassagem() {
		return this.taxa;
	}

	public Float calcularPagamento(Float distancia) {
		this.pagamento = this.valorCalcularPagamento * distancia + this.taxa;
		return this.pagamento;
	}

	public Float calcularTempoViagem(Float xA, Float xB, Float yA, Float yB) {
		this.tempo = (float) (this.tempoVeiculo * (Math.sqrt((Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2)))));
		return this.tempo;
	}

}

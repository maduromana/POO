/*Exercicio 3
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 02/10/2023*/

package src;

public abstract class Veiculo implements IVeiculo {
	protected String nome;
	protected Float taxa;
	protected Float pagamento;
	protected Float tempo;
	protected Float valorCalcularPagamento;
	protected Float tempoVeiculo;
	protected Float combustivel;
	protected Float valorTotalCombustivel;
	protected Float valorSeguro;
	protected Float distanciaEntrePontos;
	protected Float velocidade;
	protected Float rendimento;

	
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
	
	public abstract Float emitirPassagem();

	public abstract Float calcularPagamento(Float distancia);

	public abstract Float calcularTempoViagem(Float xA, Float xB, Float yA, Float yB);

	//5 metodos adicionados:
	public abstract Float rendimentoVeiculo();
	
	public abstract Float calcularCombustivel();
	
	public abstract Float calcularSeguro();
	
	public abstract Float calcularVelocidade();
	
	public abstract Float calcularValorTotalCombustivel();
}

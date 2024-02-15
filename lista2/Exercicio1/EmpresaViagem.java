/*Exercicio 1
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 02/10/2023*/

package src;

public class EmpresaViagem {
	private String nome;
	private String proprietario;
	private String endereco;
	private Float vendasMensais;
	private Integer qtdeMaxPassageiros;
	private Integer qtdeFuncionarios;
	private Onibus onibus;
	private Barco barco;

	public EmpresaViagem(String nome, String proprietario, String endereco, Float vendasMensais,
			Integer qtdeMaxPassageiros, Integer qtdeFuncionarios) {
		this.nome = nome;
		this.proprietario = proprietario;
		this.endereco = endereco;
		this.vendasMensais = vendasMensais;
		this.qtdeMaxPassageiros = qtdeMaxPassageiros;
		this.qtdeFuncionarios = qtdeFuncionarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Float getVendasMensais() {
		return vendasMensais;
	}

	public void setVendasMensais(Float vendasMensais) {
		this.vendasMensais = vendasMensais;
	}

	public Integer getQtdeMaxPassageiros() {
		return qtdeMaxPassageiros;
	}

	public void setQtdeMaxPassageiros(Integer qtdeMaxPassageiros) {
		this.qtdeMaxPassageiros = qtdeMaxPassageiros;
	}

	public Integer getQtdeFuncionarios() {
		return qtdeFuncionarios;
	}

	public void setQtdeFuncionarios(Integer qtdeFuncionarios) {
		this.qtdeFuncionarios = qtdeFuncionarios;
	}

	public Onibus getOnibus() {
		return onibus;
	}

	public void setOnibus(Onibus onibus) {
		this.onibus = onibus;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}
}

/*Exercicio 5
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 16/10/2023*/

package src;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public interface IVeiculo {
		public Float emitirPassagem();

		public Float calcularPagamento(Float distancia);

		public Float calcularTempoViagem(Float xA, Float xB, Float yA, Float yB);
	}

	public interface IMoeda {
		public void imprimir();
	}

	public class Barco extends Veiculo {
		private Integer qtdeCadeiras;
		private Integer qtdeMesas;

		public Barco(Integer qtdeCadeiras, Integer qtdeMesas, String nome, Float taxa, Float valorCalcularPagamento,
				Float tempoVeiculo) {
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

	public class Onibus extends Veiculo {
		private Integer qtdePassageiros;
		private String tipo;

		public Onibus(Integer qtdePassageiros, String tipo, String nome, Float taxa, Float valorCalcularPagamento,
				Float tempoVeiculo) {
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

	public class Euro implements IMoeda {
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

	public class Real implements IMoeda {
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

	public class BitCoin implements IMoeda {
		private Float valorBitCoin;

		public BitCoin(Float valorBitCoin) {
			this.valorBitCoin = valorBitCoin;
		}

		public Float getValorBitCoin() {
			return valorBitCoin;
		}

		public void setValorBitCoin(Float valorBitCoin) {
			this.valorBitCoin = valorBitCoin;
		}

		public void imprimir() {
			System.out.println("VALOR EM BITCOIN: " + valorBitCoin);
		}

	}

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

		// 5 metodos adicionados:
		public abstract Float rendimentoVeiculo();

		public abstract Float calcularCombustivel();

		public abstract Float calcularSeguro();

		public abstract Float calcularVelocidade();

		public abstract Float calcularValorTotalCombustivel();
	}

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

	private EmpresaViagem empresa = new EmpresaViagem("Tal Empresa", "Tal Proprietário", "Tal Endereço", 50000.0f, 200,
			30);

	public Principal() {

		List<Veiculo> lista = new ArrayList<>();

		Veiculo veiculo = new Onibus(40, "Com leito", "Onibus 1", 5.0f, 50.0f, 50.0f);
		lista.add(veiculo);
		veiculo = new Onibus(36, "Dois andares", "Onibus 2", 5.0f, 50.0f, 50.0f);
		lista.add(veiculo);
		veiculo = new Barco(48, 12, "Barco 1", 2000.0f, 200.0f, 20.0f);
		lista.add(veiculo);
		veiculo = new Barco(20, 5, "Barco 2", 2000.0f, 200.0f, 20.0f);
		lista.add(veiculo);

		List<IMoeda> listaMoeda = new ArrayList<>();
		IMoeda moeda = new BitCoin(2.0f);
		listaMoeda.add(moeda);
		moeda = new Euro(100.0f);
		listaMoeda.add(moeda);
		moeda = new Real(500.0f);
		listaMoeda.add(moeda);

		System.out.println("EMPRESA: " + empresa.getNome() + "\nPROPRIETÁRIO: " + empresa.getProprietario()
				+ "\nENDEREÇO: " + empresa.getEndereco() + "\nVENDAS MENSAIS: " + empresa.getVendasMensais()
				+ "\nQUANTIDADE MÁXIMA DE PASSAGEIROS: " + empresa.getQtdeMaxPassageiros()
				+ "\nQUANTIDADE DE FUNCIONÁRIOS: " + empresa.getQtdeFuncionarios() + "\n\nVEÍCULOS: \n");

		for (Veiculo certoVeiculo : lista) {

			System.out.print(certoVeiculo.toString());

			// distancia de 12 para calcular o pagamento, e xB = 8, xA = 3, yB = 10, yA = 5,
			// para calcular o tempo, por exemplo
			System.out.println(", PASSAGEM: R$ " + certoVeiculo.emitirPassagem() + ", PAGAMENTO: R$ "
					+ certoVeiculo.calcularPagamento(12.0f) + ", TEMPO DE VIAGEM: "
					+ certoVeiculo.calcularTempoViagem(8.0f, 3.0f, 10.0f, 5.0f) + " horas, RENDIMENTO: "
					+ certoVeiculo.rendimentoVeiculo() + " Litros, COMBUSTIVEL: " + certoVeiculo.calcularCombustivel()
					+ ", VALOR SEGURO: R$ " + certoVeiculo.calcularSeguro() + ", VELOCIDADE: "
					+ certoVeiculo.calcularVelocidade() + ", VALOR EM COMBUSTIVEL: R$ "
					+ certoVeiculo.calcularValorTotalCombustivel());

		}

		System.out.println();
		for (IMoeda certaMoeda : listaMoeda) {
			certaMoeda.imprimir();
		}

	}

	public static void main(String[] args) {
		new Principal();
	}
}

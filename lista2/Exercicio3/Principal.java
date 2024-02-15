/*Exercicio 3
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 02/10/2023*/

package src;

import java.util.ArrayList;
import java.util.List;

public class Principal {

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

		System.out.println("EMPRESA: " + empresa.getNome() + "\nPROPRIETÁRIO: " + empresa.getProprietario()
				+ "\nENDEREÇO: " + empresa.getEndereco() + "\nVENDAS MENSAIS: " + empresa.getVendasMensais()
				+ "\nQUANTIDADE MÁXIMA DE PASSAGEIROS: " + empresa.getQtdeMaxPassageiros()
				+ "\nQUANTIDADE DE FUNCIONÁRIOS: " + empresa.getQtdeFuncionarios() + "\n\nVEÍCULOS: \n");

		for (Veiculo certoVeiculo : lista) {

			System.out.print(certoVeiculo.toString());

			// distancia de 12 para calcular o pagamento, e xB = 8, xA = 3, yB = 10, yA = 5,
			// para calcular o tempo, por exemplo
			System.out.println(", PASSAGEM: R$ " + certoVeiculo.emitirPassagem()
					+ ", PAGAMENTO: R$ " + certoVeiculo.calcularPagamento(12.0f)
					+ ", TEMPO DE VIAGEM: " + certoVeiculo.calcularTempoViagem(8.0f, 3.0f, 10.0f, 5.0f) + " horas, RENDIMENTO: "
					+ certoVeiculo.rendimentoVeiculo() + " Litros, COMBUSTIVEL: " + certoVeiculo.calcularCombustivel()
					+ ", VALOR SEGURO: R$ " + certoVeiculo.calcularSeguro() + ", VELOCIDADE: "
					+ certoVeiculo.calcularVelocidade() + ", VALOR EM COMBUSTIVEL: R$ "
					+ certoVeiculo.calcularValorTotalCombustivel());

		}

	}

	public static void main(String[] args) {
		new Principal();
	}
}

/*Exercicio 1
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

		Veiculo veiculo = new Onibus(40, "Com leito", "Onibus 1");
		lista.add(veiculo);
		veiculo = new Onibus(36, "Dois andares", "Onibus 2");
		lista.add(veiculo);
		veiculo = new Barco(48, 12, "Barco 1");
		lista.add(veiculo);
		veiculo = new Barco(20, 5, "Barco 2");
		lista.add(veiculo);

		System.out.println("EMPRESA: " + empresa.getNome() + "\nPROPRIETÁRIO: " + empresa.getProprietario()
				+ "\nENDEREÇO: " + empresa.getEndereco() + "\nVENDAS MENSAIS: " + empresa.getVendasMensais()
				+ "\nQUANTIDADE MÁXIMA DE PASSAGEIROS: " + empresa.getQtdeMaxPassageiros()
				+ "\nQUANTIDADE DE FUNCIONÁRIOS: " + empresa.getQtdeFuncionarios() + "\n\nVEÍCULOS: \n");

		for (Veiculo certoVeiculo : lista) {

			System.out.println(certoVeiculo.toString());

		}

	}

	public static void main(String[] args) {
		new Principal();
	}
}

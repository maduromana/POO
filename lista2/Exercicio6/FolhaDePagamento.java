/*Exercicio 6
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 09/10/2023*/

package src;

public class FolhaDePagamento {
    public static void main(String[] args) {
        float salarioBase = 1320.0f;
        float bonificacao = 500.0f;
        float salarioSemanal = 1320.f/4;
        float taxaComissao = 0.025f;
        int horas = 8*5; 

        Bonificado bonificado = new Bonificado("Joao", "Silva", salarioBase, bonificacao, salarioSemanal);
        Comissionado comissionado = new Comissionado("Maria", "Soares", salarioBase, taxaComissao);
        Horista horista = new Horista("Jomar", "Silva Soares", salarioBase, horas);

        Empregado[] empregados = {bonificado, comissionado, horista};
        
        System.out.println("---------- FOLHA DE PAGAMENTO ----------\n");

        for (Empregado empregado : empregados) {
            if (empregado instanceof Bonificado) {
                System.out.println("Tipo de Pagamento: Bonificado");
            } else if (empregado instanceof Comissionado) {
                System.out.println("Tipo de Pagamento: Comissionado");
            } else if (empregado instanceof Horista) {
                System.out.println("Tipo de Pagamento: Horista");
            }
            empregado.imprimir();
            System.out.println("Ganhos: " + empregado.ganhos());
            System.out.println();
        }
    }
}
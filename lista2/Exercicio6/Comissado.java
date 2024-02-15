/*Exercicio 6
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 09/10/2023*/

package src;

class Comissionado extends Empregado {
    private float taxaComissao;

    public Comissionado(String nome, String sobrenome, float salarioBase, float taxaComissao) {
        super(nome, sobrenome, salarioBase);
        this.taxaComissao = taxaComissao;
    }

    public float ganhos() {
        return salarioBase * taxaComissao;
    }
}
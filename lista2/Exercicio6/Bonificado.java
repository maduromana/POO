/*Exercicio 6
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 09/10/2023*/

package src;

class Bonificado extends Assalariado {
    private float bonificacao;

    public Bonificado(String nome, String sobrenome, float salarioBase, float bonificacao, float salarioSemanal) {
        super(nome, sobrenome, salarioBase, salarioSemanal);
        this.bonificacao = bonificacao;
    }

    public float ganhos() {
        return salarioBase + bonificacao + salarioSemanal;
    }
}
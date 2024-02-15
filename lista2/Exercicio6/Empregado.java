/*Exercicio 6
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 09/10/2023*/

package src;

abstract class Empregado {
    protected String nome;
    protected String sobrenome;
    protected float salarioBase;

    public Empregado(String nome, String sobrenome, float salarioBase) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioBase = salarioBase;
    }

    public abstract float ganhos();

    public void imprimir() {
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Salário Base: " + salarioBase);
    }
}
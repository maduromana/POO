/*Exercicio 6
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 09/10/2023*/

package src;

abstract class Assalariado extends Empregado {
    protected float salarioSemanal;

    public Assalariado(String nome, String sobrenome, float salarioBase, float salarioSemanal) {
        super(nome, sobrenome, salarioBase);
        this.salarioSemanal = salarioSemanal;
    }
}
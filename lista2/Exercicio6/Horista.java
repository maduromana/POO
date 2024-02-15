/*Exercicio 6
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 09/10/2023*/

package src;

class Horista extends Empregado {
    private int horas;

    public Horista(String nome, String sobrenome, float salarioBase, int horas) {
        super(nome, sobrenome, salarioBase);
        this.horas = horas;
    }

    public float ganhos() {
        return salarioBase * horas;
    }
}
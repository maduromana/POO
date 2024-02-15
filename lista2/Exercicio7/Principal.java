/*Exercicio 7
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 05/10/2023*/

package src;

public class Principal {

	public class Soma implements IOperacoes {

		private float operando1;
		private float operando2;
		public static int contador = 0;

		public void setOperando1(float operando1) {
			this.operando1 = operando1;
		}

		public void setOperando2(float operando2) {
			this.operando2 = operando2;

		}

		public float getResultado() {
			return operando1 + operando2;
		}

		public String getNome() {
			return "SOMA";
		}

		public int getQuantidade() {
			Soma.contador ++;
			return Soma.contador;
		}

	}

	public class Subtracao implements IOperacoes {
		private float operando1;
		private float operando2;
		public static int contador = 0;

		public void setOperando1(float operando1) {
			this.operando1 = operando1;
		}

		public void setOperando2(float operando2) {
			this.operando2 = operando2;

		}

		public float getResultado() {
			return operando1 - operando2;
		}

		public String getNome() {
			return "SUBTRAÇÃO";
		}

		public int getQuantidade() {
			Subtracao.contador ++;
			return Subtracao.contador;		}
	}

	public class Divisao implements IOperacoes {
		private float operando1;
		private float operando2;
		public static int contador = 0;

		public void setOperando1(float operando1) {
			this.operando1 = operando1;
		}

		public void setOperando2(float operando2) {
			this.operando2 = operando2;

		}

		public float getResultado() {
			return operando1 / operando2;
		}

		public String getNome() {
			return "DIVISÃO";
		}

		public int getQuantidade() {
			Divisao.contador ++;
			return Divisao.contador;		}
	}

	public class Multiplicacao implements IOperacoes {
		private float operando1;
		private float operando2;
		public static int contador = 0;

		public void setOperando1(float operando1) {
			this.operando1 = operando1;
		}

		public void setOperando2(float operando2) {
			this.operando2 = operando2;

		}

		public float getResultado() {
			return operando1 * operando2;
		}

		public String getNome() {
			return "MULTIPLICAÇÃO";
		}

		public int getQuantidade() {
			Multiplicacao.contador ++;
			return Multiplicacao.contador;
		}
	}

	public Principal() {
		IOperacoes operacao = new Soma();
		operacao.setOperando1(5.0f);
		operacao.setOperando2(3.0f);
		System.out.println(operacao.getNome() + ": " + operacao.getResultado() + ", CONTADOR: " + operacao.getQuantidade());
		operacao = new Subtracao();
		operacao.setOperando1(5.0f);
		operacao.setOperando2(3.0f);
		System.out.println(operacao.getNome() + ": " + operacao.getResultado() + ", CONTADOR: " + operacao.getQuantidade());
		operacao = new Divisao();
		operacao.setOperando1(5.0f);
		operacao.setOperando2(3.0f);
		System.out.println(operacao.getNome() + ": " + operacao.getResultado() + ", CONTADOR: " + operacao.getQuantidade());
		operacao = new Multiplicacao();
		operacao.setOperando1(5.0f);
		operacao.setOperando2(3.0f);
		System.out.println(operacao.getNome() + ": " + operacao.getResultado() + ", CONTADOR: " + operacao.getQuantidade());

	}

	public static void main(String[] args) {
		new Principal();
	}

}

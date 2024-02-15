/*Exercicio 9
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 15/10/2023*/

package src;

import java.io.IOException;

public class Principal {

	public class ExceptionA extends Exception {
		
		public ExceptionA(String texto) {
			System.out.print(texto);
		}

	}

	public class ExceptionB extends ExceptionA {

		public ExceptionB(String texto) {
			super(texto);
		}

	}

	public Principal() {

		try {
			throw new ExceptionA("Exceção A foi lançada");
		} catch (Exception e) {
			System.out.println(" e capturada: " + e.getMessage());
		}
		
		try {
			throw new ExceptionB("Exceção B foi lançada");
		} catch (Exception e) {
			System.out.println(" e capturada: " + e.getMessage());
		}
		
		try {
			String texto = null;
			System.out.print("Exceção NullPointer foi lançada");
            int tamanho = texto.length();
		} catch (Exception e) {
			System.out.println(" e capturada: " + e.getMessage());
		}
		
		try {
			throw new IOException("Exceção IOException foi lançada");
		} catch (Exception e) {
            System.out.println(e.getMessage() + " e capturada: " + e.getClass().getName());
		}
	}

	public static void main(String[] args) {
		new Principal();
	}
}

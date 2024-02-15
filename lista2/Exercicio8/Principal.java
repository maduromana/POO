/*Exercicio 8
Autor(es): MARIA EDUARDA SOARES ROMANA SILVA e TIAGO FERNANDES SOUCEK
Data: 15/10/2023*/

package src;
public class Principal {

	
	public class ExceptionA extends Exception{
		 public ExceptionA(String message) {
		        super(message);
		    }
	}
	
	public class ExceptionB extends ExceptionA{
		 public ExceptionB(String message) {
		        super(message);
		    }
	}
	
	public class ExceptionC extends ExceptionB{
		 public ExceptionC(String message) {
		        super(message);
		    }
	}
	
	public Principal() {
		try {
            throw new ExceptionC("ExceptionC foi lançada.");
        } catch (ExceptionA e) {
            System.out.println("ExceptionA foi capturada. " + e.getMessage());
        }
	}
	
	public static void main(String [] args) {
		new Principal();
	}
	
}

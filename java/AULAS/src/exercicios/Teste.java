package exercicios;

import java.util.Locale;

public class Teste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int numero = 233;
		
		do { 
			if (numero >= 300 && numero <= 400) {
				System.out.print(numero + " + 3 = ");
				numero = numero + 3;
				System.out.println(numero);
			}
			else {
				System.out.print(numero + " + 5 = ");
				numero = numero + 5;
				System.out.println(numero) ;
			}
		} while (numero >= 233 && numero < 456);
    }
}

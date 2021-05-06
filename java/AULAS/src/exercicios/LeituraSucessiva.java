package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class LeituraSucessiva {
	public static void main(String[] args) {
		/*ENQUANTO
		 * 1- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
		apresente no final o total do somat�rio ok
		, a m�dia ok
		e o total de valores lidos. ok
		O programa
		deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores
		positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor
		negativo.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero=0, somatorio=0, media=0, totalValoresLidos=0;

		while (numero >= 0) {
			System.out.print("Informe um numero positivo: "); 
			numero = sc.nextInt();
			somatorio = somatorio + numero;
			totalValoresLidos++;
		}
		
		media = somatorio / totalValoresLidos;

		System.out.println("A soma dos valores informados � de: " + somatorio); 
		System.out.println("A quantidade de vezes que foram informados numeros !=0 foi de: " + totalValoresLidos + " vezes"); 
		System.out.println("\nA m�dia dos numeros informados �: " + media);
		
		sc.close();
	}
}

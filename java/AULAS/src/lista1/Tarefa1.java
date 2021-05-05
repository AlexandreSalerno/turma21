package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int years, months, days, age;
		
		System.out.println("Insira sua idade expressa em anos, meses e dias, respectivamente.");
		System.out.print("Anos: ");
		years = sc.nextInt();
		System.out.print("Meses: ");
		months = sc.nextInt();
		System.out.print("Dias: ");
		days = sc.nextInt();

		age = (years * 365) + (months * 30) + days;

		System.out.println("Sua idade é aproximadamente " + age + " em dias.");
		
		sc.close();
	}		
}

package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Ex3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int duracaoEvento, horas, minutos, segundos;

		System.out.print("Insira o tempo de duração de um evento em segundos: ");
		duracaoEvento = sc.nextInt();

		horas = duracaoEvento / 3600;
		minutos = (duracaoEvento % 3600) / 60;
		segundos = (duracaoEvento % 3600) % 60;

		System.out.println("Este evento durou " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
		
		sc.close();
	}
}

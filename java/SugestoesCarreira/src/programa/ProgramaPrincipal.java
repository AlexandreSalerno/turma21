package programa;

import java.util.Locale;
import java.util.Scanner;

import classes.Matematica;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE SUGEST�O DE CARREIRA");
		System.out.println("Aqui voc� encontrar� sugest�es de �reas � seguir profissionalmente considerando seu desempenho atual.");
		
		System.out.print("Insira a nota para Matematica: ");
		double nota = leia.nextDouble();
		System.out.print("Insira as faltas para Matematica: ");
		int faltas = leia.nextInt();
		
		Matematica mat = new Matematica(nota, faltas);
		mat.imprimirListaSugestoes();
		
		leia.close();
	}
}

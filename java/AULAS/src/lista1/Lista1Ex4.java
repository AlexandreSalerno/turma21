package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Ex4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, D, R, S;

		System.out.println("Insira um número inteiro e positivo para os seguinte valores.");
		System.out.print("A: ");
		A = sc.nextDouble();
		System.out.print("B: ");
		B = sc.nextDouble();
		System.out.print("C: ");
		C = sc.nextDouble();

		R = Math.pow(A, 2.0) + Math.pow(B, 2.0);
		S = Math.pow(B, 2.0) + Math.pow(C, 2.0);

		D = (R + S) / 2;

		System.out.println("R = " + R + ", S = " + S + ", D = " + D);
		
		sc.close();
	}
	
}

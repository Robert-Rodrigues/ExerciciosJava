package exerciciosbroders2;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int n = read.nextInt();
		
		if (n<0) {
			System.out.println("Este n�mero � negativo.");
		}
		else {
			System.out.println("Este n�mero � positivo.");
		}
		read.close();

	}

}

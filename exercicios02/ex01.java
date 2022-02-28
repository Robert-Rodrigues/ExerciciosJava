package exerciciosbroders2;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = read.nextInt();
		
		if (n<0) {
			System.out.println("Este número é negativo.");
		}
		else {
			System.out.println("Este número é positivo.");
		}
		read.close();

	}

}

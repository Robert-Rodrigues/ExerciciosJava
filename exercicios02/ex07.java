package exerciciosbroders2;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o valor de X:");
		double x = read.nextDouble();
		
		System.out.println("Digite o valor de Y:");
		double y = read.nextDouble();
		
		if (x==0 && y==0) {
			System.out.println("Origem.");
		}
			else if (x==0) {
			System.out.println("Eixo X");
		}
			else if (y==0) {
			System.out.println("Eixo Y");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		read.close();
	}

}

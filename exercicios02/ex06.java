package exerciciosbroders2;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		double number = read.nextDouble();
		
		if (number >= 0 && number <=25) {
			System.out.println("O n�mero "+number+" est� no intervalo [0,25].");
		}
		else if (number >= 25 && number <=50) {
			System.out.printf("O n�mero "+number+" est� no intervalo [25,50].\n");
		}
		else if (number >= 50 && number <=75) {
			System.out.printf("O n�mero "+number+" est� no intervalo [50,75].\n");
		}
		else if (number >= 75 && number <=100) {
			System.out.printf("O n�mero "+number+" est� no intervalo [75,100].");
		}
		else {
			System.out.println("Fora de intervalo.");
		}
		read.close();
	}

}

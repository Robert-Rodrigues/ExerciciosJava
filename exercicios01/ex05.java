package exerciciosbroders;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o c�digo da pe�a 1:");
		int idpeca1 = ler.nextInt();
		
		System.out.println("Digite a quantidade de pe�as 1:");
		int qtpeca1 = ler.nextInt();
		
		System.out.println("Digite o valor unit�rio da pe�a 1:");
		double valpeca1 = ler.nextDouble();
		
		System.out.println("Digite o c�digo da pe�a 2:");
		int idpeca2 = ler.nextInt();
		
		System.out.println("Digite a quantidade de pe�as 2:");
		int qtpeca2 = ler.nextInt();
		
		System.out.println("Digite o valor unit�rio da pe�a 2:");
		double valpeca2 = ler.nextDouble();
		
		double total = (qtpeca1*valpeca1) + (qtpeca2*valpeca2);
		
		System.out.printf("PE�A 1 ID: %d. PE�A 2 ID: %d.\n",idpeca1,idpeca2);
		System.out.printf("VALOR A PAGAR: %.2f",total);
		
		ler.close();
	}

}

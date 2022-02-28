package exerciciosbroders;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int a = ler.nextInt();
		
		System.out.println("Digite o valor de B:");
		int b = ler.nextInt();
		
		System.out.println("Digite o valor de C:");
		int c = ler.nextInt();
		
		System.out.println("Digite o valor de D:");
		int d = ler.nextInt();
		
		int res = (a*b) - (c*d);
		
		System.out.printf("DIFERENÇA: %d",res);
		ler.close();
	}

}

package exerciciosbroders2;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o número de A:");
		int a = read.nextInt();
		
		System.out.println("Digite o número de B:");
		int b = read.nextInt();
		
		if(a % b == 0 || b % a ==0){
			System.out.println("Os números são múltiplos.");
		}
		else {
			System.out.println("Os números não são múltiplos");
		}
		read.close();
		}

}

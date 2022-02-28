package exerciciosbroders;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do círculo:");
		double n1 = ler.nextDouble();
		double area = 3.14159*Math.pow(n1, 2.0);
		System.out.printf("O valor da área deste círculo é: %.4f",area);
		ler.close();

	}

}

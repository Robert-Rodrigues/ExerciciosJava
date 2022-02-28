package exerciciosbroders2;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salário em Rombus:");
		double rombus = read.nextDouble();
		while (rombus<0) {
			System.out.println("Digite um valor válido.");
			rombus = read.nextDouble();
		}
	
		if (rombus >=0 && rombus <= 2000.00) {
			System.out.println("Isento.");
		}
		else if (rombus >= 2000.01 && rombus <=3000.00) {
			System.out.printf("A taxa de imposto é de : R$%.2f",rombus-2000.00*0.08);
		}
		else if (rombus >= 3000.01 && rombus <=4500.00) {
			System.out.printf("A taxa de imposto é de : R$%.2f", (rombus-3000.0)*(0.18)+(1000.0)*(0.08));
		}
		else {
			System.out.printf("A taxa de imposto é de : R$%.2f",(rombus-4500.00)*(0.28)+(1500.00)*(0.18)+(1000.00)*(0.08));
		}
		read.close();
	}

}

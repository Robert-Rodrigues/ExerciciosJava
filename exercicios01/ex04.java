package exerciciosbroders;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número do funcionário:");
		int nf = ler.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas:");
		int horast = ler.nextInt();
		
		System.out.println("Digite o valor recebido por hora trabalhada:");
		double valorhora = ler.nextDouble();
		
		double sal = horast * valorhora;
		
		System.out.printf("NUMBER = %d\n",nf);
		System.out.printf("SALÁRIO = U$%.2f ",sal);
		ler.close();

	}

}

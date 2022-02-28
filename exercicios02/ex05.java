package exerciciosbroders2;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o código do item:");
		double cod = read.nextDouble();
		
		while (cod >5 || cod <=0) {
			System.out.println("Digite um número válido:");
			cod = read.nextDouble();
		}
		
		
		System.out.println("Digite a quantidade de itens:");
		double qtd = read.nextDouble();
		
		if(cod == 1) {
			double valortotal = qtd*4.0;
			System.out.println("Item escolhido: Cachorro quente.");
			System.out.println("O valor total é R$"+valortotal);
		}
		else if(cod == 2) {
			double valortotal = qtd*4.5;
			System.out.println("Item escolhido: X Salada.");
			System.out.println("O valor total é R$"+valortotal);
		}
		else if(cod == 3) {
			double valortotal = qtd*5.0;
			System.out.println("Item escolhido: X Bacon.");
			System.out.println("O valor total é R$"+valortotal);
		}
		else if(cod == 4) {
			double valortotal = qtd*2.0;
			System.out.println("Item escolhido: Torrada simples.");
			System.out.println("O valor total é R$"+valortotal);
		}
		else if(cod == 5) {
			double valortotal = qtd*1.5;
			System.out.println("Item escolhido: Refrigerante.");
			System.out.println("O valor total é R$"+valortotal);
		}
		
		read.close();
	}

}

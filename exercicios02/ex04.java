package exerciciosbroders2;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial do jogo:");
		int horainicial = read.nextInt();
		
		System.out.println("Digite a hora final do jogo :");
		int horafinal = read.nextInt();
		
		int duracao;
		
		if (horainicial < horafinal) {
			duracao = horafinal - horainicial;
			System.out.printf("A duração do jogo foi de %dh", duracao);
		}
		else{
			duracao = 24 - horainicial + horafinal;
			System.out.printf("A duração do jogo foi de %dh", duracao);
		}
	read.close();
	}

}

package exerciciosbroders;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o primeiro valor:");
	int n1 = ler.nextInt();
	
	System.out.println("Digite o segundo valor:");
	int n2 = ler.nextInt();
	
	System.out.println("ENTRADA:\n"+n1+"\n"+n2+"");
	System.out.println("SAÍDA:");
	System.out.println("SOMA = "+(n1+n2));
	ler.close();

	}

}

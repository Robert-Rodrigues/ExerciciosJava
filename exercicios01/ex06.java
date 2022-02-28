package exerciciosbroders;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o valor real de A:");
	double a = ler.nextDouble();
	
	System.out.println("Digite o valor real de B:");
	double b = ler.nextDouble();
	
	System.out.println("Digite o valor real de C:");
	double c = ler.nextDouble();
	
	double tri = (a*c)/2;
    double cir = 3.14159 * Math.pow(c, 2);
    double tra = (a + b) * c /2;
    double qua = Math.pow(b, 2);
    double ret = a*b;
	
	System.out.printf("TRIANGULO: %.3f\n",tri);
	System.out.printf("CIRCULO: %.3f\n",cir);
	System.out.printf("TRAPEZIO: %.3f\n",tra);
	System.out.printf("QUADRADO: %.3f\n",qua);
	System.out.printf("RETANGULO: %.3f",ret);
	ler.close();
	}

}

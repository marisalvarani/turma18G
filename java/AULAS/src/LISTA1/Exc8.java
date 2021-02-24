package LISTA1;

import java.util.Scanner;

public class Exc8 {
	
	public static void main(String[]args ) {
		
		Scanner ler = new Scanner(System.in);
		double custoF,custoC;
		System.out.println("Custo de fábrica = ");
		custoF = ler.nextInt();
		custoC = custoF + (custoF*0.28) + (custoF*0.45);
		System.out.println("Custo ao consumidor = " + custoC + " reais.");
	}

}

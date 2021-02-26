package LISTA3;

import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x,soma1=0,soma2=0;
		double media;
		
		do {
			System.out.println("Digite um número:");
			x = ler.nextInt();
			if(x!=0 && x%3==0) {
				soma1 = soma1 + x;
				soma2 = soma2 + 1;
			}
		}
		while (x!=0);
		media = soma1/soma2;
		System.out.println("Média dos números múltiplos de 3 = "+media);

		

	}

}

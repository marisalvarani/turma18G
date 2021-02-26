package LISTA3;

import java.util.Scanner;

public class Exc5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x,soma=0;
		
		do {
			System.out.println("Digite um número:");
			x = ler.nextInt();
			soma = soma + x;
		}
		while (x!=0);
		System.out.println("Soma dos números = "+soma);

	}

}

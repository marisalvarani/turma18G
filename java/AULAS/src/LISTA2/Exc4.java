package LISTA2;

import java.util.Scanner;

public class Exc4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero=0;
		double raiz,quad;
		System.out.println("Digite um número inteiro positivo: ");
		numero = ler.nextInt();
		if (numero%2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.println("\nO número "+ numero + " é par!!!");
			System.out.println("\nSua raíz quadrada é "+raiz);
		}
		else {
			quad = Math.pow(numero, 2);
			System.out.println("\nO número "+ numero + " é ímpar!!!");
			System.out.println("\nElevado ao quadrado é "+quad);
		}
		
	}

}
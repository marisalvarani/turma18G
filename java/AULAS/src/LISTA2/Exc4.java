package LISTA2;

import java.util.Scanner;

public class Exc4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero=0;
		double raiz,quad;
		System.out.println("Digite um n�mero inteiro positivo: ");
		numero = ler.nextInt();
		if (numero%2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.println("\nO n�mero "+ numero + " � par!!!");
			System.out.println("\nSua ra�z quadrada � "+raiz);
		}
		else {
			quad = Math.pow(numero, 2);
			System.out.println("\nO n�mero "+ numero + " � �mpar!!!");
			System.out.println("\nElevado ao quadrado � "+quad);
		}
		
	}

}
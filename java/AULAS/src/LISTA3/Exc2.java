package LISTA3;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		int y,somaP=0,somaI=0;
		for(int x=1;x<=10;x++) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite um número: ");
			y = ler.nextInt();
			if (y%2==0) {
				somaP = somaP +1;
			}
			else {
				somaI = somaI +1;
			}
		}
		System.out.println("\nQuantidade de números pares = "+somaP);
		System.out.println("\nQuantidade de números ímpares = "+somaI);
		
		

	}

}

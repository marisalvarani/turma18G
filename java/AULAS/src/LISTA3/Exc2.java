package LISTA3;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		int y,somaP=0,somaI=0;
		for(int x=1;x<=10;x++) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite um n�mero: ");
			y = ler.nextInt();
			if (y%2==0) {
				somaP = somaP +1;
			}
			else {
				somaI = somaI +1;
			}
		}
		System.out.println("\nQuantidade de n�meros pares = "+somaP);
		System.out.println("\nQuantidade de n�meros �mpares = "+somaI);
		
		

	}

}

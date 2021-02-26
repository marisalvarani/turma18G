package FUNCOES;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero,maior=0;
		
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if(numero>maior) {
				maior = numero;
				
			}
		}while(numero>=0);
		System.out.println(maior);
		}
	

	

}

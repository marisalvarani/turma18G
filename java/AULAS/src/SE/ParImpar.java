package SE;

import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero=0;
		System.out.println("Digite um n�mero inteiro positivo: ");
		numero = ler.nextInt();
		if (numero%2 == 0) {
			System.out.println("O n�mero "+ numero + " � par!!!");
		}
		else {
			System.out.println("O n�mero "+ numero + " � �mpar!!!");
		}
		
	}

}

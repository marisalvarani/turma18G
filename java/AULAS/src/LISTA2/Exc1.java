package LISTA2;

import java.util.Scanner;

public class Exc1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		System.out.println("Digite um n�mero A: ");
		a = ler.nextInt();
		System.out.println("Digite um n�mero B: ");
		b = ler.nextInt();
		System.out.println("Digite um n�mero C: ");
		c = ler.nextInt();
		if(a>b && a>c) {
			System.out.println("Maior n�mero = "+a);
		}
		else if(b>a && b>c) {
			System.out.println("Maior n�mero = "+b);
		}
		else {
			System.out.println("Maior n�mero = "+c);
		}
	
	}
}

package LISTA2;

import java.util.Scanner;

public class Exc1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		System.out.println("Digite um número A: ");
		a = ler.nextInt();
		System.out.println("Digite um número B: ");
		b = ler.nextInt();
		System.out.println("Digite um número C: ");
		c = ler.nextInt();
		if(a>b && a>c) {
			System.out.println("Maior número = "+a);
		}
		else if(b>a && b>c) {
			System.out.println("Maior número = "+b);
		}
		else {
			System.out.println("Maior número = "+c);
		}
	
	}
}

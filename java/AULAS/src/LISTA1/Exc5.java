package LISTA1;

import java.util.Scanner;

public class Exc5 {
	
	public static void main(String[]args ) {
		
		Scanner ler = new Scanner(System.in);
		double n1,n2,n3,m;
		System.out.println("Nota 1 = ");
		n1 = ler.nextInt();
		System.out.println("Nota 2 = ");
		n2 = ler.nextInt();
		System.out.println("Nota 3 = ");
		n3 = ler.nextInt();
		m = ((n1*2)+(n2*3)+(n3*5))/10;
		System.out.println("Média = " + m);
	}

}

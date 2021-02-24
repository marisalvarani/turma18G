package LISTA1;

import java.util.Scanner;


public class Exc4 {
	
	public static void main(String[]args ) {
		
		Scanner ler = new Scanner(System.in);
		double a,b,c,d,r,s;
		System.out.println("A = ");
		a = ler.nextInt();
		System.out.println("B = ");
		b = ler.nextInt();
		System.out.println("C = ");
		c = ler.nextInt();
		r = Math.pow(a+b,2);
		s = Math.pow(b+c,2);
		d = (r+s)/2;
		System.out.println("D = " + d);
		
		
		
		
	}

}

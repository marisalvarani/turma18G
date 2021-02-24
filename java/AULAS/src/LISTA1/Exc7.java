package LISTA1;

import java.util.Scanner;

public class Exc7 {
	
	public static void main(String[]args ) {
		
		Scanner ler = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		System.out.println("a = ");
		a = ler.nextInt();
		System.out.println("b = ");
		b = ler.nextInt();
		System.out.println("c = ");
		c = ler.nextInt();
		System.out.println("d = ");
		d = ler.nextInt();
		System.out.println("e = ");
		e = ler.nextInt();
		System.out.println("f = ");
		f = ler.nextInt();
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		System.out.println("x = " + x + " e y = " + y);
		
	}
}

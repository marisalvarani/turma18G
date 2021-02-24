package LISTA1;

import java.util.Scanner;

public class Exc6 {
	
	public static void main(String[]args ) {
		
		Scanner ler = new Scanner(System.in);
		double d,x1,y1,x2,y2;
		System.out.println("x1 = ");
		x1 = ler.nextInt();
		System.out.println("y1 = ");
		y1 = ler.nextInt();
		System.out.println("x2 = ");
		x2 = ler.nextInt();
		System.out.println("y2 = ");
		y2 = ler.nextInt();
		d = Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1),2)));
		System.out.println("d = " + d);
		
	}
}
	

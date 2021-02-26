package LISTA2;

import java.util.Scanner;

public class Exc2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a,b,c,d,e,f;
		System.out.println("Digite um número A: ");
		a = ler.nextInt();
		System.out.println("Digite um número B: ");
		b = ler.nextInt();
		System.out.println("Digite um número C: ");
		c = ler.nextInt();
		if(a>b && a>c) {
			f = a;
		}
		else if(b>a && b>c) {
			f = b;
		}
		else {
			f = c;
		}
		if(a<b && a<c) {
			d = a;
		}
		else if(b<a && b<c) {
			d = b;
		}
		else {
			d = c;
		}
		if(a!=d && a!=f) {
			e = a;
		}
		else if(b!=d && b!=f) {
			e = b;
		}
		else {
			e = c;
		}
		System.out.println(d+" "+e+" "+f);
		
	}

}
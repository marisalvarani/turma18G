package LISTA1;

import java.util.Scanner;

public class Exc1 {
	
	public static void main(String[]args ) {
		
		Scanner ler = new Scanner(System.in);
		int anos,meses,dias,totalDias;
		System.out.println("Anos = ");
		anos = ler.nextInt();
		System.out.println("Meses = ");
		meses = ler.nextInt();
		System.out.println("Dias = ");
		dias = ler.nextInt();
		totalDias = (anos*365) + (meses*30) + dias;
		System.out.println("Dias totais = " + totalDias);
		
		
	}

}

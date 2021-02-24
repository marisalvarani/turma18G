package LISTA1;

import java.util.Scanner;

public class Exc2 {
	
	public static void main(String[]args ) {
		
		Scanner ler = new Scanner(System.in);
		int anos,meses,dias,totalDias;
		System.out.println("Total de dias = ");
		totalDias = ler.nextInt();
		anos = totalDias/365;
		meses = (totalDias%365)/30;
		dias = (totalDias%365)%30;
		System.out.println(anos + " Anos " + meses + " Meses " + dias + " Dias. ");
	}

}

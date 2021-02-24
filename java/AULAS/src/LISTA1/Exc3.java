package LISTA1;

import java.util.Scanner;

public class Exc3 {
	
	public static void main(String[]args ) {
		
		Scanner ler = new Scanner(System.in);
		int seg,min,horas,totalSeg;
		System.out.println("Total em segundos = ");
		totalSeg = ler.nextInt();
		horas = totalSeg/3600;
		min = (totalSeg%3600)/60;
		seg = (totalSeg%3600)%60;
		System.out.println(horas + " Horas " + min + " Minutos " + seg + " Segundos. ");
	}

}

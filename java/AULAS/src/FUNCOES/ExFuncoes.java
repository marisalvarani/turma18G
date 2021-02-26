package FUNCOES;

import java.util.Scanner;

public class ExFuncoes {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int linha;
		System.out.println("Digite o tamanho da linha");
		linha = ler.nextInt();
		lin (linha);
		
		 
	}
	
	public static void lin (int linha) {
		for(int x=0;x<linha;x++) {
			System.out.print("-");
		}
		
	}
}

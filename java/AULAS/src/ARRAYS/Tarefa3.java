package ARRAYS;

import java.util.Scanner;

public class Tarefa3 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int N1[][]=new int[4][6]; 
		int N2[][]=new int[4][6];
		int M1[][]=new int[4][6]; 
		int M2[][]=new int[4][6];
		int l, c, soma=0, dif=0;
		for(l=0;l<4;l++) {
			for(c=0;c<6;c++) {
				System.out.println("Digite o valor N1: ");
				N1[l][c]=leia.nextInt();
				
	}
	}
		for(l=0;l<4;l++) {
			for(c=0;c<6;c++) {
				System.out.println("Digite o valor N2: ");
				N2[l][c]=leia.nextInt();
				
			}
		}
		for(l=0;l<4;l++) {
			for(c=0;c<6;c++) {
				soma = N1[l][c] + N2[l][c];
				M1[l][c] = soma;
			}
		}
		for(l=0;l<4;l++) {
			for(c=0;c<6;c++) {
				System.out.print("[ "+M1[l][c]+" ]");
			}
			System.out.println("\n");
		}
		for(l=0;l<4;l++) {
			for(c=0;c<6;c++) {
				dif = N1[l][c] - N2[l][c];
				M2[l][c] = dif;
				
			}
		}
		for(l=0;l<4;l++) {
			for(c=0;c<6;c++) {
				System.out.print("[ "+M2[l][c]+" ]");
			}
			System.out.println("\n");
		}
}
}

package ARRAYS;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int mat[][]=new int[3][3]; 
		int l, c, soma=0, somaDiag=0;
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.println("Digite o valor: ");
				mat[l][c]=leia.nextInt();
			}
		}
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.print("[ "+mat[l][c]+" ]");
				soma = soma + mat[l][c];
			}
			System.out.println("\n");
		}
		somaDiag = mat[0][0]+mat[1][1]+mat[2][2];
		System.out.println("Soma valores totais= "+soma);
		System.out.println("\nSoma valores diagonais=  "+somaDiag);
				
		

	}

}

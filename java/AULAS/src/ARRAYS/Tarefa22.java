package ARRAYS;

import java.util.Scanner;

public class Tarefa22 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int lancamentos[]=new int[10];
		double media=0.00, soma=0.00;
		int maior=0, cont=0;
		
		
		
		for(int x=0;x<lancamentos.length;x++) {
			System.out.printf("Digite o resultado do lan�amento %d :",(x+1));
			lancamentos[x]=(int) (Math.random()*6)+1;
		}
		
		for(int x=0; x<lancamentos.length;x++) {
			System.out.printf("O valor do lan�amento %d � %d \n",(x+1),lancamentos[x]);
			soma = soma+lancamentos[x];
			if(lancamentos[x]>=maior) {
				
				if(lancamentos[x]>maior) {
					cont = 0;
				}
				maior = lancamentos[x];
				cont++;
				
			}
		}
		
		media=soma/lancamentos.length;
		
		System.out.printf("Total dos lan�amentos digitados: %.0f \n", soma);
		System.out.printf("A m�dia � %.2f \n", media);
		System.out.printf("O maior valor � %d \n", maior);
		System.out.printf("O maior valor aparece %d vezes \n", cont);

	}

}


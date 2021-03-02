package ARRAYS;

import java.util.Scanner;

public class Tarefa1 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valores[] = new int[5];
		int maior = 0;
		for (int y=0;y<valores.length;y++) {
			System.out.printf("Digite o valor %d: ",(y+1));
			valores[y]=leia.nextInt();
		}
		for(int y=0;y<valores.length;y++) {
			System.out.println("O valor "+(y+1)+" é "+valores[y]);
			if(valores[y]>maior) {
				maior = valores[y];
			}
		}
		System.out.printf("A maior pontuação é %d", maior);
	}

}

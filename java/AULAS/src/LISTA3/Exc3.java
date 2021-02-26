package LISTA3;

import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade,soma1=0,soma2=0;
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
		
		while(idade!=-99) {
			
			if(idade<=21) {
				soma1 = soma1 +1;
			}
			else if(idade>=50) {
				soma2 = soma2 +1;
			}
			System.out.println("Digite a idade: ");
			idade = ler.nextInt();
		}
		System.out.println("Total de pessoas com menos de 21 anos = "+soma1);
		System.out.println("\nTotal de pessoas com mais de 50 anos = "+soma2);

	}

}

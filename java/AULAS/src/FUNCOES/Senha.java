package FUNCOES;

import java.util.Scanner;

public class Senha {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int senha = 123;
		String nome;
		char opcao = 'S';
		
		
		while(opcao == 'S') {
			System.out.println("Digite o seu nome: ");
			nome = leia.next().toUpperCase();
			System.out.println("Digite a senha");
			senha = leia.nextInt();
			System.out.println("Continua sim ou não: ");
			opcao = leia.next().charAt(0);
			
		}
		System.out.println("fim do programa");
				
	}

}

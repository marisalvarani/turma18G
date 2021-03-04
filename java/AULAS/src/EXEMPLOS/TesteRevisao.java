package EXEMPLOS;

import java.util.Scanner;

import REVISAO.Pessoa;

public class TesteRevisao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //objeto - leia
		String nome;
		int anoNascimento;
		char genero;
		
		System.out.println("Digite o nome do amigo/a: ");
		nome = leia.next();
		Pessoa amigo = new Pessoa(nome); //objeto amigo
		
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		System.out.println("Digite M-masculino, F-feminino ou O-outros: ");
		genero = leia.next().toUpperCase().charAt(0);
		
		Pessoa cliente = new Pessoa(nome, anoNascimento, genero); //instanciar
		
		System.out.println("O nome da amizade é "+amigo.getNome());
		
		System.out.println("O nome do cliente é "+cliente.getNome()+" e seu ano de nascimento é: "+cliente.getAnoNascimento());

		if(cliente.idade(2050)>=18) {
			System.out.println("CLIENTE É ADULTO");
			System.out.println("E a idade é "+cliente.idade(2050));
		}
		else {
			System.out.println("CLIENTE É MENOR DE 18 ANOS!");
			System.out.println("E a idade é "+cliente.idade(2050));
		}
		
		
	}

}

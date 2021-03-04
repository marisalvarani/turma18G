package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Conta conta1 = new Conta(1, "111.111.111-11", true);
		double valor;
		char opcao;
		
		System.out.println("Digite o valor: ");
		valor = leia.nextDouble();
		System.out.println("Debito ou Credito? D/C:");
		opcao = leia.next().toUpperCase().charAt(0);
		if (opcao == 'D') {
			conta1.debito(valor);
		}
		else if (opcao == 'C') {
			conta1.credito(valor);
		}
		else {
			
		}
		
		conta1.credito(100);
		conta1.debito(45.25);
		
		System.out.println(conta1.getSaldo()); 

	}

}

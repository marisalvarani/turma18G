package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Conta conta1 = new Conta(1, "111.111.111-11", true);
		
		conta1.credito(100);
		conta1.debito(45.25);
		
		System.out.println(conta1.getSaldo()); 

	}

}

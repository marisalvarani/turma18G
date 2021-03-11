package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaCorrente;
import CLASSES.ContaEmpresa;
import CLASSES.ContaEspecial;
import CLASSES.ContaEstudantil;
import CLASSES.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		final int QTDMOVIMENTOS = 3;
		double movimentos[] = new double[QTDMOVIMENTOS];
		
		int conta = 0;
		double saldo = 0;

		Conta contaSelecionada = new Conta(conta);
		
		char opcaoConta;
		char opcaoMovimento;
		char opcaoContinuar;

		// MOSTRAR LOGO DO BANCO
		System.out.printf("[BANCO G6 - G6]\n"
				+ "[SLOGAN DO BANCO]\n\n");	
		
		// MOSTRAR MENU INICIAL
		System.out.printf("MENU\n"
				+ "1 - CONTA POUPANÇA\n"
				+ "2 - CONTA CORRENTE\n"
				+ "3 - CONTA ESPECIAL\n"
				+ "4 - CONTA EMPRESA\n"
				+ "5 - CONTA ESTUDANTIL\n"
				+ "6 - SAIR\n\n"
				+ "Informe o tipo de conta: ");
		opcaoConta = ler.next().toUpperCase().charAt(0);
		
		// LER DADOS DA CONTA
		System.out.printf("Informe o número da conta: ");
		conta = ler.nextInt();
		
		String nomeTipo = "\nCONTA ";
		
		// SELECIONAR CONTA ESCOLHIDA
		if (opcaoConta == '1') {
			
			nomeTipo += "POUPANÇA";
			
			contaSelecionada = new ContaPoupanca(conta, 1);
			
		} 
		else if (opcaoConta == '2') {
			
			nomeTipo += "CORRENTE";
			
			contaSelecionada = new ContaCorrente(conta, 1);

		} 
		else if (opcaoConta == '3') {
			
			nomeTipo += "ESPECIAL";
			
			contaSelecionada = new ContaEspecial(conta, 1);
			
		}
		else if (opcaoConta == '4') {
			
			nomeTipo += "EMPRESA";
			
			contaSelecionada = new ContaEmpresa(conta, 1);

		}
		else if (opcaoConta == '5') {
			
			nomeTipo += "ESTUDANTIL";
			
			contaSelecionada = new ContaEstudantil(conta, 1);
			
		}
		else if (opcaoConta == '6') {
			
			nomeTipo = "SAINDO...";
			
		}
		else {
			
			nomeTipo = "ERRO DE DIGITAÇÃO";
			
		}
		
		nomeTipo += "\n\n";
		conta = contaSelecionada.getNumero();
		saldo = contaSelecionada.getSaldo();
		
		System.out.printf(nomeTipo);
		
		// MOSTRAR DADOS DA CONTA
		System.out.printf("Conta: %d\n"
				+ "Saldo atual: R$ %.2f\n\n", conta, saldo);
		
		// MOVIMENTAR CONTA
		for (int cont = 0; cont < movimentos.length; cont++) {
			
			System.out.printf("Informe o tipo de movimento: D-débito ou C-crédito: ");
			opcaoMovimento = ler.next().toUpperCase().charAt(0);
			
			System.out.printf("Informe o valor do movimento: ");
			movimentos[cont] = ler.nextDouble();
			
			System.out.println();
			
			if (opcaoMovimento == 'C') {
				contaSelecionada.credito(movimentos[cont]);
			} 
			else if (opcaoMovimento == 'D') {
				contaSelecionada.debito(movimentos[cont]);
			} 
			else {
				System.out.printf("Opção inválida!");
			}
			
			// MOSTRA
			System.out.printf("Valor do movimento: R$ %.2f\n", movimentos[cont]);
			System.out.printf("Novo Saldo: R$ %.2f\n", contaSelecionada.getSaldo());

			System.out.println();
			
			// PERGUNTAR SE DESEJA CONTINUAR ATÉ ALCANÇAR OS 10 MOVIMENTOS
			// OU SE DESEJA PARAR ANTES
			System.out.printf("Continuar? S/N: ");
			opcaoContinuar = ler.next().toUpperCase().charAt(0);
			System.out.println();
			
			if (opcaoContinuar == 'N') {
				break;
			}

		}
		
	}

}


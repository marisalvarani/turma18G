package DEUPAU;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros {

	public static void main(String[] args) {
		
		//se - if - desvio condicional - switch - fun��es
		//for - while - do while - la�os de repeti��o
		//try - catch
		
		Scanner leia = new Scanner(System.in);
		int numero=0;
		String nomes[] = {"JOAO", "MARIA", "PEDRO"};
		
		try {
			System.out.println("Digite o n�mero da posi��o do vetor [0 - 2]: ");
			numero = leia.nextInt();
			
			System.out.println("O nome escolhido foi: "+nomes[numero]);
		}
		catch(InputMismatchException dados) {
			System.out.println("Voc� digitou uma letra ao inv�s de n�mero!!!");
			dados.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException dados) {
			System.out.println("Voc� colocou um valor diferente de 0,1,2.");
		}
		finally {
			System.out.println("VAI SEMPRE ACONTECER!!!");
		}
		
		System.out.println("Fim de programa!!!");

	}

}

package LISTA2;

import java.util.Scanner;

public class Exc3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
		if(idade>=10 && idade<=14) {
			System.out.println("Infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Juvenil");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("Adulto");
		}
		
	}

}

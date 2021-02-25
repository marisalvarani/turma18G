package SE;

import java.util.Scanner;

public class IdadeNadador {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
		if(idade<5) {
			System.out.println("Desculpe, não podemos atendê-lo!");
		}
		else if(idade>=5 && idade<=7) {
			System.out.println("Infantil A");
		}
		else if(idade>=8 && idade<=11) {
			System.out.println("Infantil B");
		}
		else if(idade>=12 && idade<=13) {
			System.out.println("Juvenil A");
		}
		else if(idade>=14 && idade<=17) {
			System.out.println("Juvenil B");
		}
		else {
			System.out.println("Adultos");
		}
		
		System.out.println("OBRIGADO, VOLTE SEMPRE!");
	}
	

}

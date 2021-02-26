package LISTA3;

import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, cont=1;
		char sexo,humor,opcao='S';
		int pessoaCalma=0,mulherNervosa=0,homemAgressivo=0,outrosCalmo=0,pessoaNervosaMais40=0,pessoaCalmaMenos18=0;
		
		while(opcao == 'S' || cont<=150)
		{
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
		System.out.println("Digite o sexo (1-feminino/2-masculino/3-outros): ");
		sexo = ler.next().charAt(0);
		System.out.println("Digite o nível de humor(1-calma/2-nervosa/3-agressiva): ");
		humor = ler.next().charAt(0);
		
		if(humor =='1') {
			pessoaCalma++;
		}o
		if(humor == '2' && sexo =='1') {
			mulherNervosa++;
		}
		if(sexo == '3' && sexo == '2') {
			homemAgressivo++;
		}
		if(humor == '1' && sexo == '3') {
			outrosCalmo++;
		}
		if(humor == '2'&& idade>=40) {
			pessoaNervosaMais40++;
		}
		if(humor == '1' && idade<18) {
			pessoaCalmaMenos18++;
		}
		
		System.out.println("Continua S-sim ou N-não? ");
		opcao = ler.next().toUpperCase().charAt(0);
		if (opcao != 'S') {
			break;
			
		}
		
		cont = cont + 1;
		}
		System.out.println("Pessoa calma: "+pessoaCalma);
		System.out.println("Mulher nervosa: "+mulherNervosa);
		System.out.println("Homem agressivo: "+homemAgressivo);
		System.out.println("Outros calmo: "+outrosCalmo);
		System.out.println("Pessoas nervosa acima de 40: "+pessoaNervosaMais40);
		System.out.println("Pessoas calmas abaixo de 18: "+pessoaCalmaMenos18);
		System.out.println("Fim da pesquisa!");
	}

}

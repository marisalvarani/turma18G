package ORIENTADO;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class CadFun {

	public static void main(String[] args) {
		/*
		Funcionario colaborador1 = new Funcionario("CARLOS",1,10,15.25);
		Terceiro colaborador2 = new Terceiro("JOANA",45,10,15.25,50);
		
		System.out.println("Salario do "+colaborador1.getNome()+" é R$ "+colaborador1.salario());
		System.out.println("Salario do "+colaborador2.getNome()+" é R$ "+colaborador2.salario());
		*/
		Locale.setDefault(Locale.US);//modo americano - . ponto em tudo
		Scanner leia = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList <>();
		
		System.out.println("Digite a quantidade de funcionários na lista: ");
		int quantidade = leia.nextInt();
		
		for (int x=1; x<=quantidade; x++) {
			System.out.println("Funcionario "+x);
			System.out.println("Nome: ");
			String nome = leia.next();
			System.out.println("Matrícula: ");
			int matricula = leia.nextInt();
			System.out.println("Horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Valor por hora: ");
			double valorPorHora = leia.nextDouble();
			
			System.out.println("1 - Funcionario ou 2 - Terceiro: ");
			char tipo = leia.next().charAt(0);
			
			if(tipo == '2') {
				System.out.println("Valor do adicional R$: ");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(nome,matricula,horasTrabalhadas,valorPorHora,adicional));
												
			} else {
				lista.add(new Funcionario(nome,matricula,horasTrabalhadas,valorPorHora));
			}
			
			System.out.println();
			System.out.println("PAGAMENTO DE SALARIOS: ");
		for(Funcionario fun : lista) {
			System.out.println(fun.getNome()+ " seu salário é R$ "+fun.salario());
			}
			System.out.println("FIM DE PROGRAMA!");
		}
		
		
	
	}
	

}

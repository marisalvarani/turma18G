package ListaPOO;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Cliente C1 = new Cliente();
		C1.nome = leia.next();
		C1.idade = leia.nextInt();
		
		C1.compra();

	}

}

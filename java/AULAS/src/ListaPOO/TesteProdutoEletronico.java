package ListaPOO;

import java.util.Scanner;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ProdutoEletronico P1 = new ProdutoEletronico();
		P1.tipo = "Controle Remoto";
		P1.bateria = "pilha";
		
		P1.liga();
		P1.desliga();
		
	}

}

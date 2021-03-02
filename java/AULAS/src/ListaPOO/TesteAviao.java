package ListaPOO;

import java.util.Scanner;

public class TesteAviao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Aviao A1 = new Aviao();
		A1.modelo = leia.next();
		A1.capacidade = leia.nextInt();
		
		A1.decolar();
		A1.aterrissando();

	}

}

package ORIENTADO;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int b1,b2,b3,h1,h2,h3,a1,a2,a3;
		System.out.println("Digite a base1 = ");
		b1 = leia.nextInt();
		System.out.println("Digite a altura1 = ");
		h1 = leia.nextInt();
		System.out.println("Digite a base2 = ");
		b2 = leia.nextInt();
		System.out.println("Digite a altura2 = ");
		h2 = leia.nextInt();
		System.out.println("Digite a base3 = ");
		b3 = leia.nextInt();
		System.out.println("Digite a altura3 = ");
		h3 = leia.nextInt();
		a1 = b1*h1*h1;
		a2 = b2*h2*h2;
		a3 = b3*h3*h3;
		
		System.out.printf("Tri�ngulo 1: base = %d altura = %d �rea = %d",b1,h1,a1);
		System.out.printf("\nTri�ngulo 2: base = %d altura = %d �rea = %d",b2,h2,a2);
		System.out.printf("\nTri�ngulo 3: base = %d altura = %d �rea = %d",b3,h3,a3);
		if(a1>a2 && a1>a3) {
			System.out.printf("\nTri�ngulo 1 possui a maior �rea = %d",a1);
		}
		else if(a2>a1 && a2>a3) {
			System.out.printf("\nTri�ngulo 2 possui a maior �rea = %d",a2);
		}
		else {
			System.out.printf("\nTri�ngulo 3 possui a maior �rea = %d",a3);
		}

	}

}

package DEUPAU;

import java.io.File;
import java.util.Scanner; 
import java.io.FileNotFoundException;

public class Leiturinha {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\temp\\lista.txt"); //instanciando um arquivo
		Scanner sc = null;
		try {
			sc = new Scanner(arquivo);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException erro) {
			System.out.println("Arquivo não encontrado!!!");
		}
		finally {
			if(sc!=null) {
				sc.close();
			}
		}
		

	}

}

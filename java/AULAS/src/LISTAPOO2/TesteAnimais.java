package LISTAPOO2;

public class TesteAnimais {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("Labrador ",4," correndo","latindo");
		Cavalo cavalo1 = new Cavalo("Cavalo marrom ", 12," cavalgando","relichando");
		Pregui�a preguica1 = new Pregui�a("Bicho-pregui�a ",5," subindo na �rvore","ressonando");
		
		System.out.println(cachorro1.getNome()+" de "+cachorro1.getIdade()+" anos "+cachorro1.getCorrer()+" e"+cachorro1.getSom());
		System.out.println(cavalo1.getNome()+" de "+cavalo1.getIdade()+" anos "+cavalo1.getCorrer()+" e"+cavalo1.getSom());
		System.out.println(preguica1.getNome()+" de "+preguica1.getIdade()+" anos "+preguica1.getSubirArvores()+" e"+preguica1.getSom());		

	}

}

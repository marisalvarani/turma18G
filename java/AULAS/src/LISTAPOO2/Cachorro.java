package LISTAPOO2;

public class Cachorro extends Animal {
	
	

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}


	public void correr() {
		System.out.println("Correndo");
	}

	@Override
	public String som() {
		String som = "latido";
		return som;
	}
	
	

}

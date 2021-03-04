package LISTAPOO2;

public class Cachorro extends Animal {
	
	String correr;
	
	

	public Cachorro(String nome, int idade, String som, String correr) {
		super(nome, idade, som);
		this.correr = correr;
	}



	public String getCorrer() {
		return correr;
	}




	public void setCorrer(String correr) {
		this.correr = correr;
	}




	public void correr() {
		System.out.println("Correndo");
	}

	
	public String som() {
		return som;
	}

	
	

}

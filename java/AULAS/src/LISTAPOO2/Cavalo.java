package LISTAPOO2;

public class Cavalo extends Animal {
		
	
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}




	public void correr() {
		System.out.println("Galopando");
	}
	
	@Override
	public String som() {
		String som = "relincho";
		return som;
	}
	
	
}

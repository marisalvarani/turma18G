package LISTAPOO2;

public class Preguica extends Animal {
	
	


	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}




	public String subirArvores() {
		return "Subindo em �rvores";
	}
	
	
	@Override
	public String som() {
		String som = "ressonando";
		return som;
	}
	
	

}

package LISTAPOO2;

public class Preguiça extends Animal {
	
	String subirArvores;
	
		




	public Preguiça(String nome, int idade, String som, String subirArvores) {
		super(nome, idade, som);
		this.subirArvores = subirArvores;
	}




	public String getSubirArvores() {
		return subirArvores;
	}




	public void setSubirArvores(String subirArvores) {
		this.subirArvores = subirArvores;
	}




	public void subirArvores() {
		System.out.println("Subindo em árvores");
	}
	
	
	public String som() {
		return som;
	}
	
	

}

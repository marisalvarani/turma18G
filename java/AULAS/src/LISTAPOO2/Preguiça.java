package LISTAPOO2;

public class Pregui�a extends Animal {
	
	String subirArvores;
	
		




	public Pregui�a(String nome, int idade, String som, String subirArvores) {
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
		System.out.println("Subindo em �rvores");
	}
	
	
	public String som() {
		return som;
	}
	
	

}

package LISTAPOO2;

public class Main {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("Labrador",4);
		Cavalo cavalo1 = new Cavalo("Horse",12);
		Preguica preguica1 =  new Preguica("Sloth",3);
		
		Animal[] animais = new Animal[3];
		animais[0] = cachorro1;
		animais[1] = cavalo1;
		animais[2] =  preguica1;
		
		for(Animal animal : animais) {
			System.out.println("Nome: "+animal.getNome());
			System.out.println("Idade: "+animal.getIdade());
			System.out.println("Som: "+animal.som());
			
		}
		System.out.println(preguica1.subirArvores());
	}

}

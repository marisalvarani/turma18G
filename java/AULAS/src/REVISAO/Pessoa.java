package REVISAO;

public class Pessoa {
	
	//classe: pessoa [terreno]
	//atributos - segurança [material de construção]
	//construtores -  como a classe abre - criar - pedreiro
		//sobrecarga de construtor [pedreiro]
	//encapsulamento - getters and setters - segurança - [vigia]
	//métodos [vai fazer talvez] [casa ou terreno com acabamento]
		//sobrecarga de métodos
	//herança - a todo momento
	
	//***acabamento***
	//override
	//polimorfismo
	//collections
	//interface
	
	//atributo
	private String nome;
	private int anoNascimento;
	private boolean vivo;
	private char genero;
	
	//construtor - TEM O MESMO NOME DA CLASSE
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	//construtor - sobrecarga
	public Pessoa(String nome, int anoNascimento, char genero) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.genero = genero;
	}
	
	//ENCAPSULAMENTO

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	//METODO
	public int idade() {
		return (2021 - anoNascimento);
	}
	
	//METODO - SOBRECARGA
	public int idade(int anoAtual) {
		return(anoAtual - anoNascimento);
	}
	
	
	
	
	
	
	

}

package CLASSES;

public class Conta {
	
	private int numero;
	private String cpf;
	protected double saldo;
	private boolean ativa;
	
	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}
	
		
	public Conta(int numero) {
		this.numero = numero;
	}


	public Conta(int numero, String cpf, boolean ativa) {
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getSaldo() {
		return saldo;
	}

	
	public boolean isAtiva() {
		return ativa;
	}


	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public void credito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void debito(double valor) {
		if(this.saldo>=valor) {
			this.saldo = this.saldo - valor;
		}
		
		
	}

	
	

}

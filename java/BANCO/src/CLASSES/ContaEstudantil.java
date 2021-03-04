package CLASSES;

public class ContaEstudantil extends Conta {
	
	private double limiteEstudantil;
	
	public ContaEstudantil(int numero, String cpf, double limiteEstudantil) {
		super(numero, cpf);
		this.limiteEstudantil = limiteEstudantil;
	}

	public ContaEstudantil(int numero, double limiteEstudantil) {
		super(numero);
		this.limiteEstudantil = limiteEstudantil;
	}
	
	public ContaEstudantil(int numero, String cpf, boolean ativa, double limiteEstudantil) {
		super(numero, cpf, ativa);
		this.limiteEstudantil = limiteEstudantil;
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	public void debito(double valor) {
		if(this.saldo>=valor) {
			this.saldo = this.saldo - valor;
		}
		
		
	}
	
	public double usarEstudantil() {
		return saldo + 5000;
	}
	

}

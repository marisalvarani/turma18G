package CLASSES;

public class ContaEstudantil extends Conta {
	
	private double limiteEstudantil = 5000;
	
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
		
	public double usarEstudantil(double valor) {
		if(limiteEstudantil>=valor) {
			System.out.println("Empréstimo de R$ "+valor+" aprovado.");
			}
		else {
			System.out.println("Valor excedido");
		}
		return saldo+valor;
		
	}
	

}

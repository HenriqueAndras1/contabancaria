package conta.model;

public class ContaCorrente extends Conta { // extends => herança

	// Atributos / Variaveis
	private float limite;

	/*
	 * Modificadores de Acesso
	 * 
	 * Private - Somente a propria class pode acessar, exemplo celular particular
	 * Protected - Somente arquivos dentro do mesmo pacote, exemplo telefone
	 * residencial public - Qualquer class pode acessar, exemplo orelhao Default -
	 */

	// Método Especial - Método Construtor
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
			super(numero, agencia, tipo, titular,saldo); // Invocando o Método ou super conta
			this.limite = limite; // this => nome da Classe
		}
	 
	/*public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular,saldo);
		this.limite = 5000f;
	}*/
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	/*
	// Polimorfismo de Sobrescrita => add mais lógica a um método já existente
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}*/
		
	public boolean sacar(float valor) {
	if(this.getSaldo()+ this.getLimite() < valor) {
		System.out.println("\n Saldo Insuficiente !");
	return false;
	}
	this.setSaldo(this.getSaldo()- valor);
	return true;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
}

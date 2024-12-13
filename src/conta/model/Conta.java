package conta.model;

// Classe abstrata => Base para criar outras Classes
public abstract class Conta {

	// Atributos / Variaveis
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	/*
	 * Modificadores de Acesso
	 * 
	 * Private - Somente a propria class pode acessar, exemplo celular particular
	 * Protected - Somente arquivos dentro do mesmo pacote, exemplo telefone
	 * residencial public - Qualquer class pode acessar, exemplo orelhao Default -
	 */

	// Método Especial - Método Construtor
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {

		// this => Class Conta
		// igual Conta.numero = atributo

		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	// Comportamentos ou Métodos

	// Métodos de Acesso

	// Get -> Pegar
	public int getNumero() {
		return numero;
	}

	// Set -> Colocar/Setar
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	/*
	 * O Método sacar, do tipo boolean, foi criado contendo o parâmetro float valor,
	 * que receberá o valor a ser sacado da conta. O parâmetro valor é do tipo float
	 * porquê o Atributo saldo é do tipo float.
	 */
	public boolean sacar(float valor) {
		
		if (this.getSaldo() < valor) { // Através do laço condicional if, verifica se o valor do saque é menor do que o saldo disponível na conta
			System.out.println("\n Saldo Insuficiente !");
		return false; // Como se trata de um Método do tipo boolean, é necessário retornar uma resposta true ou false
		}
		this.setSaldo(this.getSaldo() - valor); // Caso a condição anterior seja falsa (o saldo é suficiente), o saque será efetuado
		return true;
	}

	public void depositar(float valor) {
		
		this.setSaldo(this.getSaldo()+ valor);
	}
	
	public void visualizar() {
		
		String tipo = "";
		
		switch (this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
	}
}

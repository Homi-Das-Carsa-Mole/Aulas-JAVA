
public class ContaBancaria {
	//Declaração dos atributos de ContaBancaria
	private int numConta;
	private boolean ativo;
	private double saldo;
	private double limite;
	
	public ContaBancaria(int numConta, boolean ativo, double saldo, double limite) {
		this.numConta = numConta;
		this.ativo = ativo;
		this.saldo = saldo;
		this.limite = limite;
	}

	//Construtor de ContaBancaria:
	public ContaBancaria () {
		
		//Assim que instanciarmos/criarmos um objeto que pertença à classe ContaBancaria, essa nova conta iniciará com o valor de "ativo" 
		//configurado como verdadeiro, pois a conta estará ativa, e com o saldo de R$1.0.
		
		ativo = true;
		saldo =1.0;
	}
	
	//Mesmo método que o anterior, porém agora os parâmetros do método pedem que definamos se a conta está ativa ou não e qual o saldo da conta.
	public ContaBancaria (boolean ativo, double saldo) {
		this.ativo = ativo;
		this.saldo = saldo;
		
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	//Método para sacar dinheiro da conta:
	public boolean sacar(double saque) {//Se o saldo da conta for maior ou igual ao valor do saque, o saque será realizado.
		if (this.saldo >= saque) {
			this.saldo -= saque;
		return true;
			
		} else {//Se o saldo da conta for menor que o valor do saque, o saque não será realizado.
			System.out.println("Não é possível realizar o saque, pois seu saldo insuficiente.");
			return false;
		}
	}
	
	//<------------------ TESTE MAGIC NUMBERS ------------------>
	
	public int sacarMN (double valor) {
		if((this.saldo < valor) && (this.saldo >= limite * -1)) {
			return 101;
		} else if ((this.saldo < valor) && (this.saldo >= limite * -1)) {
			return 102;
		}
		return 100;
	}
	
	public int transferirMN(Cliente cliente, double valor) {
		if((this.saldo < valor) && (this.saldo >= limite * -1)) {
			this.saldo -= valor;
			return 101;
		} else if ((this.saldo < valor) && (this.saldo >= limite * -1)) {
			return 102;
		}
		return 100;
	}
	
	//Método para transferir valores de uma conta para outra:
	public boolean transferir(Cliente cliente, double valor) {
		if (this.saldo >= valor) {
		this.saldo -= valor;
		cliente.getConta().depositar(valor);
		return true;
		} else {
			System.out.println("Não é possível realizar a transferência");
		return false;
		}
	}
	
	//Método que permite sabermos qual o saldo da conta bancária.
	public double saldo () {
		return saldo;
	}
	
	//<------------------ TESTE COM EXCEPTION ------------------>
	
		public void sacarEX (double valor) throws ContaException {
			
			if (this.saldo < valor) {
				
				throw new ContaException("Saldo insuficiente.");
				
			} else if ((this.saldo - valor) < limite* -1) {
				
				throw new ContaException("Limite insuficiente.");
			}
			this.saldo -= valor;
		}
		
		
		public void depositarEX (double valor) {
			
		}
		
	

	//Não teci comentários mais detalhados pois os métodos utilizados se assemelham àqueles que elaboramos no programa de troca de figurinhas.
}
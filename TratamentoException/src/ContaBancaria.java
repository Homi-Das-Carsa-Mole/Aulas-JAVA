
public class ContaBancaria {
	//Declara��o dos atributos de ContaBancaria
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
		
		//Assim que instanciarmos/criarmos um objeto que perten�a � classe ContaBancaria, essa nova conta iniciar� com o valor de "ativo" 
		//configurado como verdadeiro, pois a conta estar� ativa, e com o saldo de R$1.0.
		
		ativo = true;
		saldo =1.0;
	}
	
	//Mesmo m�todo que o anterior, por�m agora os par�metros do m�todo pedem que definamos se a conta est� ativa ou n�o e qual o saldo da conta.
	public ContaBancaria (boolean ativo, double saldo) {
		this.ativo = ativo;
		this.saldo = saldo;
		
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	//M�todo para sacar dinheiro da conta:
	public boolean sacar(double saque) {//Se o saldo da conta for maior ou igual ao valor do saque, o saque ser� realizado.
		if (this.saldo >= saque) {
			this.saldo -= saque;
		return true;
			
		} else {//Se o saldo da conta for menor que o valor do saque, o saque n�o ser� realizado.
			System.out.println("N�o � poss�vel realizar o saque, pois seu saldo insuficiente.");
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
	
	//M�todo para transferir valores de uma conta para outra:
	public boolean transferir(Cliente cliente, double valor) {
		if (this.saldo >= valor) {
		this.saldo -= valor;
		cliente.getConta().depositar(valor);
		return true;
		} else {
			System.out.println("N�o � poss�vel realizar a transfer�ncia");
		return false;
		}
	}
	
	//M�todo que permite sabermos qual o saldo da conta banc�ria.
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
		
	

	//N�o teci coment�rios mais detalhados pois os m�todos utilizados se assemelham �queles que elaboramos no programa de troca de figurinhas.
}
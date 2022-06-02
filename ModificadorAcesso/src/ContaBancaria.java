
public class ContaBancaria {
	//Declaração dos atributos de ContaBancaria
	private int numConta;
	private boolean ativo;
	private double saldo;
	
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
	
	//Método sem retorno que permite uma conta bancária receber um valor e atribuí-lo ao seu saldo.
	public void receber (double valor) {
		saldo += valor ;
	}
	
	//Método que permite sabermos qual o saldo da conta bancária.
	public double saldo () {
		return saldo;
	}
	
	//Método que viabiliza a transferência de um valor de uma conta bancária para outra. Caso o saldo seja insuficiente, a operação não será realizada.
	boolean dar (double valor, ContaBancaria conta) {
		if (this.saldo >= valor) {
		this.saldo -= valor;
		return true;
		} else {
		System.out.println("Não é possível realizar a transação: saldo insuficiente."
		return false;
		}
	}

	//Não teci comentários mais detalhados pois os métodos utilizados se assemelham àqueles que elaboramos no programa de troca de figurinhas.
}

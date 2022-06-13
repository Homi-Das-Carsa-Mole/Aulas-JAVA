
public abstract class ContaBancaria {//Superclasse abstrata da qual "ContaCorrente" e "ContaInvestimento" se estendem, herdando seus atributos e métodos. 
	protected double saldo; //Atributo "saldo" com modificador de acesso "protected", a fim de que somente essa superclasse e suas classes filhas
	//consigam ver este atributo.
	
	//Método que permite depositar um valor, o atribuindo ao saldo da conta:
	public void depositar(double valor) {
		saldo += valor;
	}
	
	//Método para sacar dinheiro da conta:
	public void sacar(double saque) {//Se o saldo da conta for maior ou igual ao valor do saque, o saque será realizado.
		if (this.saldo >= saque) {
			this.saldo -= saque;
			
		} else {//Se o saldo da conta for menor que o valor do saque, o saque não será realizado.
			System.out.println("Não é possível realizar o saque, saldo insuficiente.");
		}
	}
	
	//Método para transferir valores de uma conta para outra:
	public void transferir(ContaBancaria conta, double transferencia) {
		if (this.saldo >= transferencia) {
		this.saldo -= transferencia;
		conta.saldo += transferencia;
		} else {
			System.out.println("Não é possível realizar a transferência");
		}
	}
	
	//Método abstrato, já que cada conta calcula seu saldo seguindo uma fórmula específica:
	public abstract double calcularSaldo();
}


}

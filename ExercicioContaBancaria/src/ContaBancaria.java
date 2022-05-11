
public abstract class ContaBancaria {
	protected static double saldo = 100;
	
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
	
	public void sacar(double saque) {
		this.saldo -= saque;
	}
	
	public void transferir(double transferencia, ContaBancaria conta) {
		conta.saldo += transferencia;
	}
	
	public void calcularSaldo() {
		
	}

}

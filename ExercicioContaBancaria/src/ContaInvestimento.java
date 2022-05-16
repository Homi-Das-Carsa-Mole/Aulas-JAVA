
public class ContaInvestimento extends ContaBancaria {
	private double saldo;
	
	@Override
	public double calcularSaldo() {
		return saldo += (saldo * 0.05);
	}
	
}


public class ContaInvestimento extends ContaBancaria {
	
	@Override
	//Ao calcular o saldo de uma conta do tipo "ContaIvestimento", acrescenta-se ao saldo final 5% do saldo em conta, referente aos rendimentos do
	//dinheiro investido.
	public double calcularSaldo() {
		return saldo += (this.saldo * 0.05);
	}
	
}

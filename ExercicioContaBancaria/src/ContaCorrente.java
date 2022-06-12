

public class ContaCorrente extends ContaBancaria {//Classe que se estende de "ContaBancaria" e herda seus métodos
	
	@Override
	//Ao calcular o saldo de uma conta do tipo "ContaIvestimento", susbtrai-se do saldo final 10% do saldo em conta, referente aos impostos que devem
	//ser pagos.
	public double calcularSaldo() {
		return saldo -= (this.saldo * 0.1); 
	}
}


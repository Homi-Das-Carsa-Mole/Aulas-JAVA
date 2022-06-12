
public class App {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaCorrente();//Instanciando um objeto "conta1", do tipo ContaCorrente.
		ContaBancaria conta2 = new ContaInvestimento();//Instanciando um objeto "conta1", do tipo ContaInvestimento.
		
		//Exibindo o saldo de cada uma das contas instanciadas (aparecerão os endereços dos objetos na tela):
		System.out.println("O saldo da " + conta1 + " é de R$" + conta1.calcularSaldo());
		System.out.println("O saldo da " + conta2 + " é de R$" + conta2.calcularSaldo());
		System.out.println();
		//Ambos são 0 porque foram criadas com valor de "saldo" vazio.
		
		//As duas contas realizam um depósito de R$1000:
		conta1.depositar(1000);
		conta2.depositar(1000);
		
		//Calculando o saldo das duas contas após o depósito:
		System.out.println("O saldo da " + conta1 + " após o DEPÓSITO é de R$" + conta1.calcularSaldo());//Saldo: R$900.0
		System.out.println("O saldo da " + conta2 + " após o DEPÓSITO é de R$" + conta2.calcularSaldo());//Saldo: R$1050.0
		System.out.println();
		
		//Sacando R$100 de ambas as contas:
		conta1.sacar(100);
		conta2.sacar(100);
		
		//Calculando o saldo das duas contas após o saque:
		System.out.println("O saldo da " + conta1 + " após o SAQUE é de R$" + conta1.calcularSaldo()); //Saldo: R$720.0
		System.out.println("O saldo da " + conta2 + " após o SAQUE é de R$" + conta2.calcularSaldo()); //Saldo: R$997.5
		System.out.println();
		
		//"conta1" transfere um valor para a "conta2":
		conta1.transferir(conta2, 100);
		
		//Calculando o saldo das duas contas após a transferência:
		System.out.println("O saldo da " + conta1 + " após a TRANSFERÊNCIA é de R$" + conta1.calcularSaldo());//Saldo: R$558.0
		System.out.println("O saldo da " + conta2 + " após a TRANSFERÊNCIA é de R$" + conta2.calcularSaldo());//Saldo: R$1152.375
		System.out.println();
		
		//"conta2" transfere um valor para a "conta1":
		conta2.transferir(conta1, 50);
		
		//Calculando o saldo das duas contas após a transferência:
		System.out.println("O saldo da " + conta2 + " após a TRANSFERÊNCIA é de R$" + conta2.calcularSaldo());//Saldo: R$1157.49
		System.out.println("O saldo da " + conta1 + " após a TRANSFERÊNCIA é de R$" + conta1.calcularSaldo());//Saldo: R$547.2
		
	}

}


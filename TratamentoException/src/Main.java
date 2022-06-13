
public class Main {

	public static void main(String[] args) {
		
		
	ContaBancaria conta1 = new ContaBancaria(9090, true, 3000, 5000);
	ContaBancaria conta2 = new ContaBancaria(1010, true, 5000, 7000);
	
	//<------------------ TESTE BOOLEANO ------------------>
	
	Cliente cliente1 = new Cliente("Carlão", 2334, conta1);
	Cliente cliente2 = new Cliente("Eustáquio", 3030, conta2);
	
	if(cliente1.getConta().sacar(3001) == true) {
		System.out.println("Saque realizado com sucesso!");
	} else {
		System.out.println("Saque não realizado: saldo insuficiente.");
	}
	System.out.println("Seu saldo atual é de R$" + cliente1.getConta().saldo());

	//<------------------ TESTE MAGIC NUMBERS ------------------>
	
//	switch(cliente1.getConta().sacarMN(100)) {
//		case 100: System.out.println("Saque realizado com sucesso.");
//			break;
//		case 101: System.out.println("Saque realizado com sucesso, porém, você está fazendo uso do seu limite.");
//			break;
//		case 102: System.out.println("Operação não realizada: limite insuficiente.");
//			break;
//	}
	

	//<------------------ TESTE COM EXCEPTION ------------------>
	
	try {
		cliente1.getConta().sacarEX(9000);
	} catch (ContaException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		System.out.println("Não foi possível realizar a operação: " + e.getMessage());
	}
	

	
	
}
}

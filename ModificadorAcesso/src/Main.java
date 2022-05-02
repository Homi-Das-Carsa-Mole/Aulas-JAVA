
public class Main {

	public static void main(String[] args) {
		
//		ContaBancaria conta1 = new ContaBancaria();
	
//			conta1.ativo = true ;
//			
//			conta1.numConta = 222;
//			
//			conta1.saldo = 150.60;
//			
//
//		System.out.println(conta1.ativo);
//			
//		System.out.println(conta1.numConta);
//		
//		System.out.println(conta1.saldo);	
//		
//		conta1.receber(185.70);
//		conta1.dar(50.75);
//		System.out.println(conta1.saldo());
//		
//		ContaBancaria conta2 = new ContaBancaria();
//		System.out.println(conta2.saldo());
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Misael");
		cliente1.setCpf(123456);
		cliente1.setNumConta(654321);
		
//		System.out.println(cliente1.getNome());
//		System.out.println(cliente1.getCpf());
//		System.out.println(cliente1.getNumConta());
		
		System.out.println(cliente1.toString()); //M�todo que mostra todos os dados de cliente.
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Misael");
		cliente2.setCpf(123456);
		cliente2.setNumConta(654321);
		
		//cliente2 = cliente2;
		
		System.out.println(cliente2);
		
		if(cliente1 == cliente2) { //Compara��o de endere�os
			System.out.println("Os objetos s�o iguais.");
		} else {
			System.out.println("Os objetos s�o diferentes.");
		}
		 //Os objetos, apesar de possu�rem atributos id�nticos, s�o diferentes, pois possuem endere�os diferentes na mem�ria heap.
		
		//No entanto, se igualarmos ambos os objetos (cliente2 = cliente1), o cliente2 passar� a apontar para o mesmo endere�o da heap de cliente1. Agora eles s�o iguais.

		if(cliente1.getNome() == cliente2.getNome()) { //Compara��o de atributo espec�fico
			System.out.println("Os nomes s�o iguais.");
		} else {
			System.out.println("Os nomes s�o diferentes.");
		}
		
		if(cliente1.equals(cliente2)) { //Sem sobrescrever, ele comparar� os endere�os
			System.out.println("Os atributos dos objetos s�o iguais.");
		} else {
			System.out.println("Os atributos dos objetos s�o diferentes.");
		}
	
	
	}
}


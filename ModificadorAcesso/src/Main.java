
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
		
		System.out.println(cliente1.toString()); //Aplicação do método "toString" que mostra, com o auxílio de um SYSO, todos os dados da variável "cliente1".
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Misael");
		cliente2.setCpf(123456);
		cliente2.setNumConta(654321);
		
		//cliente2 = cliente2;
		
		System.out.println(cliente2);
		
		if(cliente1 == cliente2) { //Comparação de endereços.
			System.out.println("Os objetos são iguais.");
		} else {
			System.out.println("Os objetos são diferentes.");
		}
		//Os objetos, apesar de possuírem atributos idênticos, são diferentes, pois possuem endereços diferentes na memória heap.
		
		//No entanto, se igualarmos ambos os objetos (cliente2 = cliente1), o cliente2 passará a apontar para o mesmo endereço da heap de cliente1
		//tornando-se iguais.

		if(cliente1.getNome() == cliente2.getNome()) { //Comparação de atributo/conteúdo específico entre as variáveis "cliente1" e "cliente2".
			System.out.println("Os nomes são iguais.");
		} else {
			System.out.println("Os nomes são diferentes.");
		}
		
		if(cliente1.equals(cliente2)) { //Aplicação do método "equals", que foi sobrescrito, a fim de comparar o conteúdo
			//como um todo das variáveis "cliente1" e "cliente2".
			System.out.println("Os atributos dos objetos são iguais.");
		} else {
			System.out.println("Os atributos dos objetos são diferentes.");
		}
	
	
	}
}


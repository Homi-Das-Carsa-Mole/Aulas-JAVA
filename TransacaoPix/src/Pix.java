
public class Pix {
	//Atributos da classe Pix:
	String chaveCpf;
	String chaveEmail;
	String chaveAl;
	String chaveTel;
	
//Método responsável por permitir a transferência de um valor de uma conta para outra:	
public void Transfer(double valor, Cliente clienteDoador, Pix chave, Cliente clienteRecebedor) {
		
		//Se o valor de transferência for menor que o saldo em conta, será impossível realizar a operação
		//e uma mensagem informando tal incapacidade será emitida.
		if (clienteDoador.saldo < valor) {
			System.out.println("Não foi possível realizar a transferência. Saldo insuficiente.");
		} else { //Caso contrário:
			clienteDoador.saldo -= valor; //Valor transferido é subtraído do saldo da conta de quem o transferiu.
			clienteRecebedor.saldo += valor;//Valor transferido é atribuído ao saldo da conta de quem o recebeu.
			//Os comandos abaixo exibem na tela quem transferiu para quem, qual foi a quantia e qual o saldo
			//atualizado de ambas as contas (de quem enviou e de quem recebeu).
			System.out.println("Transferência realizada com sucesso! " + clienteDoador.nome + " transferiu R$" + valor + " para " + clienteRecebedor.nome + ".\n");
			System.out.println("O saldo atual de " + clienteDoador.nome + " é de R$" + clienteDoador.saldo);
			System.out.println("O saldo atual de " + clienteRecebedor.nome + " é de R$" + clienteRecebedor.saldo + "\n");	
		}
		
	}
	
}


public class App {

	public static void main(String[] args) {
		
		//Instanciando objetos da classe "Cliente" e da classe "Pix":
		Cliente cliente1 = new Cliente(); //Quando digitamos "Cliente cliente1", criamos apenas uma *variável* 
		//"cliente1" do tipo "Cliente". Essa variável só passa a ser um objeto a partir do momento que chamamos,
		//através do operador "new", o método construtor da classe (nesse caso, "Cliente()"), inicializando
		//o objeto.
		//O método construtor de objetos de uma determinada classe sempre carregará o nome dessa classe.
		Pix cliente1Pix = new Pix();
		
		//Atribuindo valores às variáveis de "cliente1":
		cliente1.nome = "Misael";
		cliente1.conta = "01010/1010-10";
		cliente1.saldo = 5324.20;
		
		//Atribuindo valores às variáveis de "cliente1Pix":
		cliente1Pix.chaveCpf = "909.111.232-10";
		cliente1Pix.chaveEmail = "emeiudomisa@blablabla.com";
		cliente1Pix.chaveAl = "olocobixobrincadeirakkkkkkk";
		cliente1Pix.chaveTel = "(11)4002-8922";
		
		Cliente cliente2 = new Cliente();
		Pix cliente2Pix = new Pix();
		cliente2.nome = "Eleven";
		cliente2.conta = "00011/0011-11";
		cliente2.saldo = 1111.11;
		cliente2Pix.chaveCpf = "011.011.011-11";
		cliente2Pix.chaveEmail = "youdontmessaroundwithjim@jim.com";
		cliente2Pix.chaveAl = "elevenonze11";
		cliente2Pix.chaveTel = "(11)1111-1111";
		
		//Utilizando o método de transferência (Transfer) para enviar um valor de um cliente para outro:
		cliente1Pix.Transfer(300.00, cliente1, cliente2Pix, cliente2);
		

	}

}

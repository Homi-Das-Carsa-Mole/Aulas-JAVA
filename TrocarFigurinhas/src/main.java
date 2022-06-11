
public class main {

	public static void main(String[] args) {
		
		//Criando uma variável do tipo Pessoa que recebe o nome "pessoa1" e a instanciando como um objeto.
		Pessoa pessoa1 = new Pessoa();
		
		//Setando o nome e a quantidade de figurinhas de pessoa1:
		pessoa1.nome = "Lorena";
		pessoa1.NumFigurinhas = 1;
		
		//Aplicando o método receber. Abaixo, fazemos com que pessoa1 receba 3 figurinhas.
		pessoa1.receber(3);

		//Exibindo as informações de pessoa1:
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.NumFigurinhas);
		
		//Instanciando um novo objeto da classe Pessoa, que se chamará "pessoa2":
		Pessoa pessoa2 = new Pessoa();
		
		//Definindo o nome e a quantidade de figurinhas de pessoa2:
		pessoa2.nome = "Misael";
		pessoa2.NumFigurinhas = 3;
		
		//Exibindo a nome e a quantidade de figurinhas de pessoa2 através de um SYSO:
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.NumFigurinhas);
		
		//Atribuindo à variável "boolean retorno" o valor do retorno que o método "dar" terá, que pode ser true ou false. 
		boolean retorno = pessoa1.dar(5, pessoa2);
		
		
		if(retorno == true) { //Se o valor de retorno que o método "dar" atribuir à variável "retorno" for true, ou seja, se a operação de transferência de
			//figurinhas for realizada com sucesso, então o código abaixo será executado, exibindo a quantidade atualizada de figurinhas tanto de quem
			//deu quanto de quem recebeu.  

			System.out.println("Quantidade atual de figurinhas:");
	
			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.NumFigurinhas);
	
			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.NumFigurinhas);
	
		}

	}

}

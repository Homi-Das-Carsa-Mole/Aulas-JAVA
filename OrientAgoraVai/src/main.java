
public class main {

	public static void main(String[] args) {
		
		//Instanciando/Criando uma variável que recebe o nome "pessoa1" e que é do tipo/da classe Pessoa:
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
		
		
		boolean retorno = pessoa1.dar(5, pessoa2);
		
		if(retorno == true) {

			System.out.println("Quantidade atual de figurinhas:");
	
			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.NumFigurinhas);
	
			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.NumFigurinhas);
	
		}

	}

}

public class Pessoa {
	//Declaração de variáveis:
	String nome; //Variável "nome" que armazena dados do tipo "String", ou seja, texto.
	int NumFigurinhas; //Variável "NumFigurinhas" que armazena dados do tipo "int", ou seja, números inteiros. 
	
	//Método que permite um objeto do tipo Pessoa receber uma figurinha
	void receber(int NumFigurinhas) { //Este é um método do tipo "void". Isso significa que quando ele for executado, não devolverá nenhum valor como retorno.
		this.NumFigurinhas += NumFigurinhas; //O "this" serve para dizer que estamos nos referenciando à variável NumFigurinhas de Pessoa,
		//e não à variável NumFigurinhas que é dada como parâmetro do método "receber".

		//Por usar "+=" estamos somando o valor de NumFigurinhas que será dado com o valor de figurinhas que a pessoa já tem 
		//e o atribuindo à variável NumFigurinhas de um objeto do tipo Pessoa.
	}
	
	//Método que permite dar uma quantidade de figurinhas para uma pessoa.
	boolean dar(int NumFigurinhas, Pessoa pessoa) { //Para que seja possível dar figurinhas, precisamos saber a quantidade de figurinhas que queremos dar
		//e também para quem queremos dar. Por isso, temos o método "dar" tendo "int NumFigurinhas" e "Pessoa pessoa" (um variável "pessoa" do tipo Pessoa) 
		//como seus parâmetros, pois ele depende dessas informações para cumprir sua funcionalidade.
		
		//boolean retorno;

		if (this.NumFigurinhas < NumFigurinhas) { //Determinamos que se o número de figurinhas que uma pessoa tem é menor que a quantidade que ela deseja
			//dar, será exibida uma mensagem dizendo que não é possível dar as figurinhas. Daí, o retorno do método passa a ser "false".
			System.out.println("Não é possível dar; número de figurinhas insuficiente.");
			//retorno = false;
			return false;
		}
		else {
			//Caso o número de figurinhas seja suficiente, substrai-se a quantidade de figurinhas que a pessoa tem pelo número de figurinhas 
			//que ela deseja dar. 
			
			this.NumFigurinhas -= NumFigurinhas;
			pessoa.receber(NumFigurinhas);
			//retorno = true;
			return true;
		}

	}
}

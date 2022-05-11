
public class App {

	public static void main(String[] args) {
		
		//Item item = new Intel(); //N�o � poss�vel criar uma inst�ncia de uma classe abstrata. Item, por exemplo, � algo muito gen�rico, abstrata, n�o � um objeto propriamente dito
		
		Item item = new Cogumelo();
		item.pegar(); //N�o se repete "Item" no in�cio dessa linha, pois a var�avel desse tipo j� foi criando. Sendo assim, n�o � necess�rio explicitar que essa var�avel � do tipo "Item" novamente.
		
		item = new Diamante(); //Uma das vantagens de utilizar uma classe abstrata � a possibilidade de usar do polimorfismo. Aqui, uma mesma vari�vel est� se comportando de forma diferente
		item.pegar();
		
		item = new Moeda();
		item.pegar();

	}

}

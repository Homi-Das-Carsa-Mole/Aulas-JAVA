
public class App {

	public static void main(String[] args) {
		
		//Item item = new Intel(); //Não é possível criar uma instância de uma classe abstrata. Item, por exemplo, é algo muito genérico, abstrata, não é um objeto propriamente dito
		
		Item item = new Cogumelo();
		item.pegar(); //Não se repete "Item" no início dessa linha, pois a varíavel desse tipo já foi criando. Sendo assim, não é necessário explicitar que essa varíavel é do tipo "Item" novamente.
		
		item = new Diamante(); //Uma das vantagens de utilizar uma classe abstrata é a possibilidade de usar do polimorfismo. Aqui, uma mesma variável está se comportando de forma diferente
		item.pegar();
		
		item = new Moeda();
		item.pegar();

	}

}

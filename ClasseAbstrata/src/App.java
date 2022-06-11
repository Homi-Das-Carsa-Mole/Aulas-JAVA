
public class App {

	public static void main(String[] args) {
		
		//Item item = new Intel(); //Não é possível criar uma instância de uma classe abstrata. 
		//"Item" é algo muito genérico, abstrato, não é um objeto propriamente dito.
		
		Item item = new Cogumelo();
		item.pegar(); //Não se repete "Item" no início dessa linha, pois a variável desse tipo já foi criada. Sendo assim, não é necessário
		//explicitar que essa variável é do tipo "Item" novamente.
		
		item = new Diamante(); 
		item.pegar(); //Uma das vantagens de utilizar uma classe abstrata é a possibilidade de usar do polimorfismo. Notamos que um mesmo método está se
		//comportando de forma diferente de acordo com o tipo de objeto que o utiliza.
		
		item = new Moeda();
		item.pegar();

	}

}

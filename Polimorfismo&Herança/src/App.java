
public class App {

	public static void main(String[] args) {
		
		//Criando uma variável chamada "animal", que é do tipo/da classe "Animal", e a instanciando por meio do operador "new", que invocará 
		//o construtor da classe "Cachorro", criando um objeto do tipo Cachorro:
		Animal animal = new Cachorro();
		animal.Falar(); //O método "Falar", nesse caso, por conta do objeto "animal" ser uma instância de "Cachorro" neste momento, resultará em "Au-Au".
		
		//Fazendo com que "animal" mude de instância, deixando de ser um objeto do tipo Cachorro e passando a ser uma instância da classe Gato:
		animal = new Gato();
		animal.Falar(); //Agora "animal", por ser uma instância de Gato, faz "Miau!".

		//Acima, o polimorfismo se faz presente, já que um mesmo método se comporta de diferentes maneiras dependendo da instância, ou da classe, 
		//do objeto que o aciona.
		
		Gato gatinho = new Gato();
		Cachorro beagle = new Cachorro();
	
		falar(gatinho); //"gatinho" é um objeto do tipo Gato, logo, o resultado da fala será "Miau!"
		falar(beagle); //Já "beagle" é do tipo Cachorro, então sua fala será "Au-Au!"
		
		//O polimorfismo também se manifesta neste último caso, haja vista que um mesmo método se comporta de formas diferentes dependendo da 
		//instância da variável inserida em seu parâmetro.
		
	}

	/* 
	Métodos estáticos não precisam de que uma instância seja criada para que possam ser chamados.
	O método abaixo permite que variáveis do tipo "Animal" executem o método "Falar".
	Não haverá nenhum problema em inserir uma variável do tipo Cachorro ou Gato no parâmetro abaixo,
	já que tanto Cachorro quanto Gato são classes que se estendem de Animal, isto é, são classes filhas da classe Animal)
	 */
	
	public static void falar(Animal a) {//Método estático e genérico que, quando chamado, faz com que toda instância da classe Animal e, por extensão,
		//das classes Cachorro e Gato, executem o método "Falar" uma vez.
		a.Falar(); //Método "Falar", advindo da superclasse "Animal", é chamado. Esse método se comportará de acordo com a instância da variável "a".
	
		
		if(a instanceof Cachorro) { //Se a variável "a" inserida no parâmetro do método "falar" for uma instância de Cachorro, é feito um casting
			//explícito atribuindo a variável "a", do tipo Animal, à variável "c", do tipo Cachorro. Assim, quando acionarmos o método "falar" com
			//uma variável do tipo Cachorro dentro de seu parâmetro, o cachorro não só falará, como também morderá e, logo em seguida, falará novamente. (isso é opcional)
			Cachorro c = (Cachorro) a;
			c.Morder();
			c.Falar();
		
		}
	}
	
}

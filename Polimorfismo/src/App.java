
public class App {

	public static void main(String[] args) {
		
		//Criando/Instanciando um animal que será do tipo Cachorro:
		Animal animal = new Cachorro();
		animal.Falar(); //O método falar, nesse caso, por ser da instância de cachorro, resultará em "Au-Au".
		
		//Fazendo com que a variável "animal" mude de Cachorro para Gato:
		animal = new Gato();
		animal.Falar(); //Agora o animal, por ser uma instância de Gato, faz "Miau!"

		//Acima, o polimorfismo se faz presente, já que uma mesma variável se comporta de maneiras diferentes dependendo de sua instância.
		
		Gato gatinho = new Gato();
		Cachorro beagle = new Cachorro();
	
		falar(gatinho); //A variável "gatinho" é do tipo Gato, logo, o resultado da fala será "Miau!"
		falar(beagle); //Já "beagle" é do tipo Cachorro, então sua fala será "Au-Au!"
		
		//O polimorfismo também se manifesta neste último caso, haja vista que um mesmo método se comporta de formas diferentes dependendo da 
		//instância da variável inserida em seu parâmetro.
		
		
		
	}

	/* 
	Métodos estáticos não precisam de que uma instância seja criada para que possam ser acessados.
	O método abaixo permite que variáveis do tipo Animal executem o método "Falar".
	Não haverá nenhum problema em inserir uma variável do tipo Cachorro ou Gato no parâmetro abaixo,
	já que tanto Cachorro quanto Gato são classes que se estendem de Animal (em outras palavras, elas são classes filhas da classe Animal)
	 */
	
	public static void falar(Animal a) {
		a.Falar();
		
		if(a instanceof Cachorro) { //Se a variável "a" for uma instância de Cachorro, é feito um Casting
			//para que o tipo da variável que será colocada dentro do parâmetro desse método passe a ser Cachorro,
			//a fim de que seja possível usar o método "Morder", que é específico da classe Cachorro.
			Cachorro c = (Cachorro) a;
			c.Morder(); //Quando acionarmos o método "falar" com uma variável do tipo Cachorro dentro de seu parâmetro,
			//o cachorro não só falará como também morderá logo em seguida (isso é opcional).
		}
	}
	
}

// Por conta da herança genética, herdamos características físicas e até mesmo comportamentais de nossos pais, e isso contribui em boa parte do processo de formação
//da pessoa que somos. Em POO, o mesmo conceito de herança pode ser aplicado. As classes que criamos podem tornar-se pais de outras classes, agora classes filhas, e estender
//a elas suas características (atributos) e comportamentos (métodos).


public class Animal { //A classe "Animal" é uma classe pai, ou superclasse, pois dela se estenderão todas as outras classes de animais, como "Cachorro" e "Gato".
	//As classes Cachorro e Gato classificam-se como classes filhas, ou subclasses, de "Animal", isso pelo fato de que todo cachorro e todo gato são animais. 
	//Dessa maneira, toda instância do tipo Cachorro e Gato herdará os atributos e os métodos genéricos de sua classe pai, no caso, a classe "Animal". Assim,
	//temos a representação de um dos pilares fundamentais de POO: a Herança.
	
	//Atributos e métodos genéricos são, respectivamente, características e comportamentos definidos numa superclasse que serão comuns a todas as classes filhas.
	//Nesse caso, todo animal tem a capacidade de falar. Logo, "falar" pode ser um método genérico da classe "Animal. Ainda, todo animal pertence a uma determinada
	//espécie. Espécie, portanto, também pode ser um atributo genérico da classe "Animal".
	//Obviamente, a forma como um animal se comunica dependerá de sua espécie. Cachorros e gatos, por exemplo, não produzem o mesmo tipo de "fala"; um diz "au-au" e 
	//outro "miau". Apesar dessa diferença, nada muda o fato de que ambos estão falando algo; esse é um comportamento, ou ação, comum entre os dois.

	
	public void Falar() {
		System.out.println("");
	}
	
	//Foi feito um Override no método acima em cada classe que se estende da superclasse Animal para individualizar/especificar a fala de cada animal.
}

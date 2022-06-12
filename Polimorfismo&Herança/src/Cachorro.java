
public class Cachorro extends Animal {//Dizemos que uma classe herda os atributos e métodos de outra por meio da palavra "extends". Por fazer uso de "extends", afirmamos, nesse
	//caso, que a classe "Cachorro" se estende da classe "Animal", logo, "Cachorro" torna-se uma classe filha da classe "Animal", agora classificada como "superclasse" ou
	//"classe pai".

	@Override 
	public void Falar() {
		System.out.println("Au-Au!");
	}
	
	public void Morder() {
		System.out.println("Nhac!");
	}

	
	
}


public class Main {

	public static void main(String[] args) {
		
		// Polimorfismo: diversas formas. Um mesmo objeto pode se comportar de diversas formas dependendo de sua instância. 
		// Instância:
		
		Animal animal = new Cachorro();
		
		animal.Falar();
		
		animal = new Gato();
		animal.Falar();

	}

}

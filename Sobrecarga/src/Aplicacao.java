
public class Aplicacao {

	public static void main(String[] args) {
		
		Matematica matematica = new Matematica();
		
		int soma = matematica.somar(3, 4);
		System.out.println("O resultado da soma �: " + soma + ".");
				
		soma = matematica.somar(3, 4, 5);
		System.out.println("O resultado da soma �: " + soma + ".");
		
		double soma2 = matematica.somar(3.5, 4);
		System.out.println("O resultado da soma �");

	}

}

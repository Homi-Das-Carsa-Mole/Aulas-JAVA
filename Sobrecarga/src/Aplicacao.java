
public class Aplicacao {

	public static void main(String[] args) {
		
		//Criação de um objeto da classe Matemática.
		Matematica matematica = new Matematica();
		
		//Abaixo, um mesmo método (no caso, o "somar") se desempenha de diferentes formas:
		int soma = matematica.somar(3, 4); //Criação da varíavel "soma", onde se guardará o valor da soma de dois valores
		//inteiros que realizarmos.
		System.out.println("O resultado da soma é: " + soma + ".");
				
		soma = matematica.somar(3, 4, 5); //Aqui, a varíavel "soma" guardará o valor da soma de três valores inteiros,
		//soma essa feita pelo mesmo método "somar"
		System.out.println("O resultado da soma é: " + soma + ".");
		
		double soma2 = matematica.somar(3.5, 4); //Visto que o método "somar" agora trabalha valor em double, foi necessário
		//criar uma nova variável do tipo double para guardar o valor da soma.
		System.out.println("O resultado da soma é " + soma2 + ".");

	}

}

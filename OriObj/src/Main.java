
public class Main {

	public static void main(String[] args) {
				
				Pessoa pessoa1 = new Pessoa(); //Criando a variável e instanciando o Objeto pessoa1
				
				pessoa1.nome = "Misael";
				pessoa1.numFigurinhas = 1;
				
				pessoa1.receber(3);
				
				System.out.println(pessoa1.nome);
				System.out.println(pessoa1.numFigurinhas);
	}

}

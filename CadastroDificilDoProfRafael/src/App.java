import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		List <Pessoa> listaDePessoas = new ArrayList <Pessoa>();
		
		Pessoa pessoa = new Pessoa();
		
		Scanner entrada = new Scanner(System.in);
		
		for (int x = 0; x < 5; x++) {
			System.out.println("Digite o seu nome: ");
			pessoa.nome  = entrada.next();
			
			System.out.println("Digite a sua idade");
			pessoa.idade = entrada.nextInt();
			
			System.out.println("Digite o nome da rua onde você mora:");
			pessoa.endereco.rua = entrada.next();
			
			System.out.println("Digite o número da sua residência:");
			pessoa.endereco.num = entrada.nextInt();
			
			System.out.println("Digite o nome do seu bairro:");
			pessoa.endereco.bairro = entrada.next();
			
			listaDePessoas.add(pessoa);
		}
		
		for(Pessoa p : listaDePessoas) {
			System.out.println(pessoa);
		}

	}

}

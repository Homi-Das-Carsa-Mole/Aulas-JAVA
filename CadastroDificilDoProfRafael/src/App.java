import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {

		List <Pessoa> listaDePessoas = new ArrayList <Pessoa>();
		
		Scanner entrada = new Scanner(System.in);
		
		for (int x = 0; x < 2; x++) {
			
			Pessoa pessoa = new Pessoa();
			pessoa.setEndereco(new Endereco());
			
			System.out.println("Digite o seu nome: ");
			pessoa.setNome(entrada.next());
			
			System.out.println("Digite a sua idade: ");
			pessoa.setIdade(entrada.nextInt());
			
			System.out.println("Digite seu sexo: \nDigite 1 para MASCULINO \nDigite 2 para FEMININO");
			
			x = entrada.nextInt();
			
			if(x == 1) {
				pessoa.setSexo(Sexo.MASCULINO);
			} if (x == 2) {
				pessoa.setSexo(Sexo.FEMININO);
			} else {
				System.out.println("Valor inválido");
			}
			
			System.out.println("Digite o nome da rua onde você mora:");
			pessoa.getEndereco().setRua(entrada.next());;
			
			System.out.println("Digite o número da sua residência:");
			pessoa.getEndereco().setNum(entrada.nextInt());
			
			System.out.println("Digite o nome do seu bairro:");
			pessoa.getEndereco().setBairro(entrada.next());
			
			listaDePessoas.add(pessoa);
			
		}
		
		for(Pessoa p : listaDePessoas) {
			System.out.print("");
			System.out.println(p);
			
		}
		
		
		//Buffer: memória temporária que recebe informações que ficam em espera para depois serem processadas.
		//Buffered é uma interface
		

	}

}

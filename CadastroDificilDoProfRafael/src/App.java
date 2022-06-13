import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//Criação de listas que guardarão objetos do tipo "Pessoa", juntamente com seus dados (uma para escrita desses dados e outra para leitura destes):
		List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
		List<Pessoa> listaDePessoas2 = new ArrayList<Pessoa>();

		Scanner entrada = new Scanner(System.in);

		for (int x = 0; x < 4; x++) {//Laço de reptição "for", viabilizando o cadastro de 5 pessoas, neste caso.
			//A cada loop, o objeto "pessoa" é instanciado novamente, porém, os dados personalizados de cada instância não são perdidos, já que, antes de
			//finalizar o loop, adicionamos o objeto "pessoa" para "listaDePessoas", que atua como um simples banco de dados.

			Pessoa pessoa = new Pessoa();
			pessoa.setEndereco(new Endereco());
			
			//Usuário insere seus dados cadastrais:
			System.out.println("Digite o seu nome: ");
			pessoa.setNome(entrada.next());

			System.out.println("Digite a sua idade: ");
			pessoa.setIdade(entrada.nextInt());

			System.out.println("Digite seu sexo: \nDigite 1 para MASCULINO \nDigite 2 para FEMININO");

			int option = 0;
			while (option != 1 && option != 2) {
				option = entrada.nextInt();
				if (option == 1) {
					pessoa.setSexo(Sexo.MASCULINO);
				} else if (option == 2) {
					pessoa.setSexo(Sexo.FEMININO);
				} else {
					System.out.println("Valor inválido");
					System.out.println("Digite seu sexo: \nDigite 1 para MASCULINO \nDigite 2 para FEMININO");
				}

			}

			System.out.println("Digite o nome da rua onde você mora:");
			pessoa.getEndereco().setRua(entrada.next());

			System.out.println("Digite o número da sua residência:");
			pessoa.getEndereco().setNum(entrada.nextInt());

			System.out.println("Digite o nome do seu bairro:");
			pessoa.getEndereco().setBairro(entrada.next());

			listaDePessoas.add(pessoa);

		}
		
		//Enhanced-For que exibe os cadastros que "listaDePessoas" armazenou:
		for (Pessoa p : listaDePessoas) {
			System.out.println("Cadastros:");
			System.out.println(p);
			System.out.println("");

		}
		
		//Escrevendo a lista em um arquivo "lista.txt"
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("lista.txt"))) {

			for (Pessoa p : listaDePessoas) {
				escrever.write(p.toString());
			}

		}
		
		//Lendo o arquivo de texto "lista.txt" e remontando, por assim dizer, os objetos da classe "Pessoa" e os adicionando à "listaDePessoas2", que agora irá conter
		//todos os cadastros lidos em "lista.txt". 
		try (BufferedReader reader = new BufferedReader(new FileReader("lista.txt"))) {
			String linha;

			while ((linha = reader.readLine()) != null) {

				Pessoa pessoa = new Pessoa(linha);
				listaDePessoas2.add(pessoa);

			}

		}
		
		//Mostrando na tela os cadastros lidos:
		for (Pessoa pessoa : listaDePessoas2) {
			System.out.println("Cadastros lidos do TXT:");
			System.out.println(pessoa);

		}

		// Buffer: memoria temporaria que recebe informacoes que ficam em espera para
		// depois serem processadas.
		// Buffered e uma interface

	}
	
	

}

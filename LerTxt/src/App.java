import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//Buffered: classe responsavel por escrever algo numa memoria temporaria
		
		//Criamos um arquivo de texto, o qual chamamos de "entrada.txt", e inserimos nele um texto aleatório para exemplificar o uso dessas duas classes
		//responsáveis por ler arquivos: BufferedReader e FileReader.
		
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {//Criação de um objeto do tipo BufferedReader chamado "reader". Ele poderá
			//chamar os métodos dessa classe Java a fim de, por exemplo, ler as linhas do arquivo de texto que solicitarmos.
			String line; //Criação da variável "line", que guardará as linhas do arquivo de texto.
			String string = "";//Criação da variável "string", 
			
			while ((line = reader.readLine())!= null) {
				string += line + "\n";
			}
//			System.out.println(string);
		}
		
//		Sabonete sabonete1 = new Sabonete("Cheiroso", "Verde");
//		String s = sabonete1.toString();
		
		//Variável "teste" que recebe dados do tipo String, armazenando uma linha de texto sobre um sabonete que tem cheiro de melancia e cor verde.
		String teste = "Sabonete: cheiro=Melancia, cor=Verde";
		
		Sabonete sabonete2 = new Sabonete(teste);//Fornecemos ao objeto "sabonete2" os dados de atributos (cheiro e cor) que isolamos da variável "teste". 
		
		System.out.println(sabonete2);//Esse SYSO exibe que "sabonete2" detém as características que fizemos a variável "teste" armazenar.
		
	}

}

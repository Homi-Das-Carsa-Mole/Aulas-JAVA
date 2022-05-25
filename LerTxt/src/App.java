import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//Buffered: classe responsavel por escrever algo numa memoria temporaria
		
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
			String line;
			String string = "";
			
			while ((line = reader.readLine())!= null) {
				string += line + "\n";
			}
//			System.out.println(string);
		}
		
//		Sabonete sabonete1 = new Sabonete("Cheiroso", "Verde");
//		String s = sabonete1.toString();
		
		String teste = "Sabonete: cheiro=Azedo, cor=Verde";
		
		Sabonete sabonete2 = new Sabonete(teste);
		
		System.out.println(sabonete2);
		
	}

}

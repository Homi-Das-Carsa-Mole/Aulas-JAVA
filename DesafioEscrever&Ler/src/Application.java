import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		System.out.println("Digite um texto qualquer");
		
		Scanner entrada = new Scanner (System.in); 
		String textoEntrada = entrada.next();
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))){
			escrever.write(textoEntrada);
			
		}

		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
			String line;
			String textoSaida = "";
			while ((line = reader.readLine()) != null) {
				textoSaida += line + "\n";
			}
			
			System.out.println(textoSaida);
			
		}
		
		

	}

}

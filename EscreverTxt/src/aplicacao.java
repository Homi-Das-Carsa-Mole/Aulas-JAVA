import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class aplicacao {

	public static void main(String[] args) throws IOException {
		
		String s = "teeeeeeeeeeeeeeeeeeiiiiiiiiii-koooooooooooooooooooooooon-miiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii, tei-kon-mi";
		
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
		//Variavel do tipo BufferedWriter
				
		escrever.write(s);
		
		}
		
	}

}

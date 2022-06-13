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
		String textoEntrada = entrada.next();//Atribuindo à variável "textoEntrada" um texto qualquer inserido pelo usuário no console. 
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))){
			escrever.write(textoEntrada);//Escrevendo no arquivo de texto "entrada.txt" o conteúdo armazenado em "textoEntrada". 
		}

		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
			String line; //Variável "line", que irá comportar tudo que for lido nas linhas de texto do arquivo "entrada.txt".
			String textoSaida = "";//Variável que receberá de "line"
			while ((line = reader.readLine()) != null) {//Enquanto a variável "line" receber atribuições de conteúdos lidos no arquivo de texto - os quais são 
			//detectados por "reader.readLine()" (leitor de linhas do arquivo de texto) - diferentes de "null", isto é, de vazio/nada, todas as linhas de conteúdo
			//do arquivo "entrada.txt" que a variável "line" abrigar será somado e atribuído à "textoSaida", acrescido de uma quebra de linha, para que possa
			//armazenar as diferentes linhas de conteúdo uma abaixo da outra.
				textoSaida += line + "\n";
			}
			
			System.out.println(textoSaida);
			
		}
		
		

	}

}

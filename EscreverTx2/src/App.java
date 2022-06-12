
//Importando utilidades do pacote Java e de categoria Input/Output - entrada e saída de dados - como o "java.io.BufferedWriter", "java.io.FileWriter"
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) throws IOException {//
		
		//Instanciando três objetos da classe "Sabonete", representados por "s1", "s2" e "s3":
		Sabonete s1 = new Sabonete();
		Sabonete s2 = new Sabonete();
		Sabonete s3 = new Sabonete();
		
		//Usando o método "set" para delinear o valor das variáveis "cheiro" e "cor" de cada um dos sabonetes:  
		s1.setCheiro("Orquídea");
		s1.setCor("Roxo");

		s2.setCheiro("Limão");
		s2.setCor("Verde");
		
		s3.setCheiro("Barbie Kill");
		s3.setCor("vermeio??????????");
		
		//Instanciando uma lista que armazenará apenas objetos da classe "Sabonete":
		List <Sabonete> listaDeSabonetes = new ArrayList<Sabonete>();
		
		//Adicionando cada sabonete para "listaDeSabonetes":
		listaDeSabonetes.add(s1);
		listaDeSabonetes.add(s2);
		listaDeSabonetes.add(s3);
		
		//ESCREVENDO UM ARQUIVO .TXT:
		
		//Por ser uma ação classificada como "perigosa", utilizamos o método "try" para realizar uma *tentativa* segura de executar o método abaixo e tentar isolar
		//qualquer erro que essa ação possa gerar. Caso aconteça algum tipo de falha, uma exceção, algo que corrompa o fluxo lógico do programa, através do "throws
		//IOException": "Lançar Exceção de Input(Entrada)/Output(Saída)". Essa exceção é *lançada* para ser tratada pelo método que a gerou, não sendo necessário
		//que o usuário precise intervir de forma imediata ou tentar solucionar a exceção gerada. É como se o usuário dissesse: "não quero cuidar desse problema
		//agora, seu método problemático, cuida você." (Desculpe se o exemplo e/ou a explicação ficaram terríveis, professor. Fiz meu melhor para lembrar do que
		//você ensinou a respeito em sala de aula e para buscar compreender o que o povo tentava explicar nos blogs e fóruns kkkkkkkkkk)
		
		
		//FileWriter e BufferedWriter são classes do Java que se encarregam de *escrever* em arquivos de texto.
		//FileWriter escreve diretamente no arquivo.
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("sabonetes.txt"))){//Criação de um objeto do tipo "BufferedWriter", que se chamará "escrever".
		//BufferedWriter, em seu método construtor, invoca o construtor de "FileWriter" que leva como argumento de seu parâmetro um objeto do tipo arquivo.
			//For-each para encontrar em "listaDeSabonetes" objetos do tipo "Sabonete", armazenando eles, a cada iteração, na variável "sabs". 
			for(Sabonete sabs : listaDeSabonetes) {
				escrever.write(sabs.toString());//Escrevendo em "sabonetes.txt", através do método "write", o valor de retorno do método "toString" 
				//encontrado na classe "Sabonete" e chamado pelo objeto "sabs".
			}
		}
		

		

	}

}

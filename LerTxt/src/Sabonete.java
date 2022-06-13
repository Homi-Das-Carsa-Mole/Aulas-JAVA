public class Sabonete {
	
	private String cheiro;
	private String cor;
	
	@Override
	//Método clássico que utilizamos para termos o retorno dos atributos de um objeto e exibí-los em tela por meio de SYSO desse "toString":
	public String toString() {
		return "Sabonete: cheiro=" + cheiro + ", cor=" + cor + "\n";
	}
	
	//Construtor de objetos da classe "Sabonete" que recebe as variáveis "cheiro" e "cor" do tipo String como argumentos de seus parâmetros:
	public Sabonete(String cheiro, String cor) {
		this.cheiro = cheiro;
		this.cor = cor;
	}
	
	//Construtor que recebe "String texto" como parâmetro, a fim de que, quando instanciarmos um objeto por meio deste construtor, a String armazenada "texto" 
	//passe pelo tratamento especificado abaixo:
	public Sabonete(String texto) {
		
		//O objetivo dos comandos abaixo é isolar valores específicos/partes específicas da variável "String texto", como os que concernem a "cheiro" e "cor"
		//do sabonete, de modo que possamos separá-los do restante da String e atribuí-los como características do objeto da classe "Sabonete" que será
		//construído. Quando feito um SYSO deste objeto, obteremos como resultado o mesmo que conseguiríamos com o método "toString".

		
		String[] arrayAuxiliar1 = texto.split(","); //O "split" quebra a linha de texto quando encontra o caractere especificado.
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.cheiro = arrayAuxiliar2[1].trim(); //O "trim" serve para limpar os espacos vazios ao redor do valor que desejamos isolar. Nessa mesma linha estamos
		//atribuindo o valor que isolamos, no caso, qual é o cheiro do sabonete, e o atribuindo à variável cheiro de "Sabonete". O mesmo procedimento será feito
		//no pequeno bloco de comandos abaixo, porém, com o valor que representa a cor do sabonete.
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar3[1].trim();
		
		//Os comandos acima serão úteis para quando, por exemplo, escrevermos num arquivo de texto um "toString" de um determinado objeto e, ao fazer a leitura desse
		//arquivo de texto, podermos como que "montar o objeto novamente" a partir das informações armazenadas no arquivo .txt, isso, claro, feito após selecionarmos
		//e isolarmos as partes deste arquivo .txt que representem atributos do objeto em questão, como foi exemplificado através dos blocos de códigos acima.
		//Depois desses valores serem devidamente isolados, os atribuimos às suas variáveis correspondentes.
		
		//Resumão da utilidade: se gravar objetos no txt, é possível montá-los com base nessa gravação txt.
	}
	

	
	
	
}

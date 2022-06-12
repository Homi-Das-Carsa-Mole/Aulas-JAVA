
public enum DiaDaSemana {
	
	//Enum é uma classe JAVA que tem por objetivo viabilizar a construção de valores constantes, pré-definidos e imutáveis, na memoria heap.
	//Como seu nome sugere, as enums servem para enumerarmos constantes de alguma categoria. Por exemplo: os dias da semana. Os dias da semana são constantes
	//cujo valor jamais se altera. Todos sabemos que o domingo representa o 1º dia da semana, que a segunda equivale ao 2º dia da semana, e assim sucessivamente.
	
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
	//Visto que as enums são objetos constantes, cuja classe usa, internamente, da mesma declaração "static final" que fizemos uso no projeto
	//"ElementosEstaticos", eles devem ser declarados da mesma maneira: com grafia totalmente maiúscula.
	
	//Internamente, a classe Enum já instancia as constantes que declaramos acima.  
	
	private int num;//Criando o atributo "num" que, quando inserido como argumento no construtor do Enum "DiaDaSemana", definirá qual número representa
	//determinado dia da semana.

	
	private DiaDaSemana(int num) {//Para inicializar valores numa Enum, é preciso gerar seu construtor. Definimos nessa linha que toda enum do tipo "DiaDaemana"
		//terá de receber como pârametro/argumento, um "int num". Dessa maneira, pré-definimos qual o valor constante da Enum.
		this.num = num;
	}
	//Método get para capturar o valor contido numa vari�vel. Isso se faz necess�rio, já que "num" é um atributo privado, ou seja, outras classes
	//não conseguem visualizá-lo.
	public int getNum() {
		return num;
	}
	
	
}


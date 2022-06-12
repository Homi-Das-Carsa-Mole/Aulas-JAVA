
public class Constantes { //Uma constante, diferente de uma variável, é um elemento que não sofre alteração de valor, ou seja, ele é um elemento estático.
	
	public static final double MEDIA_DA_PROVA //Uma constante é declarada por meio da sentença "static final". Para nomear uma constante, se faz uso da caixa alta, isto é,
	//todos os caracteres que compõem o nome atribuído à constante devem ser grafados com letra maiúscula. Em caso de constante de nome composto, como é o caso de "Média
	//da Prova", as palavras são separadas por um subtraço, conhecido como "underline", resultando, então, em "MEDIA_DA_PROVA". 
	
	static { //Definindo o valor estático da constante "MEDIA_DA_PROVA":
		MEDIA_DA_PROVA = 7.0; //Essa constante recebe 7.0 como seu valor estático/imutável.
	}
	
	//Outra forma de criar a mesma constante acima: public static final double MEDIA_DA_PROVA = 7.0;
}

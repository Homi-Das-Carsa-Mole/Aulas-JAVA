
public enum DiaDaSemana {
	DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);
	
	//Enum � uma classe JAVA que constroi valores constantes na memoria heap
	
	//Internamente, o Enum ja instancia as variaveis que declaramos acima.  
	
	private int num;
	//Estamos atribuindo num para as constantes

	
	private DiaDaSemana(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	//M�todo get para capturar o valor contido numa vari�vel. Isso se faz necess�rio, haja vista que "num" � um atributo privado, ou seja, outras classes n�o conseguem visualiz�-la.
	
}

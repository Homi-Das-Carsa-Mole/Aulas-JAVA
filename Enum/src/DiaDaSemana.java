
public enum DiaDaSemana {
	DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);
	
	//Enum é uma classe JAVA que constroi valores constantes na memoria heap
	
	//Internamente, o Enum ja instancia as variaveis que declaramos acima.  
	
	private int num;
	//Estamos atribuindo num para as constantes

	
	private DiaDaSemana(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	//Método get para capturar o valor contido numa variável. Isso se faz necessário, haja vista que "num" é um atributo privado, ou seja, outras classes não conseguem visualizá-la.
	
}

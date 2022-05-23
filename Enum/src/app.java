
public class app {
	
	public static final double PI = 3.14;
	
	//Exemplo de como criar um enum na mesma folha da aplica��o/classe main:
	
	private enum Sexo {
		MASCULINO, FEMININO
	}

	public static void main(String[] args) {
		
		double pi =  app.PI;
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		//S� aceita os endere�os das vari�veis que foram criadas no enum DiaDaSemana
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		//Acesso ao valor atribuido para a variavel "num" que est� contida no enum SEGUNDA
		System.out.println(num);
		
		String s = "TERCA";	
//		hoje = s; //Erro: a vari�vel "hoje" � do tipo enum "DiaDaSemana". Portanto, ela n�o conseguir� receber outros valores a n�o ser aqueles que existem no Enum DiaDaSemana
		
		hoje = DiaDaSemana.valueOf(s);
		//Esse m�todo procura por um valor que seja semelhante ao que queremos atribuir � vari�vel hoje e o converte para um tipo que possa ser atribuido a variavel "hoje"
		
		System.out.println(hoje.getNum());
		
		Sexo sexo = Sexo.FEMININO;
		sexo = Sexo.MASCULINO;
		
	}

}

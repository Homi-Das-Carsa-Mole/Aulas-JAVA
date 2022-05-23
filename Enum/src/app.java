
public class app {
	
	public static final double PI = 3.14;
	
	//Exemplo de como criar um enum na mesma folha da aplicação/classe main:
	
	private enum Sexo {
		MASCULINO, FEMININO
	}

	public static void main(String[] args) {
		
		double pi =  app.PI;
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		//Só aceita os endereços das variáveis que foram criadas no enum DiaDaSemana
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		//Acesso ao valor atribuido para a variavel "num" que está contida no enum SEGUNDA
		System.out.println(num);
		
		String s = "TERCA";	
//		hoje = s; //Erro: a variável "hoje" é do tipo enum "DiaDaSemana". Portanto, ela não conseguirá receber outros valores a não ser aqueles que existem no Enum DiaDaSemana
		
		hoje = DiaDaSemana.valueOf(s);
		//Esse método procura por um valor que seja semelhante ao que queremos atribuir à variável hoje e o converte para um tipo que possa ser atribuido a variavel "hoje"
		
		System.out.println(hoje.getNum());
		
		Sexo sexo = Sexo.FEMININO;
		sexo = Sexo.MASCULINO;
		
	}

}


public class app {
	
	public static final double PI = 3.14;
	
	//Exemplo de como criar um enum na mesma folha da aplicação/classe main:
	
	private enum Sexo {
		MASCULINO, FEMININO
	}

	public static void main(String[] args) {
		
		//Uma enum pode ser criada fora de uma folha de classe, mas precisará ser armazenada dentro de algum lugar.
		double pi =  app.PI; //
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		//"hoje", por ser Só aceita os endereços das constantes que foram criadas no enum DiaDaSemana
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		//Acesso ao valor atribuido para a variavel "num" que est� contida no enum SEGUNDA
		System.out.println(num);
		
		String s = "TERCA";	
//		hoje = s; //Erro: a variável "hoje" é do tipo enum "DiaDaSemana". Portanto, ela não conseguirá receber outros valores a não ser aqueles que existem no
		//Enum DiaDaSemana.
		
		hoje = DiaDaSemana.valueOf(s);
		//Esse m�todo procura por um valor que seja semelhante ao que queremos atribuir à variável "hoje" (valueOf "s" - valor da variável "s") e o converte
		//para um tipo que possa ser atribuído à variável "hoje".
		
		System.out.println(hoje.getNum());
		
		//Uma variável chamada "sexo" que é um Enum do tipo "Sexo" estará limitada a receber apenas os valores pré-definidos/as constantes de Enum "Sexo",
		//ou seja, apenas "FEMININO" e "MASCULINO".
		Sexo sexo = Sexo.FEMININO;
		sexo = Sexo.MASCULINO;
		
	}

}


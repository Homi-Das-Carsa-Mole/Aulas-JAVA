
public interface AreaCalculavel {
	
	//Em uma interface, não inserimos atributos, apenas métodos.
	//Estes métodos, porém, possuem apenas sua assinatura. Não há o desenvolvimento de qualquer tipo de código dentro dele.
	//Uma interface serve para que diferentes classes possam se apropriar dos métodos nela implementados.
	//Cada classe pode utilizar dos métodos de uma interface da maneira que desejar, desde que se faça um Override destes métodos.
	
	//Neste caso, a interface "AreaCalculavel" possui a assinatura de um método do tipo double chamado "calcularArea", 
	//recebendo como parâmetros duas variáveis do tipo double.
	
	//O método abaixo será acessível para as demais classes que implementarem a interface "AreaCalculavel", a fim de que se possa calcular a área
	//de cada forma geométrica que escolhemos fazer uso neste projeto.
	
	double calcularArea(double x, double y); 
	
}

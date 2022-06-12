
public class Main {

	public static void main(String[] args) {
		
		Matematica matematica = new Matematica();
		
		//Métodos estáticos podem ser chamados através de variáveis de instância:
//		int resultado = matematica.somar(2, 3);
//		System.out.println("O resultado é " + resultado);
//		
//		resultado = matematica.subtrair(10, 4);
//		System.out.println("O resultado é " + resultado);
	
		//Mas não dependem da existência de um objeto para que possam ser acionados e realizar sua finalidade, como mostram os exemplos abaixo:
//		resultado = Matematica.somar(2, 4);
//		System.out.println("O resultado da soma é " + resultado);
//		
//		resultado = Matematica.subtrair(10, 11);
		
//		Contador contador1 = new Contador();//Todo novo objeto da classe "Contador" terá o valor 1 atribuído à variável "valor", pois esse é o valor
//		//estático dessa variável, compartilhado com todos os objetos. Dessa forma, ainda que acionemos o método "incrementar" através de diferentes
//		//instâncias, a variável "valor" terá o mesmo conteúdo em todas, afinal, ela é um elemento estático.
//		Contador contador2 = new Contador();
//		Contador contador3 = new Contador();
		
		//Aplicando o método "incrementar" com diferentes objetos:
//		contador1.incrementar();
//		contador2.incrementar();
//		contador3.incrementar();
//		
//		System.out.println(contador1.getValor());
//		System.out.println(contador2.getValor());
//		System.out.println(contador3.getValor()); //Ao imprimir, nos é exibido na tela que o atributo "valor" de cada um desses objetos é igual a 4, e não 2 - 
//		//lembrando que a variável "valor", ao instanciar objetos do tipo "Contador", já vem com o valor 1 atribuído a ela.
		
		//Incrementando/Atribuindo +1 à variável "valor" (que já é inicializada valendo 1) três vezes:
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		//Como visto acima, não fizemos uso de nenhuma instância para acionar o método "incrementar" e incrementar a variável "valor".
		
		System.out.println(Contador.getValor()); //Imprime na tela que a variável "valor" é igual a 4.
		
		System.out.println("A média da prova é " + Constantes.MEDIA_DA_PROVA);
	}

}

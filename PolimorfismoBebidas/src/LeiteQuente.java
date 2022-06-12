
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite Quente", true);
	}

	@Override
	public void preparar() {
		super.preparar();//O "super.preparar" está chamando as ações do método "preparar" da superclasse, de modo a executá-las juntamente com a linha de código abaixo.
		//Chamamos o método "preparar" da superclasse "Bebida" porque nele está contida uma ação que é como que "universal" e válida para a preparação de qualquer
		//bebida: um SYSO dizendo "Pegando o copo".
		System.out.println("Colocando o leite no copo");
	}
	
	
	
}

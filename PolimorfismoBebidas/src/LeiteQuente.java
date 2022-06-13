
public class LeiteQuente extends Bebida {

	public LeiteQuente() { //Construtor de objetos da classe "LeiteQuente". Seus objetos já são instanciados com valores pré-definidos, que puderam ser inseridos abaixo
		//por invocar o método construtor da superclasse - "Bebida". 
		super("Leite Quente", true);//A variável "nome" recebe "Leite Quente", e atribui-se "true" à variável "boolean aquecer", já que esta é uma bebida quente. 
	}

	@Override
	public void preparar() {
		super.preparar();//O "super.preparar" está chamando o método "preparar" da superclasse, de modo a executá-lo juntamente com o Override deste método inserido
		//nessa classe. Chamamos o método "preparar" da superclasse "Bebida" porque nele está contida uma ação que é como que "universal" e válida para a preparação
		//de qualquer bebida: um SYSO dizendo "Pegando o copo".
		System.out.println("Colocando o leite no copo");
	}
	
	
	
}

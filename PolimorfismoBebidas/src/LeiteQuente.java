
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite Quente", true);
	}

	@Override
	public void preparar() {
		super.preparar(); // O "super" está chamando as ações do método "preparar" da superclasse.
		System.out.println("Colocando o leite no copo");
	}
	
	
	
}


public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite Quente", true);
	}

	@Override
	public void preparar() {
		super.preparar(); // O "super" est� chamando as a��es do m�todo "preparar" da superclasse.
		System.out.println("Colocando o leite no copo");
	}
	
	
	
}

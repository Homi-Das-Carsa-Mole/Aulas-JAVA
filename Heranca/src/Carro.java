
public class Carro extends Veiculo {
	private boolean quatroPortas;
	
	

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir(); // O super.imprimir() serve para executar o método imprimir da suoerclassse + o Override.
		System.out.println("Tem quatro portas? " + quatroPortas);
	}

	public boolean isQuatroPortas() { // is: é ou não é?
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
}


public class Carro extends Veiculo {
	private boolean quatroPortas;
	
	

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir(); // O super.imprimir() serve para executar o m�todo imprimir da suoerclassse + o Override.
		System.out.println("Tem quatro portas? " + quatroPortas);
	}

	public boolean isQuatroPortas() { // is: � ou n�o �?
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
}

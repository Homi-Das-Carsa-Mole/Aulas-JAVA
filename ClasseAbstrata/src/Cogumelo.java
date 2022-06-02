
public class Cogumelo extends Item { //A classe Cogumelo se estende da classe Item, já que Cogumelo é um item, logo, ela possui acesso aos métodos inseridos em Item.

	@Override
	public void pegar() { //Método "pegar" sobrescrito por meio do @Override, especificando uma ação particular da classe Cogumelo.
		System.out.println("Pegou Cogumelo.");
	}

	
}


public class Cogumelo extends Item { //Já que os cogumelos representam um tipo de item disponível em nosso jogo, a classe Cogumelo se estende da classe abstrata "Item",
	//possuindo acesso aos método genérico "pegar" inserido nela. O mesmo se aplica às demais classes filhas de "Item".

	@Override
	public void pegar() { //Método "pegar" sobrescrito por meio do @Override, especificando uma ação particular da classe Cogumelo.
		System.out.println("Pegou Cogumelo.");
	}

	
}

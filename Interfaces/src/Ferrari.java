
public class Ferrari implements Automovel, ItemCaro { //Por usar "implements", estamos como que conectando uma interface à uma classe. A partir de agora, todos os objetos da
	//classe Ferrari terão acesso aos métodos que definimos na interface "Automovel".

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou para esquerda.");
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou para direita.");
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou.");
	}

	@Override
	public double getPreco() {
		return 1000000000;
	}
	
}

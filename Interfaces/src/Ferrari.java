
public class Ferrari implements Automovel, ItemCaro {

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


public class Rota {
	public void ir(Automovel automovel) { // Não colocamos "Ferrari" como parâmetro, pois assim o método ir funcionaria apenas para Ferrari
		automovel.virarDireita();
		automovel.virarEsquerda();
		automovel.acelerar();
		automovel.virarDireita();
	}
}


public class Rota {
	public void ir(Automovel automovel) { // N�o colocamos "Ferrari" como par�metro, pois assim o m�todo ir funcionaria apenas para Ferrari
		automovel.virarDireita();
		automovel.virarEsquerda();
		automovel.acelerar();
		automovel.virarDireita();
	}
}

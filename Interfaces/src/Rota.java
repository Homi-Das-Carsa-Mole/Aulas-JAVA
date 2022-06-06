
public class Rota {
	
	public void ir(Automovel automovel) { //Não colocamos "Ferrari" como o tipo da variável dentro do parâmetro, pois assim o método "ir" funcionaria apenas para objetos da
	//classe Ferrari. Por colocarmos "Automovel", englobamos todo os tipos de 
		
		//Assim que um automóvel chamar o método "ir", ele realizará a seguinte sequência de movimentos:
		automovel.virarDireita();
		automovel.virarEsquerda();
		automovel.acelerar();
		automovel.virarDireita();
		
		//É importante ressaltar que, apesar de todos os automóveis fazerem uso do método acima, cada um é personalizado e individualizado através de um Override
		//que especifica qual automóvel está realizando a rota definida.
	}
}

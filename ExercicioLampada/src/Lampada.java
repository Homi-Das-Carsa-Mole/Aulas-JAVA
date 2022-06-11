
public class Lampada { 
	private boolean ligada; //Atributo do tipo boolean para determinar se a lâmpada está ligada ou desligada.

	//Método construtor da classe "Lampada". Dentro do parâmetro desse construtor, é possível inserir os valores true ou false para determinar se a lâmpada
	//já está ligada ou não.
	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}

	//Método para ligar a lâmpada:
	public void ligar() {
		if (ligada == true) {//Se o valor da variável "ligada" for "true", ou seja, se a lâmpada já estiver ligada, será exibida uma mensagem na tela dizendo
		//que a lâmpada já se encontra ligada, portanto, o valor de "ligada" permanecerá o mesmo: true.
		 System.out.println("A lâmpada já está ligada.");
		} else { //Senão, isto é, se o valor de "ligada" for "false", então o código abaixo atribuirá "true" para a variável "ligada", a fim de que a lâmpada
		//seja ligada.
		ligada = true;
		System.out.println("Ligando a lâmpada...");
		}
	}
	
	//Método para desligar a lâmpada:
	public void desligar() {
		if (ligada == false) {//A lógica do método anterior se repete neste caso.
			System.out.println("A lâmpada já está desligada.");
		} else {
		ligada = false; 
		System.out.println("Desligando a lâmpada...");
		}
	}

	//Método que que imprime na tela qual o estado da lâmpada, se está ligada ou desligada:
	public void imprimir() {
		if (ligada == true) {//Se estiver ligada, uma mensagem se fará visível na tela informando que a lâmpada está ligada.
			System.out.println("A lâmpada está ligada.");
		} else {//Senão, será impressa uma mensagem dizendo que a lâmpada está desligada.
			System.out.println("A lâmpada está desligada.");
		}
	}

}

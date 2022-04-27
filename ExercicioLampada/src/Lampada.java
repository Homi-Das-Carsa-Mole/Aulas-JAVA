
public class Lampada {
	private boolean ligada;

	

	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}

	public void ligar() {
		 ligada = true;
		
	}
	
	public void imprimir() {
		if (ligada == true) {
			System.out.println("Lâmpada ligada.");
		}
		else {
			System.out.println("Lâmpada desligada.");
		}
	}
	
	public void desligar() {
		ligada = false;
	}
}

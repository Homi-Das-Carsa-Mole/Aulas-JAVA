
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
			System.out.println("L�mpada ligada.");
		}
		else {
			System.out.println("L�mpada desligada.");
		}
	}
	
	public void desligar() {
		ligada = false;
	}
}


public class Contador {
	private static int valor;
	
//	public Contador() {
//		this.valor = 1;
//	}

	public static void incrementar() {
		valor++;
	}
	
	static {
		valor = 1; //Só é executado na primeira vez
	}

	public static int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}


public class Contador {
	private static int valor;
	
//	public Contador() {
//		this.valor = 1;
//	}

	//Método estático, acessível sem depender de variável de instância, e que incrementa +1 à variável "valor": 
	public static void incrementar() {
		valor++;
	}
	
	//Definindo o valor estático da variável "valor":
	static {
		valor = 1; //Só é executado na primeira vez
	}
	
	//Método para pegar o valor da variável "valor":
	public static int getValor() {
		return valor;
	}
	
}

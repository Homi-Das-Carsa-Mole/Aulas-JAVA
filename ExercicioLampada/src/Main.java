
public class Main {

	public static void main(String[] args) {
		
		
		Lampada lamp1; //Criando uma variável do tipo "Lampada" que se chamará "lamp1".
		lamp1 = new Lampada(true); //Instanciando um objeto do tipo "Lampada" que se chamará "lamp1".
		//O operador "new" chama o construtor da classe "Lampada" e permite preenchermos seu parâmetro com a informação exigida por este, no caso, se a
		//lâmpada está ligada ou não (true ou false).
		
		//Utilizando os métodos "ligar", "desligar" e "imprimir":
		lamp1.imprimir();
		lamp1.desligar();
		lamp1.imprimir();
		
		//Instanciando o objeto do tipo "Lampada", que se chamará "lamp2":
		Lampada lamp2 = new Lampada(false);
		
		//Utilizando os métodos "ligar", "desligar" e "imprimir":
		lamp2.imprimir();
		lamp2.ligar();
		lamp2.desligar();
		lamp2.imprimir();
		lamp2.ligar();
		lamp2.imprimir();

	}

}

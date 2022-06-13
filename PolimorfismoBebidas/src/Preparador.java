
public class Preparador { // Classe de passagem
	
	//O Preparador servirá apenas para intermediar o processo de de preparação das bebidas. 
	public void prepararBebida(Bebida bebida) {//Dependendo da instância que convocar este método, o modo de preparação irá variar, já que no parâmetro deste método cabe
		//qualquer objeto do tipo "Bebida" e, por extensão, quaisquer objetos advindos de suas classes filhas. Visto que cada uma dessas classes filhas fez Override
		//no método "preparar", a forma de preparação das bebidas não será igual entre elas; como já dito, a preparação será feita de acordo com a instância, em outras
		//palavras, de acordo com a bebida. Isso é polimorfismo.
		System.out.println("Preparando a bebida " + bebida.getNome() + ".");
		bebida.preparar();
		
		//Se a bebida for quente, é executado o comando abaixo, responsável por aquecê-la.
		if(bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida " + bebida.getNome() + ".");
		}
		
		System.out.println("Bebida preparada com sucesso!\n");
	}
}



public abstract class Item {//Uma classe abstrata é uma superclasse que estende métodos genéricos às suas subclasses, as quais farão uso destes métodos após
	//sobrescrevê-los e personalizá-los de acordo com suas necessidades e particularidades.
	//"Item" é um ótimo exemplo de classe abstrata, isso porque o termo "Item" é genérico/abstrato o suficiente para englobar uma vasta gama de elementos, tornando possível
	//que diversos tipos de itens como Cogumelo, Diamante e Moeda - exemplos usados nesse projeto sobre Classe Abstrata - possam se estender da classe "Item". 
	private int posX;
	private int posY;
	
	public abstract void pegar(); //Métodos abstratos forçam as classes que se estendem de uma classe abstrata (nesse caso a "Item"), consequentemente utilizando de seus
	//métodos abstratos, a sobrescrever (fazer um Override) e especificar como estes métodos irão se comportar. Um mesmo método genérico 
	//Classes abstratas precisam somente de sua assinatura, ou seja, o tipo de variável que será retornada e seus parâmetros; não é preciso abrir chaves e desenvolver
	//uma linha de códigos que especifique o que ocorrerá dentro do método. Esse procedimento é realizado dentro de cada classe filha que herda o método em questão.

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}

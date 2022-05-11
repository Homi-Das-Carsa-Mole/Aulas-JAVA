
public abstract class Item {
	private int posX;
	private int posY;
	
	public abstract void pegar(); //Métodos abstratos forçam as classes que estendem de item e que utilizarão deste método a sobrescrever (override) e especificar quais serão suas funções.
	//Classes abstratas precisam somente de sua assinatura, ou seja, o tipo de variável que será retornada e seus parâmetros; não é preciso abrir chaves. 

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

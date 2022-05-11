
public abstract class Item {
	private int posX;
	private int posY;
	
	public abstract void pegar(); //M�todos abstratos for�am as classes que estendem de item e que utilizar�o deste m�todo a sobrescrever (override) e especificar quais ser�o suas fun��es.
	//Classes abstratas precisam somente de sua assinatura, ou seja, o tipo de vari�vel que ser� retornada e seus par�metros; n�o � preciso abrir chaves. 

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

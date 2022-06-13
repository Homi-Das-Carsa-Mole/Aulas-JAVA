
public class Bebida {//Classe da qual todas as outras classes de bebidas se estendem.
	private String nome;
	private boolean aquecer;
	
	//Construtor de objetos da classe "Bebida", o qual exige que forneçamos para a bebida a ser construída um nome e se ela é quente ou não.
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	public void preparar() {//Método que é sobrescrito em cada subclasse de "Bebida", a fim de que estas possam dar mais detalhes sobre como é feito o seu preparo,
	//mas que gera um SYSO necessário e comum entre o preparo de todas as bebidas.
		System.out.println("Pegando o copo");
	}
	
	//GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAquecer() {
		return aquecer;
	}

	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	
}

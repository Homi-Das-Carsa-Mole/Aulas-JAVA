
public class Conta {
	String nome;
	double valor;
	/**
	 * @param nome
	 * @param valor
	 */
	public Conta(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	@Override
	//Para que as informações de uma lista possam ser impressas no console, faz-se uso do método "toString". É possível manter a formatação de exibição original, gerada 
	//automaticamente através do "Generate toString()", mas personalizar como as informações abaixo aparecerão na tela também é uma opção.
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}
	
	

}

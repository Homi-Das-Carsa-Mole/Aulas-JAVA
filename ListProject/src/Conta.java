
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
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}
	
	

}

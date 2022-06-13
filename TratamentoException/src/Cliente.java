import java.util.Objects;

public class Cliente { //Declara��o dos atributos da classe Cliente
	private String nome;
	private int cpf;
	private ContaBancaria conta;
	
	//Os atributos acima est�o privados, ou seja, nenhuma outra classe, nem mesmo a classe Main, consegue acessar e/ou modificar esses atributos.
	//"Public", "Private" e "Protected" s�o classificados como modificadores de acesso, j� que permitem determinar se outras classes podem ter acesso ou n�o
	//a um atributo ou m�todo, os encapsulando.
	//A fim de se ter acesso aos atributos da classe Cliente, bem como a capacidade de modific�-los, � necess�rio gerar os m�todos Get e Set (Getters and Setters).
	//O m�todo "get" nos permite, como o pr�prio sugere, *pegar*/ter o retorno de uma informa��o.
	//J� o m�todo "set" possibilita a *defini��o*/modifica��o do conte�do de determinado atributo/vari�vel.	
	
	//Construtor de um objeto da classe Cliente:
	public Cliente() {
		
	}
	
	public Cliente(String nome, int cpf, ContaBancaria conta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}



	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}

	@Override
	//M�todo "toString", que converte, como o nome diz, *para String* todos os atributos de um objeto que desejamos visualizar.
	//Ao gerarmos esse m�todo, nos � oferecida, automaticamente, uma String com todas as informa��es que exigirmos.
	//� poss�vel modificar, por meio de um Override, a forma como essas informa��es ser�o exibidas; foi o que fizemos neste caso.
	public String toString() {
		return "----------------------------------------------- \nCliente: \nNome: " + nome + "\nCPF: " + cpf + "\n-----------------------------------------------";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

//	@Override
	//M�todo Equals: serve para comparar objetos e verificar se eles s�o iguais. Naturalmente, o m�todo "equals" apontar� que dois objetos s�o diferentes, pois compara
	//apenas o endere�o desses objetos na mem�ria heap. No entanto, o "Override" feito neste m�todo nos permite o que h� dentro de duas vari�veis e concluir se
	//elas s�o iguais em conte�do.
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Cliente other = (Cliente) obj;
//		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
//	}
	
	

	
}
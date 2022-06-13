import java.util.Objects;

public class Cliente { //Declaração dos atributos da classe Cliente
	private String nome;
	private int cpf;
	private ContaBancaria conta;
	
	//Os atributos acima estão privados, ou seja, nenhuma outra classe, nem mesmo a classe Main, consegue acessar e/ou modificar esses atributos.
	//"Public", "Private" e "Protected" são classificados como modificadores de acesso, já que permitem determinar se outras classes podem ter acesso ou não
	//a um atributo ou método, os encapsulando.
	//A fim de se ter acesso aos atributos da classe Cliente, bem como a capacidade de modificá-los, é necessário gerar os métodos Get e Set (Getters and Setters).
	//O método "get" nos permite, como o próprio sugere, *pegar*/ter o retorno de uma informação.
	//Já o método "set" possibilita a *definição*/modificação do conteúdo de determinado atributo/variável.	
	
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
	//Método "toString", que converte, como o nome diz, *para String* todos os atributos de um objeto que desejamos visualizar.
	//Ao gerarmos esse método, nos é oferecida, automaticamente, uma String com todas as informações que exigirmos.
	//É possível modificar, por meio de um Override, a forma como essas informações serão exibidas; foi o que fizemos neste caso.
	public String toString() {
		return "----------------------------------------------- \nCliente: \nNome: " + nome + "\nCPF: " + cpf + "\n-----------------------------------------------";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

//	@Override
	//Método Equals: serve para comparar objetos e verificar se eles são iguais. Naturalmente, o método "equals" apontará que dois objetos são diferentes, pois compara
	//apenas o endereço desses objetos na memória heap. No entanto, o "Override" feito neste método nos permite o que há dentro de duas variáveis e concluir se
	//elas são iguais em conteúdo.
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
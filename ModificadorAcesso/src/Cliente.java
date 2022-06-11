import java.util.Objects;

public class Cliente { //Declaração dos atributos da classe Cliente
	private String nome;
	private int cpf;
	private int numConta;
	
	//Os atributos acima estão privados, ou seja, nenhuma outra classe, nem mesmo a classe Main, consegue acessar e/ou modificar esses atributos.
	//"Public", "Private" e "Protected" são classificados como modificadores de acesso, já que permitem determinar se outras classes podem ter acesso ou não
	//a um atributo ou método, os encapsulando.
	//A fim de se ter acesso aos atributos da classe Cliente, bem como a capacidade de modificá-los, é necessário gerar os métodos Get e Set (Getters and Setters).
	//O método "get" nos permite, como o próprio sugere, *pegar*/visualizar uma informação.
	//Já o método "set" possibilita a *definição*/modificação do conteúdo de determinado atributo/variável.	
	
	//Construtor de um objeto da classe Cliente:
	public Cliente() {
		
	}
	
	//Método "get" do atributo "nome", para que possamos "visualizar" (entre aspas pelo fato de não usarmos nenhum SYSO, para de fato visualizar) o nome do cliente.
	public String getNome() { //Esse método nos retorna um String, no caso, o nome do cliente, que é do tipo String.
		return nome;
	}
	
	//Método "set" do atributo "nome", para que consigamos definir o nome do cliente:
	public void setNome(String nome) { //Esse é um método sem retorno, que tem como parâmetro uma variável do tipo String chamada "nome". 
		//Neste método, estamos apenas ordenando que o atributo "nome" do cliente (this.nome) seja igual ao nome que definirmos dentro do parâmetro do método. 
		this.nome = nome;
	}
	
	//Método "get" do atributo "cpf", para que possamos visualizar o CPF do cliente:
	public int getCpf() { //Retorno do tipo inteiro, permitindo pegar o contéudo atribuido à variável CPF.
		return cpf;
	}
	
	//Método "set" do atributo "cpf", que viabiliza "setarmos" o número do CPF do cliente.
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	//Método "get" do atributo "numConta":
	public int getNumConta() { //Método com retorno do tipo int, já que "numConta" se trata de uma variável do tipo int.
		return numConta;
	}
	
	//Método para setar o número da conta do cliente:
	public void setNumConta(int numConta) { //Método sem retorno, onde estamos apenas atribuindo um número de conta à variável "numConta" de Cliente, representada por "this.numConta".
		this.numConta = numConta;
	}

	@Override
	//Método "toString", que converte, como o nome diz, *para String* todos os atributos que desejamos visualizar.
	//Ao gerarmos esse método, nos é oferecida, automaticamente, uma String com todas as informações que exigirmos.
	//É possível modificar, por meio de um Override, a forma como essas informações serão exibidas; foi o que fizemos neste caso.
	public String toString() {
		return "----------------------------------------------- \nCliente: \nNome: " + nome + "\nCPF: " + cpf + "\nNúmero da conta = " + numConta + "\n-----------------------------------------------";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, numConta);
	}

	@Override
	//Método Equals: serve para comparar objetos e verificar se eles são iguais. Naturalmente, o método "equals" apontará que dois objetos são diferentes, pois compara
	//apenas o endereço desses objetos na memória heap. No entanto, o "Override" feito neste método nos permite o que há dentro de duas variáveis e concluir se
	//elas são iguais em conteúdo.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}
	
	

	
}


public class Pessoa {
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n Idade: " + idade + "\n Sexo: " + getSexo() +  "\n Rua: " + endereco.getRua() + "\n Número: " + endereco.getNum() + "\n Bairro: " + endereco.getBairro();
	}


	
	
	
}


public class Pessoa {
	String nome;
	int idade;
	Endereco endereco;
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\n Idade: " + idade + "\n Rua: " + endereco.rua + "\n N�mero: " + endereco.num + "\n Bairro: " + endereco.bairro;
	}
	
	
	
}

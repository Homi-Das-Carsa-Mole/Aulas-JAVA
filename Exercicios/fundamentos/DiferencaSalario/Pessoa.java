package DiferencaSalario;

public class Pessoa {
	private String nome, cpf;
	private int idade;
	private double salario;
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = getCargo().getValor();
	}

	Cargo cargo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", CPF:" + cpf + ", Idade: " + idade + ", Cargo: " + getCargo() + ", Salário: " + getCargo().getValor() + "\n";
	}
	
	public Pessoa (String texto) {
		
		String[] arrayAux1 = texto.split(",");
		String[] arrayAux2 = arrayAux1[0].split(":");
		this.nome = arrayAux2[1].trim();
		
		String [] arrayAux3 = arrayAux1[1].split(":");
		this.cpf = arrayAux3[1].trim();
		
		String [] arrayAux4 = arrayAux1[2].split(":");
		this.idade = Integer.parseInt(arrayAux4[1].trim());
		
		String [] arrayAux5 = arrayAux1[3].split(":");
		this.cargo = Cargo.valueOf(arrayAux5[1].trim());
		
		String[] arrayAux6 = arrayAux1[4].split(":");
		this.salario = Double.parseDouble(arrayAux6[1].trim()); 
		
	}

	public Pessoa() {

	}

	
	
	
	
	
}

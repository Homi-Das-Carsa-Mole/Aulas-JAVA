package MediaSalarial;

public class Funcionarios {
	private String nome, cpf;
	private Sexo sexo;
	private Cargo cargo;
	private double salario;
	
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
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public void setSalario(Cargo cargo) {
		this.salario = getCargo().getSalario();
	}

	public double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nSexo: " + sexo + "\nCargo: " + cargo.getNomeDoCargo() + "\nSalário: R$"
				+ salario + "\n-----------------------------------------------------------------";
	}
	
	
	
	
	
	
}

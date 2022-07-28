package mediaSalarialv2;

import mediaSalarialv2.Sexo;

public class Funcionarios {
	private String nome, cpf, cargo;
	private Sexo sexo;
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
	

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nSexo: " + sexo + "\nCargo: " + cargo + "\nSalario: R$"
				+ salario + "\n-----------------------------------------------------------------";
	}
	
}
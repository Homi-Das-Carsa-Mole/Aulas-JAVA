package mediaSalarialv2;

public enum Cargo {
	GERENTE("Gerente", 4000.0),
	VENDEDOR_DE_BOMBAS_ATOMICAS("Vendedor de bombas atômicas", 1450.70),
	OPERADOR_DE_TELEMARKETING("Operador de telemarketing", 1350.0),
	OPERADOR_DE_MAQUINAS("Operador de máquinas", 1500.0),
	SONOPLASTA_DO_RATINHO("Sonoplasta do Ratinhooooool", 6275.80),
	KUDOIRISTA("Kudoirista", 10000.0),
	PALHACO("Bozo", 10.0);
	
	private String nomeDoCargo;
	private double salario;
	
	private Cargo (String nomeDoCargo, double salario) {
		this.nomeDoCargo = nomeDoCargo;
		this.salario = salario;
	}

	public String getNomeDoCargo() {
		return nomeDoCargo;
	}

	public double getSalario() {
		return salario;
	}
	
}

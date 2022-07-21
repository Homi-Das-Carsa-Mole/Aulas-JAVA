package DiferencaSalario;

public enum Cargo {
	GERENTE(5400.0),
	ABATEDOR_DE_MATO(2500.0),
	DEGUSTADOR_COBAIA(2750.0),
	VENDEDOR_DE_CURSO_SOBRE_COMO_SER_VEGETARIANO(100.0);
	
	private double valor;

	private Cargo(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	

}


public class Circunferencia implements AreaCalculavel { //Implementamos a interface AreaCalculavel na classe Circunferencia para que seja possível usufruir de seus métodos.

	@Override //Visto que as formas geométricas selecionadas possuem formas distintas de se calcular a área, fazemos um Override do método "calcularArea",
	//que está na interface AreaCalculavel, de modo a especificar como desejamos realizar o cálculo.
	public double calcularArea(double x, double y) {
		return Math.pow(x, 2) * Math.PI; //Utilização da classe "Math", a qual contém métodos voltados para cálculos matemáticos.
		//Math.pow serve para realizar uma potenciação. O primeiro valor do parâmetro representa a base da potência, enquanto o segundo valor define seu expoente.
		//Math.PI representa o número PI.
	}

}

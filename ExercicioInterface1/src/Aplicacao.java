
public class Aplicacao {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		System.out.println("O valor da �rea � " + quadrado.calcularArea(5, 0));
		
		Retangulo retangulo = new Retangulo();
		System.out.println("O valor da �rea � " + retangulo.calcularArea(10, 5));
		
		Circunferencia circunferencia = new Circunferencia();
		System.out.println("O valor da �rea � " + circunferencia.calcularArea(4, 0));

	}

}

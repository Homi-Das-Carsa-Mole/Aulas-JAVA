
public class Circunferencia implements AreaCalculavel {

	@Override
	public double calcularArea(double x, double y) {
		return Math.pow(x, 2) * Math.PI;
	}

}

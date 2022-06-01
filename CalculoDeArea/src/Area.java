
public class Area {
	//Um mesmo método para calcular área de um quadrado, um triângulo e um retângulo
	//utilizando a sobrecarga de métodos.
	double calcularArea(double x) {
		return x * x;
	}
	
	double calcularArea(double x, double y) {
		return x * y / 2;
	
	}

	float calcularArea(float x, float y) {
		return x * y;
	}
}

//Acima, vimos que um mesmo método pode realizar diferentes funções dependendo de seus parâmetros.



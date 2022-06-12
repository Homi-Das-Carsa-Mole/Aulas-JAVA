//A sobrecarga de métodos já foi explicada no projeto "Sobrecarga" ;D
public class Area {
	//Um mesmo método para realizar tarefas com execuções diferentes: calcular área de um quadrado, de um triângulo e de um retângulo.
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

//Acima, vimos que um mesmo método pode realizar diferentes funções dependendo das informações que preenchem seus parâmetros. Isso é sobrecarga de método e, também, polimorfismo.



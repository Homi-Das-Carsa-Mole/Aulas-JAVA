
public class Matematica {
	
	//É possível fazer com que um mesmo método seja utilizado de diferentes formas dependendo de seus parâmetros.
	
	int somar(int x, int y) { //O método "somar", nesse primeiro caso, recebe em seu construtor o parâmetro de dois valores inteiros, x e y.
		
		//int z = x + y;
		//return z;
		return x + y;
	}
	
	int somar(int x, int y, int z) { //Neste segundo caso, o construtor do mesmo método anterior, o "somar", recebe três parâmetros,
	//isto é, três valores inteiros, x, y e z.
		return x + y + z;
	}
	
	double somar(double x, double y) { //Já aqui, o mesmo método trabalhará, mais uma vez, com parâmetros diferentes: double x e double y.
		return x + y;
	}
}

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		int z = 0;
		while (z < 1) {
		
		int forma;
		double  x, y;
			
		Area calculo = new Area();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Você deseja calcular a área de qual forma geométrica?");
		System.out.println("1. Quadrado");
		System.out.println("2. Triângulo");
		System.out.println("3. Retângulo");
		
		forma = entrada.nextInt();
		
		if (forma == 1) {
			System.out.println("Insira a medida, em metros, de qualquer um dos lados do quadrado: ");
			x = entrada.nextDouble();
			
			System.out.println("A área do quadrado é " + calculo.calcularArea(x) + "m².");
			
			
		} else if (forma == 2) {
			System.out.println("Insira a medida, em metros, da base do triângulo: ");
			x = entrada.nextDouble();
			
			System.out.println("Insira a medida, em metros, da altura do triângulo: ");
			y = entrada.nextDouble();
			
			System.out.println("A área do triângulo é " + calculo.calcularArea(x, y) + "m².");
			
		} else if (forma == 3) {
			System.out.println("Insira a medida, em metros, da largura do retângulo: ");
			x = entrada.nextFloat();
			
			System.out.println("Insira a medida, em metros, da altura do retângulo: ");
			y = entrada.nextFloat();
			
			System.out.println("A área do retângulo é " + calculo.calcularArea(x, y) + "m².");
			
		} else {
			System.out.println("Opção inválida.");
		}
		
		System.out.println("Deseja continuar calculando? 1 - Sim | 2 - Não");
		int resposta = entrada.nextInt();
		
		if (resposta == 1) {
			z = 0;
			
		} else if (resposta == 2) {
			z += 1;
			System.out.println("Fim das contas.");
		}
		
		}
	}
}
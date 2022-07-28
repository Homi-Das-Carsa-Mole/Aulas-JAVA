package Temperatura;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Formulas formulas = new Formulas();
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Bem-vindo ao conversor de temperatura.");
		System.out.println("Digite, em graus celcius, a temperatura que voce deseja converter:");
		
		double temperatura = entrada.nextDouble();
		
		int opcao = 0;
		while (opcao < 1 || opcao > 5) {
			System.out.println("Escolha para qual escala termometrica voce deseja converter: ");
			System.out.println("1. Kelvin | 2. Reaumur | 3. Rankine | 4. Fahrenheit | 5. todas as escalas anteriores");
			opcao = entrada.nextInt();
			
			if (opcao == 1) {
				System.out.println("A conversao de " + temperatura + " °C para Kelvin eh igual a " + formulas.toKelvin(temperatura) + " K.");
			} else if (opcao == 2){
				System.out.println("A conversao de " + temperatura + " °C para Reaumur eh igual a " + formulas.toReaumur(temperatura) + " °Re.");
			} else if (opcao == 3) {
				System.out.println("A conversao de " + temperatura + " °C para Rankine eh igual a " + formulas.toRankine(temperatura) + " °R.");
			} else if (opcao == 4) {
				System.out.println("A conversao de " + temperatura + " °C para Fahrenheit eh igual a " + formulas.toFahrenheit(temperatura) + " °F.");
			} else if (opcao == 5) {
				System.out.println("Conversao de " + temperatura + " °C para todas as escalas disponiveis:");
				System.out.println("Kelvin: " + formulas.toKelvin(temperatura) + " K." );
				System.out.println("Reaumur: " + formulas.toReaumur(temperatura) + " °Re.");
				System.out.println("Rankine: " + formulas.toRankine(temperatura) + " °R.");
				System.out.println("Fahrenheit: " + formulas.toFahrenheit(temperatura) + " °F.");
			} else {
				System.out.println("COMANDO INEXISTENTE. Por favor, tente novamente.");
				opcao = 0;
			}
			
			int opcao2 = 0;
			while (opcao2 != 1 && opcao2 != 2) {
			System.out.println("Deseja continuar convertendo? 1. Sim | 2. Nao");
			opcao2 = entrada.nextInt();
			if (opcao2 == 1) {
				opcao = 0;
			} else if (opcao2 == 2) {
				System.out.println("Desejamos temperaturas agradaveis para voce e sua familia em todas as escalas possiveis. Agradecemos imensamente!");
			} else {
				System.out.println("COMANDO NEGADO - VALOR INEXISTENTE. Por favor, tente novamente.");
			}
			
			}
			
		}

	}

}

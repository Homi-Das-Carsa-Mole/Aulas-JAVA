package Temperatura;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Formulas formulas = new Formulas();
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Bem-vindo ao conversor de temperatura.");
		System.out.println("Digite a temperatura em graus celsius que você deseja converter:");
		
		double temperatura = entrada.nextDouble();
		
		int opcao = 0;
		while (opcao < 1 || opcao > 5) {
			System.out.println("Escolha para qual escala termométrica você deseja converter:");
			System.out.println("1. Kelvin | 2. Réaumur | 3. Rankine | 4. Fahrenheit | 5. todas as escalas anteriores");
			opcao = entrada.nextInt();
			
			if (opcao == 1) {
				System.out.println("A conversão de " + temperatura + " °C para Kelvin é igual a " + formulas.toKelvin(temperatura) + " K.");
			} else if (opcao == 2){
				System.out.println("A conversão de " + temperatura + " °C para Réaumur é igual a " + formulas.toReaumur(temperatura) + " °Re.");
			} else if (opcao == 3) {
				System.out.println("A conversão de " + temperatura + " °C para Rankine é igual a " + formulas.toRankine(temperatura) + " °Ra.");
			} else if (opcao == 4) {
				System.out.println("A conversão de " + temperatura + " °C para Fahrenheit é igual a " + formulas.toFahrenheit(temperatura) + " °F.");
			} else if (opcao == 5) {
				System.out.println("Conversão de " + temperatura + " °C para todas as escalas disponíveis:");
				System.out.println("Kelvin: " + formulas.toKelvin(temperatura) + " K." );
				System.out.println("Réaumur: " + formulas.toReaumur(temperatura) + " °Re.");
				System.out.println("Rankine: " + formulas.toRankine(temperatura) + " °Ra.");
				System.out.println("Fahrenheit: " + formulas.toFahrenheit(temperatura) + " °F.");
			} else {
				System.out.println("Opção inválida. Tente novamente.");
				opcao = 0;
			}
			
			int opcao2 = 0;
			while (opcao2 != 1 && opcao2 != 2) {
			System.out.println("Deseja continuar convertendo? 1. Sim | 2. Não");
			opcao2 = entrada.nextInt();
			if (opcao2 == 1) {
				opcao = 0;
			} else if (opcao2 == 2) {
				System.out.println("Fim do programa.");
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
			
			}
			
		}

	}

}

package CalculadoraDeDescontos;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("CALCULADORA DE DESCONTOS");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto em reais:");
		double valor = entrada.nextDouble();
		
		System.out.println("Digite o valor do desconto (Exemplo: 30 para 30 por cento.)");
		int desc = entrada.nextInt();
		
		double vTotal = valor - (valor * desc / 100);
		
		System.out.println("O valor inserido para o produto foi R$" + valor + ".");
		System.out.println("O desconto inserido foi de " + desc + "%.");
		System.out.println("O valor final do produto é de R$" + vTotal + ".");
		
	}

}

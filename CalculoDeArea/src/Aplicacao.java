import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		int z = 0;//Variável de controle (para a estrutura de repetição) 
		
		//Instanciando um objeto chamado "entrada", pertencente à classe Scanner. Sua função já foi explicada em "CalculadoraTop", do projeto "Calculadoras".
		Scanner entrada = new Scanner(System.in);
		
		//Estrutura de repetição "while", para que enquanto a variável "z" for menor que 1, todo o código abaixo se repita. Esse laço de repetição está sendo usado
		//para permitir que o usuário consiga reutilizar a calculadora e prosseguir com seus cálculos sem a necessidade de executar o programa novamente.
		while (z < 1) {
		
		int forma;//Variável que guardará o valor correspondente à forma geométrica escolhida pelo usuário.
		double  x, y;//Variáveis que receberão as medidas exigidas para calcular a área das figuras geométricas.
		
		//Instanciando um objeto do tipo "Area" que se chamará "calculo", encarregado por chamar os métodos responsáveis por calcular a área das figuras geométricas.
		Area calculo = new Area();
		
		//Exibindo opções de formas geométricas das quais é possível calcular a área:
		System.out.println("Você deseja calcular a área de qual forma geométrica?");
		System.out.println("1. Quadrado");
		System.out.println("2. Triângulo");
		System.out.println("3. Retângulo");
		
		forma = entrada.nextInt(); //Atribuindo o valor inserido em "entrada" à variável "forma".
		
		
		if (forma == 1) {//Se "forma" for igual a 1, ou seja, se a forma escolhida pelo usuário for um quadrado, então o código abaixo será executado:
			System.out.println("Insira a medida, em metros, de qualquer um dos lados do quadrado: ");
			x = entrada.nextDouble();//Armazenando na variável "x" um valor do tipo "double", que representa a medida de qualquer um dos lados do quadrado.
			
			System.out.println("A área do quadrado é de " + calculo.calcularArea(x) + "m².");//Visto que só uma das "variantes" do método "calcularArea" tem a 
			//variável uma única variável do tipo "double" como seu único parâmetro, logo, o método a ser chamado será aquele com a fórmula que calcula a área
			//de um quadrado. O método está sendo chamado dentro de um SYSO, para que não só efetue o cálculo, mas também mostre na tela o resultado da operação.
			
			z++;
			
		} else if (forma == 2) {//Se "forma" for igual a 2, ou seja, se a forma escolhida pelo usuário for um triângulo, então o código abaixo será executado:
			System.out.println("Insira a medida, em metros, da base do triângulo: ");
			x = entrada.nextDouble();//Armazenando na variável "x" um valor do tipo "double", que representa a medida da base do triângulo.
			
			System.out.println("Insira a medida, em metros, da altura do triângulo: ");
			y = entrada.nextDouble();//Armazenando na variável "y" um valor do tipo "double", que representa a medida da altura do triângulo.
			
			System.out.println("A área do triângulo é de " + calculo.calcularArea(x, y) + "m².");//Chamando o único método "calcularArea" que leva duas variáveis
			//do tipo double como parâmetros, de modo a utilizar a fórmula de cálculo de área de triângulo.
			
			z++;

		} else if (forma == 3) {//Se "forma" for igual a 3, ou seja, se a forma escolhida pelo usuário for um retângulo, então o código abaixo será executado:
			System.out.println("Insira a medida, em metros, da largura do retângulo: ");
			x = entrada.nextFloat();//Armazenando na variável "x" um valor do tipo "float", que representa a medida da largura do retângulo.
			
			System.out.println("Insira a medida, em metros, da altura do retângulo: ");
			y = entrada.nextFloat();//Armazenando na variável "y" um valor do tipo "float", que representa a medida da altura do retângulo.
			
			System.out.println("A área do retângulo é de " + calculo.calcularArea(x, y) + "m².");//Chama-se o único método "calcularArea" que tem como parâmetro duas
			//variáveis do tipo "float", calculando a área da figura utilizando a fórmula correta. 
			
			z++;
			
		} else {//Se "forma" não corresponder a nenhuma das opções anteriores, será exibida uma mensagem dizendo que o usuário optou por uma
			//figura geométrica inválida, levando-o novamente para o menu de escolha de figura geométrica.
			System.out.println("Opção inválida, tente novamente.");
			z = 0;
		}

	}
	
	if (z != 0) {//Se a variável de controle for diferente de 0, ou seja, se o usuário selecionar uma figura geométrica válida, as ações abaixo serão aplicadas.
		//O usuário, após finalizar um cálculo, pode optar por continuar ou não realizando operações com a calculadora:
		System.out.println("Deseja continuar calculando? 1 - Sim | 2 - Não");
		int resposta = entrada.nextInt();//Entrada da resposta do usuário.
		
		if (resposta == 1) {//Se "resposta" for igual a 1, ou seja, se o usuário disser que sim, então a variável de controle passa a ser zero novamente,
		//voltando para o menu de escolha de figuras geométricas.
		z = 0;

		} else if (resposta == 2) {//Se "resposta" se igualar a 2, isto é, se o usuário disser que não, é acrescido +1 à variável de controle e encerra-se
		//o uso da calculadora.
			z++;
			System.out.println("Fim das contas.");
		}
		}
	}
}


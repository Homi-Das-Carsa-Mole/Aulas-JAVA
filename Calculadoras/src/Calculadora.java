
public class Calculadora {

	public static void main(String[] args) {
		
		//Criação das variáveis "n1" (número 1/primeiro número) e "n2" (número 2/segundo número), que representam os números que desejamos
		//utilizar para realizar cálculos:
		double n1 = 5;
		double n2 = 2;
		
		//Criação das variáveis que alojarão o resultado das operações matemáticas que fizermos:
		double resulS;
		double resulSub;
		double resulM;
		double resulD;

		resulS = n1 + n2; //Atribuindo a valor soma de n1 e n2 à variável "resulS". 
		System.out.println("O resultado da soma é: " + resulS); //Exibindo o resultado da soma através de um SYSO que exibe o valor contido em "resulS".
		
		resulSub = n1 - n2; //Atribuindo a valor subtração entre n1 e n2 à variável "resulSub".
		System.out.println("O resultado da subtração é: " + resulSub); //Exibindo o resultado da subtração através de um SYSO que exibe
		//o valor contido em "resulSub".
		
		resulM = n1 * n2; //Atribuindo a valor da multiplicação de n1 por n2 à variável "resulM". 
		System.out.println("O resultado da multiplicação é: " + resulM); //Exibindo o resultado da multiplicação através de um SYSO que exibe
		//o valor contido em "resulM".
		
		resulD = n1 / n2; //Atribuindo a valor da divisão de n1 por n2 à variável "resulD".
		System.out.println("O resultado da divisão é: " + resulD); //Exibindo o resultado da divisão através de um SYSO que exibe
		//o valor contido em "resulD".
		
		
	}

}

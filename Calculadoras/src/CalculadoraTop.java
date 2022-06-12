import java.util.Scanner; /*
"java.util" é um pacote do Java que contém diversas utilidades como que "pré-instaladas" no próprio Java e que apenas precisam ser importadas
para que façamos uso. A classe Scanner, a qual estamos importando para este projeto, é um exemplo de utilidade que o pacote "java.util" consegue nos oferecer.
O Scanner, de forma resumida, é uma classe que contém métodos responsáveis por viabilizar a leitura de informações que o teclado do usuário fornece para o console. Graças
ao Scanner, podemos, por exemplo, digitar um valor no console e atribuí-lo à uma variável no momento de execução do código.
*/

public class CalculadoraTop {

	public static void main(String[] args) {
		//Criação das variáveis que receberão os valores desejados pelo usuário com o objetivo de realizar um cálculo matemático:
		int n1, n2;
		
		String op = ""; //Variável do tipo String que guardará qual a operação matemática o usuário gostaria de utilizar: adição (+), subtração (-), multiplicação
		//(*) e divisão (/).
		int control = 0; //Variável de controle que será incrementada dentro das iterações de "op"
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Digite a operação desejada (+, -, *, /): ");
		op = entrada.nextLine();
		
		System.out.println("Digite o primeiro valor: ");
		n1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite o segundo valor: " );
		n2 = Integer.parseInt(entrada.nextLine());
		
		if(op.equals("+")) {
			System.out.println("O resultado da soma é: " + (n1 + n2));
			control++;
		}	
		if(op.equals("-")) {
			System.out.println("O resultado da subtração é: " + (n1 - n2));
			control++;
		}
		if(op.equals("*")) {
			System.out.println("O resultado da multiplicação é: " + (n1 * n2));
			control++;
		}
		if(op.equals("/")) {
			System.out.println("O resultado da divisão é: " + (n1 / n2));
			control++;
		}
		if(control == 0) {
			System.out.println("Operação inválida, tente novamente.");
		}
		}
		
	}


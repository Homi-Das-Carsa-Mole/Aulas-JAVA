import java.util.Scanner;//Scanner para a leitura de dados digitados no console.

//Calculadora que desenvolvemos com a professora Mayara. Conta com a função de escolha das operações desejadas.
public class CalculadoraTop {

	public static void main(String[] args) {
		
		//Instanciando o objeto "entrada" do tipo "Scanner", o qual armazenará os dados digitados pelo usuário no console
		Scanner entrada = new Scanner (System.in);
	
		int n1, n2 =0;//Variáveis "n1" e "n2" (número 1 e número 2) criadas para guardar e representar os valores que o usuário utilizar para realizar operações
		//matemáticas.
		String op = "";//Variável que alojará a operação escolhida pelo usuário.
		String escolha = "sim";//Variável que compõe o funcionamento da estrutura de repetição "while" 
		int control = 0;

		//Os códigos abaixo se assemelham aos desenvolvidos ao longo do projeto "CalculoDeArea" e já foram explicados. 
		while(escolha.equals("Sim") || escolha.equals("sim") || escolha.equals("S") || escolha.equals("s") ) {
			System.out.print("Digite a operação (+,-,/,*):");
			op = entrada.nextLine();

			//Definindo os valores
			System.out.print("Digite o primeiro valor:");
			n1 = Integer.parseInt(entrada.nextLine());

			System.out.print("Digite o segundo valor: ");
			n2 = Integer.parseInt(entrada.nextLine());
			
			if(op.equals("+")) {
				System.out.println("O resultado da soma é: " + (n1+n2));
				control++;
			} else if(op.equals("-")) {
				System.out.println("O resutlado da subtração é: " + (n1-n2) + " ou " + (n2-n1));
				control++;
			} else if(op.equals("*")) {
				System.out.println("O resultado da multiplicação é: " + (n1*n2));
				control++;
			} else if(op.equals("/")) {
				System.out.println("O resutlado da divisão é: " + (n1/n2) + " ou " + (n2/n1));
				control++;
			}else {
				System.out.println("Operação invalida!");
			}

			System.out.print("Deseja efetuar mais cálculos?");
			escolha = entrada.nextLine();
			System.out.println("________________________________________");
		}

		}
	}

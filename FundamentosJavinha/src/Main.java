import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		int x = 100;
		double y = 200;
		
		int a = 0;
		double b = 0;
		
		short z = (int) 10000;
		System.out.println(z);
		
		a = (int) y; //Casting Expl�cito: � necess�rio deixar expl�cito que se deseja passar o conte�do da vari�vel para outro tipo que n�o a suporta completamente (assume-se a responsabilidade da perca de dados).
		b = x; //Casting Impl�cito: � poss�vel passar o conte�do de uma vari�vel para outra.
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		
		int idadePessoa = 70;
		if (idadePessoa < 18) {
			System.out.println("Voc� n�o pode beber.");
		}
		else if (idadePessoa < 60) {
			System.out.println("Voc� pode beber � vontade, meu camaradis da cachacis.");
		}
		else {
			System.out.println("Volta pro asilo.");
		}
		
			System.out.println("Voc� tem " + idadePessoa + " anos.");
		*/
			
//			int num = 1;
//			
//			switch (num) {
//				case 1:
//					System.out.println("O seu n�mero � " + num + ".");
//					break;
//				case 2:
//					System.out.println("O seu n�mero � " + num + ".");
//					break;
//				case 3:
//					System.out.println("O seu n�mero � " + num + ".");
//					break;
//				case 4:
//					System.out.println("O seu n�mero � " + num + ".");
//					break;
//				case 5:
//					System.out.println("O seu n�mero � " + num + ".");
//					break;
//				}
//					
//				//O break impede que o restante do c�digo dentro do switch seja executado. Quando utilizado, ele sai do switch.
//					
//				int num2 = 5;
//				
//				switch (num) {
//					case 1:
//						System.out.println("O seu n�mero � " + num2 + ".");
//					case 2:
//						System.out.println("O seu n�mero � " + num2 + ".");
//					case 3:
//						System.out.println("O seu n�mero � " + num2 + ".");
//					case 4:
//						System.out.println("O seu n�mero � " + num2 + ".");
//					case 5:
//						System.out.println("O seu n�mero � " + num2 + ".");
//				}
					
				//Sem o break, ocorrer� uma repeti��o do c�digo. Apesar disso, n�o utilizar o break tamb�m pode ser �til em alguns casos.
				
//				int num3 = 8;
//				switch (num3) {
//					case 1:
//						System.out.println("Domingo");
//						break;
//					case 2:
//						System.out.println("Segunda");
//						break;
//					case 3:
//						System.out.println("Ter�a");
//						break;
//					case 4:
//						System.out.println("Quarta");
//						break;
//					case 5:
//						System.out.println("Quinta");
//						break;
//					case 6:
//						System.out.println("Sexta");
//						break;
//					case 7:
//						System.out.println("S�bado");
//						break;
//					default:
//						System.out.println("Esse n�mero n�o representa um dia da semana.");
//			}
				
//			char caractere = 'a';
//			
//			switch(caractere) {
//				case 'a':
//					System.out.println("O seu caractere � " + caractere + ".");
//					break;
//				case 'b':
//					System.out.println("O seu caractere � " + caractere + ".");
//					break;
//				default:
//					System.out.println("Valor inv�lido.");
//			}
			
//			String farol = "verde";
//			
//			switch (farol) {
//				case "verde":
//					System.out.println("SIGA.");
//					break;
//				case "amarelo":
//					System.out.println("ATEN��O.");
//					break;
//				case "vermelho":
//					System.out.println("PARE.");
//					break;
//				default:
//					System.out.println("Valor inv�lido.");
//			}
		
//			x = 0;
//			while(x < 10) {  //(x < 10) - Teste condicional, com resposta verdadeira ou falsa, 0 ou 1.
//				x = x + 1; // x++
//				System.out.println(x);
//			} 
			//Neste caso, � primeiro feito o teste condicional. Enquanto o teste condicional for verdadeiro, o c�digo dentro do while ser� executado.
			
//			x = 0;
//			do {
//				System.out.println(x);
//				x = x + 1;
//			} while (x < 10);
			//J� no "do while", � primeiro executado o c�digo e depois feito o teste condicional. Enquanto o valor do teste condicional atender a condi��o estipulada, o c�digo ser�  executado.
			
			for(int x=0; x <= 10; x++) { // (valor inicial; teste condicional; incremento)
				System.out.printf("2 x %d = %d%n", x, 2 * x);
			}
			
			//ou
			
			for(int x = 0; x <= 10; x++)
				System.out.println("2 x " + x + " = " + 2 * x);
			
			//Com inser��o de n�mero
				
			Scanner entrada = new Scanner (System.in);
			System.out.println("Insira um n�mero:");
			int y = entrada.nextInt();
			
			for(int x = 0; x <= 10; x++) {
				System.out.println(y + " x " + x + " = " + x*y);
			}
			
			
	}

}


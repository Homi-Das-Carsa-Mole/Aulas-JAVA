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
			
//			for(int x=0; x <= 10; x++) { // (valor inicial; teste condicional; incremento)
//				System.out.printf("2 x %d = %d%n", x, 2 * x);
//			}
			
			//ou
			
//			for(int x = 0; x <= 10; x++)
//				System.out.println("2 x " + x + " = " + 2 * x);
//			
//			//Com inser��o de n�mero
//				
//			Scanner entrada = new Scanner (System.in);
//			System.out.println("Insira um n�mero:");
//			int y = entrada.nextInt();
//			
//			for(int x = 0; x <= 10; x++) {
//				System.out.println(y + " x " + x + " = " + x*y);
//			}
			
//			int x1 = 3;
//			int y1 = 5;
//			int z1 = 7;
//			
//			System.out.println(x1);
//			System.out.println(y1);
//			System.out.println(z1);
//			System.out.println(); //Nesse caso, foi necess�rio criar um SYSO para a exibi��o do valor de cada uma das vari�veis. 
//			
			double x[] = {3.5, 5, 3, 5}; //As arrays, ou matrizes, permitem que sejam atribu�dos diversos valores para uma mesma vari�vel. As arrays s�o constru�das atrav�s do uso
			//de colchetes.
			
			for (int aux = 0; aux < x.length; aux++) { //Criamos um la�o de repeti��o onde o n�mero inicial do �ndice, representado pela vari�vel aux, � 0.
//			O �ndice ser� incrementado, recebendo +1, enquanto o valor do �ndice (aux) for menor que o n�mero de posi��es total da matriz que criamos.
//			A cada repeti��o ser� executado o c�digo abaixo, que exibe o valor inserido em cada posi��o/�ndice da matriz.
				System.out.println("Valor do �ndice " + aux + " = " + x[aux]);
			}
			
			String nome[] = {"Misael", "Neide", "Milton", "Gabriel"};
			
			for (int aux1 = 0; aux1 < nome.length; aux1++) {
				System.out.println(nome[aux1]);
				if (nome[aux1] == "Gabriel") {
					System.out.println("O �ndice do nome Gabriel � " + aux1);
				}
			}
			
			//� poss�vel criar matrizes vazias, sem cont�udo algum. Exemplo de como fazer:
			
			int[] arrayInt = new int[5]; //Aqui, constru�mos uma array do tipo inteiro. Ela ter� 5 posi��es que poder�o, futuramente, ser ocupadas com valores inteiros. No entanto,
			//no momento de cria��o, elas est�o vazias. O mesmo se d� com as matrizes abaixo.
			String[] arrayString = new String[4];
			double[] arrayDouble = new double[3];
			
			arrayInt[3] = 4; //Estamos atribuindo o valor 4 para a posi��o 3 da matriz.
			
			int[] numero = new int[6];
			Scanner teclado = new Scanner(System.in);
			
			for (int aux2 = 0; aux2 < numero.length; aux2++) {
				System.out.println("Digite um n�mero qualquer");
				numero[aux2] = teclado.nextInt();
			}
			for (int aux2 = 0; aux2 < numero.length; aux2++) {
				System.out.println("O �ndice do n�mero " + numero[aux2] + " � igual a " + aux2);
			}
			
			
			
			
			
	}

}


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
		
		a = (int) y; //Casting Explícito: É necessÃ¡rio deixar explÃ­cito que se deseja passar o conteÃºdo da variÃ¡vel para outro tipo que nÃ£o a suporta
		//completamente (assume-se a responsabilidade da perca de dados).
		b = x; //Casting ImplÃ­cito: Ã© possÃ­vel passar o conteÃºdo de uma variÃ¡vel para outra.
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		
		int idadePessoa = 70;
		if (idadePessoa < 18) {
			System.out.println("VocÃª nÃ£o pode beber.");
		}
		else if (idadePessoa < 60) {
			System.out.println("VocÃª pode beber Ã  vontade, meu camaradis da cachacis.");
		}
		else {
			System.out.println("Volta pro asilo.");
		}
		
			System.out.println("VocÃª tem " + idadePessoa + " anos.");
		*/
			
//			int num = 1;
//			
//			switch (num) {
//				case 1:
//					System.out.println("O seu nÃºmero Ã© " + num + ".");
//					break;
//				case 2:
//					System.out.println("O seu nÃºmero Ã© " + num + ".");
//					break;
//				case 3:
//					System.out.println("O seu nÃºmero Ã© " + num + ".");
//					break;
//				case 4:
//					System.out.println("O seu nÃºmero Ã© " + num + ".");
//					break;
//				case 5:
//					System.out.println("O seu nÃºmero Ã© " + num + ".");
//					break;
//				}
//					
//				//O break impede que o restante do cÃ³digo dentro do switch seja executado. Quando utilizado, ele sai do switch.
//					
//				int num2 = 5;
//				
//				switch (num) {
//					case 1:
//						System.out.println("O seu nÃºmero Ã© " + num2 + ".");
//					case 2:
//						System.out.println("O seu nÃºmero Ã© " + num2 + ".");
//					case 3:
//						System.out.println("O seu nÃºmero Ã© " + num2 + ".");
//					case 4:
//						System.out.println("O seu nÃºmero Ã© " + num2 + ".");
//					case 5:
//						System.out.println("O seu nÃºmero Ã© " + num2 + ".");
//				}
					
				//Sem o break, ocorrerÃ¡ uma repetiÃ§Ã£o do cÃ³digo. Apesar disso, nÃ£o utilizar o break tambÃ©m pode ser Ãºtil em alguns casos.
				
//				int num3 = 8;
//				switch (num3) {
//					case 1:
//						System.out.println("Domingo");
//						break;
//					case 2:
//						System.out.println("Segunda");
//						break;
//					case 3:
//						System.out.println("TerÃ§a");
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
//						System.out.println("SÃ¡bado");
//						break;
//					default:
//						System.out.println("Esse nÃºmero nÃ£o representa um dia da semana.");
//			}
				
//			char caractere = 'a';
//			
//			switch(caractere) {
//				case 'a':
//					System.out.println("O seu caractere Ã© " + caractere + ".");
//					break;
//				case 'b':
//					System.out.println("O seu caractere Ã© " + caractere + ".");
//					break;
//				default:
//					System.out.println("Valor invÃ¡lido.");
//			}
			
//			String farol = "verde";
//			
//			switch (farol) {
//				case "verde":
//					System.out.println("SIGA.");
//					break;
//				case "amarelo":
//					System.out.println("ATENÃ‡ÃƒO.");
//					break;
//				case "vermelho":
//					System.out.println("PARE.");
//					break;
//				default:
//					System.out.println("Valor invÃ¡lido.");
//			}
		
//			x = 0;
//			while(x < 10) {  //(x < 10) - Teste condicional, com resposta verdadeira ou falsa, 0 ou 1.
//				x = x + 1; // x++
//				System.out.println(x);
//			} 
			//Neste caso, Ã© primeiro feito o teste condicional. Enquanto o teste condicional for verdadeiro, o cÃ³digo dentro do while serÃ¡
			//executado.
			
//			x = 0;
//			do {
//				System.out.println(x);
//				x = x + 1;
//			} while (x < 10);
			//JÃ¡ no "do while", Ã© primeiro executado o cÃ³digo e depois feito o teste condicional. Enquanto o valor do teste condicional atender
			//a condiÃ§Ã£o estipulada, o cÃ³digo serÃ¡  executado.
			
//			for(int x=0; x <= 10; x++) { // (valor inicial; teste condicional; incremento)
//				System.out.printf("2 x %d = %d%n", x, 2 * x);
//			}
			
			//ou
			
//			for(int x = 0; x <= 10; x++)
//				System.out.println("2 x " + x + " = " + 2 * x);
//			
//			//Com inserÃ§Ã£o de nÃºmero
//				
//			Scanner entrada = new Scanner (System.in);
//			System.out.println("Insira um nÃºmero:");
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
//			System.out.println(); //Nesse caso, foi necessÃ¡rio criar um SYSO para a exibiÃ§Ã£o do valor de cada uma das variÃ¡veis. 
//			
//			double x[] = {3.5, 5, 3, 5}; //As arrays, ou matrizes, permitem que sejam atribuÃ­dos diversos valores para uma mesma variÃ¡vel.
//			//As arrays sÃ£o construÃ­das atravÃ©s do uso de colchetes.
//			
//			for (int aux = 0; aux < x.length; aux++) { //Criamos um laÃ§o de repetiÃ§Ã£o onde o nÃºmero inicial do Ã­ndice, representado pela variÃ¡vel
//			//"aux", Ã© 0.
////			O Ã­ndice serÃ¡ incrementado, recebendo +1, enquanto o valor do Ã­ndice (aux) for menor que o nÃºmero de posiÃ§Ãµes total da matriz
//			//que criamos.
////			A cada repetiÃ§Ã£o serÃ¡ executado o cÃ³digo abaixo, que exibe o valor inserido em cada posiÃ§Ã£o/Ã­ndice da matriz.
//				System.out.println("Valor do Ã­ndice " + aux + " = " + x[aux]);
//			}
//			
//			String nome[] = {"Misael", "Neide", "Milton", "Gabriel"};
//			
//			for (int aux1 = 0; aux1 < nome.length; aux1++) {
//				System.out.println(nome[aux1]);
//				if (nome[aux1] == "Gabriel") {
//					System.out.println("O Ã­ndice do nome Gabriel Ã© " + aux1);
//				}
//			}
//			
//			//Ã‰ possÃ­vel criar matrizes vazias, sem contÃ©udo algum. Exemplo de como fazer:
//			
//			int[] arrayInt = new int[5]; //Aqui, construÃ­mos uma array do tipo inteiro. Ela terÃ¡ 5 posiÃ§Ãµes que poderÃ£o, futuramente,
//			//ser ocupadas com valores inteiros. PorÃ©m, no momento de criaÃ§Ã£o, elas estÃ£o vazias. O mesmo se dÃ¡ com as matrizes abaixo.
//			String[] arrayString = new String[4];
//			double[] arrayDouble = new double[3];
//			
//			arrayInt[3] = 4; //Nessa linha atribui-se o valor 4 para a posiÃ§Ã£o 3 da matriz.
//			
//			int[] numero = new int[6];
//			Scanner teclado = new Scanner(System.in);
//			
//			for (int aux2 = 0; aux2 < numero.length; aux2++) {
//				System.out.println("Digite um nÃºmero qualquer");
//				numero[aux2] = teclado.nextInt();
//			}
//			for (int aux2 = 0; aux2 < numero.length; aux2++) {
//				System.out.println("O Ã­ndice do nÃºmero " + numero[aux2] + " Ã© igual a " + aux2);
//			}
			
		int[] arrayQualquer = new int[3];
			
			Object[] arrayObject = new Object[4];
			
			arrayObject[0] = "taaaaake oooooon meeeeeeee";
			arrayObject[1] = 12;
			arrayObject[2] = 13.7;
			arrayObject[3] = true;
			arrayObject[4] = arrayQualquer;
			
			for (int aux2 = 0; aux2 < arrayObject.length; aux2++) {
				System.out.println("índice" + aux2 + " = " + arrayObject[aux2]);
				
			}
			
			int[][] arrayBidirecional = new int[3][3];
			
			for (int linha = 0; linha < arrayBidirecional.length; linha++) {
				for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {
					System.out.print("Índice [" + linha + "][" + coluna + "] = " + arrayBidirecional[linha][coluna] + "");
				}
				System.out.println();
			}
			
			
			
			
	}

}


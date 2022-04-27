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
		
		a = (int) y; //Casting Explícito: é necessário deixar explícito que se deseja passar o conteúdo da variável para outro tipo que não a suporta completamente (assume-se a responsabilidade da perca de dados).
		b = x; //Casting Implícito: é possível passar o conteúdo de uma variável para outra.
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		
		int idadePessoa = 70;
		if (idadePessoa < 18) {
			System.out.println("Você não pode beber.");
		}
		else if (idadePessoa < 60) {
			System.out.println("Você pode beber à vontade, meu camaradis da cachacis.");
		}
		else {
			System.out.println("Volta pro asilo.");
		}
		
			System.out.println("Você tem " + idadePessoa + " anos.");
		*/
			
//			int num = 1;
//			
//			switch (num) {
//				case 1:
//					System.out.println("O seu número é " + num + ".");
//					break;
//				case 2:
//					System.out.println("O seu número é " + num + ".");
//					break;
//				case 3:
//					System.out.println("O seu número é " + num + ".");
//					break;
//				case 4:
//					System.out.println("O seu número é " + num + ".");
//					break;
//				case 5:
//					System.out.println("O seu número é " + num + ".");
//					break;
//				}
//					
//				//O break impede que o restante do código dentro do switch seja executado. Quando utilizado, ele sai do switch.
//					
//				int num2 = 5;
//				
//				switch (num) {
//					case 1:
//						System.out.println("O seu número é " + num2 + ".");
//					case 2:
//						System.out.println("O seu número é " + num2 + ".");
//					case 3:
//						System.out.println("O seu número é " + num2 + ".");
//					case 4:
//						System.out.println("O seu número é " + num2 + ".");
//					case 5:
//						System.out.println("O seu número é " + num2 + ".");
//				}
					
				//Sem o break, ocorrerá uma repetição do código. Apesar disso, não utilizar o break também pode ser útil em alguns casos.
				
//				int num3 = 8;
//				switch (num3) {
//					case 1:
//						System.out.println("Domingo");
//						break;
//					case 2:
//						System.out.println("Segunda");
//						break;
//					case 3:
//						System.out.println("Terça");
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
//						System.out.println("Sábado");
//						break;
//					default:
//						System.out.println("Esse número não representa um dia da semana.");
//			}
				
//			char caractere = 'a';
//			
//			switch(caractere) {
//				case 'a':
//					System.out.println("O seu caractere é " + caractere + ".");
//					break;
//				case 'b':
//					System.out.println("O seu caractere é " + caractere + ".");
//					break;
//				default:
//					System.out.println("Valor inválido.");
//			}
			
//			String farol = "verde";
//			
//			switch (farol) {
//				case "verde":
//					System.out.println("SIGA.");
//					break;
//				case "amarelo":
//					System.out.println("ATENÇÃO.");
//					break;
//				case "vermelho":
//					System.out.println("PARE.");
//					break;
//				default:
//					System.out.println("Valor inválido.");
//			}
		
//			x = 0;
//			while(x < 10) {  //(x < 10) - Teste condicional, com resposta verdadeira ou falsa, 0 ou 1.
//				x = x + 1; // x++
//				System.out.println(x);
//			} 
			//Neste caso, é primeiro feito o teste condicional. Enquanto o teste condicional for verdadeiro, o código dentro do while será executado.
			
//			x = 0;
//			do {
//				System.out.println(x);
//				x = x + 1;
//			} while (x < 10);
			//Já no "do while", é primeiro executado o código e depois feito o teste condicional. Enquanto o valor do teste condicional atender a condição estipulada, o código será  executado.
			
			for(int x=0; x <= 10; x++) { // (valor inicial; teste condicional; incremento)
				System.out.printf("2 x %d = %d%n", x, 2 * x);
			}
			
			//ou
			
			for(int x = 0; x <= 10; x++)
				System.out.println("2 x " + x + " = " + 2 * x);
			
			//Com inserção de número
				
			Scanner entrada = new Scanner (System.in);
			System.out.println("Insira um número:");
			int y = entrada.nextInt();
			
			for(int x = 0; x <= 10; x++) {
				System.out.println(y + " x " + x + " = " + x*y);
			}
			
			
	}

}


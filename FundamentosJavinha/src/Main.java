import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		int x = 100; //Variável "x" do tipo "int", isto é, inteiro (sem casas decimais).
		double y = 200; //Variável "y" do tipo "double", o qual faz parte da família dos Reais, contendo casas decimais.
		
		//Existem outros tipos primitivos de variáveis numéricas, como o "float". O float - ponto flutuante - assim como o double, também faz parte da 
		//família dos Reais. Tanto float quanto int conseguem comportar até 4 bytes de dados, enquanto o tipo double, como o próprio nome já diz, comporta
		//o *dobro* - até 8 bytes de dados.
		
		//Inicializando as variáveis "a" e "b" por definir um valor para elas:
		int a = 0; 
		double b = 0;
		
		short z = (int) 10000; //Variável "short" compõe a família dos inteiros, e suporta até 2 bytes de dados. O número máximo que essa variável é capaz de
		//conter é 32.767 (trinta e dois mil setecentos e sessenta e sete).
		
		//Resumo dos tipos primitivos de variáveis:
		
		//boolean - Família: Lógico / Tamanho: 1 bit / Exemplo: true
		//char - Família: Literais / Tamanho: 1 byte / Exemplo: 'A'
		//String - Família: Literais / Tamanho: 1 byte/cada / Exemplo: "Rafaelegal"
		//byte - Família: Inteiros / Tamanho: 1 byte / Exemplo: 127
		//short - Família: Inteiros / Tamanho: 2 bytes / Exemplo: 32 767
		//int - Família: Inteiros / Tamanho: 4 bytes / Exemplo: 2 147 483
		//long - Família: Inteiros / Tamanho: 8 bytes / Exemplo: 2^63
		//float - Família: Reais / Tamanho: 4 bytes / Exemplo: 3.4^+38
		//double - Família: Reais / Tamanho: 8 bytes / Exemplo: 1.8e^+308
		
		
		System.out.println(z);
		
		a = (int) y; //Exemplo de Casting Explícito. Nesse tipo de Casting é necessário deixar explícito que se deseja passar o conteúdo da variável
		//de um tipo de capacidade de armazenamento maior, no caso uma variável do tipo "double", para outro tipo que não a comporta/suporta completamente,
		que nesse caso é a variável "a" do tipo "int". No Casting Explícito assume-se a responsabilidade da perca de dados.
		b = x; //Exemplo de Casting Implícito. Nesse tipo de Casting ocorre, de forma implícita a conversão do valor de uma variável de um tipo capacidade
		//de armazenamento menor para outra variável de capacidade maior.
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		
		
		int idadePessoa = 70;
		
		//Teste condicional IF. O "if" (se) nos permite definir uma condição e, *se* ela for atendida, uma linha de códigos será executada.
		if (idadePessoa < 18) { //Se uma pessoa tiver menos que 18 anos de idade, será exibida uma mensagem dizendo que ela ainda não pode ingerir
		//bebidas alcoólicas.
			System.out.println("Você não pode beber.");
		}
		//Se queremos adicionar mais de um teste condicional para ser testado, "um novo caminho", podemos fazer uso do "else if", também conhecido 
		//como "senão se". Essa é uma forma de aninhamento de "if's"/testes condicionais.
		//O teste condicional abaixo será realizado em caso do anterior não se mostrar uma verdade.
		else if (idadePessoa < 60) { //Agora determinamos que se uma pessoa tiver menos que 60 anos de idade, ela poderá fazer a ingestão de bebidas alcoólicas. 
		//Ao mesmo tempo, por conta do teste condicional anterior, apenas aqueles com idade entre 18 e 60 anos estão habilitados pela lei para beber álcool. 
			System.out.println("Você pode beber à vontade, meu camaradis da cachacis.");
		}
		else { //O "else" (senão) tem como função executar outra linha de comando se nenhuma das condições definidas anteriormente for atendida.
		//Nesse caso, o "else" determina que aqueles que tiverem de 60 anos para cima precisam voltar para o asilo.
			System.out.println("Volta pro asilo.");
		}
			
			//O SYSO abaixo tem a finalidade de mostrar o valor da variável "idadePessoa" em meio a um texto. A junção de textos com o valor de variáveis se dá
			//através do uso do sinal "+". Esse tipo de ligação leva o nome de concatenação.
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
//				//O break impede que o restante do código dentro do switch seja executado.
				//Quando utilizado, ele sai do switch.
//					
//				int num2 = 5;
//				
//				switch (num2) {
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
			//Já no "do while", é primeiro executado o código e depois feito o teste condicional. Enquanto o valor do teste condicional atender
			//à condição estipulada, o código será executado.
			
//			for(int x=0; x <= 10; x++) { // (valor inicial; teste condicional; incremento)
//				System.out.printf("2 x %d = %d%n", x, 2 * x);
//			}
			
			//ou
			
//			for(int x = 0; x <= 10; x++)
//				System.out.println("2 x " + x + " = " + 2 * x);
//			
//			//Com inserção de número
//				
//			Scanner entrada = new Scanner (System.in);
//			System.out.println("Insira um número:");
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
//			System.out.println(); //Nesse caso, foi necessário criar um SYSO para a exibição do valor de cada uma das variáveis. 
//			
//			double x[] = {3.5, 5, 3, 5}; //As arrays, ou matrizes, permitem que sejam atribuídos diversos valores para uma mesma variável.
//			//As arrays são construídas através do uso de colchetes.
//			
//			for (int aux = 0; aux < x.length; aux++) { //Criamos um laço de repetição onde o número inicial do índice, representado pela variável
//			//"aux", é 0.
//			//O índice será incrementado, recebendo +1, enquanto o valor do índice (aux) for menor que o número de posições total da matriz
//			//que criamos.
//			//A cada repetição será executado o código abaixo, que exibe o valor inserido em cada posição/índice da matriz.
//				System.out.println("Valor do índice " + aux + " = " + x[aux]);
//			}
//			
//			String nome[] = {"Misael", "Neide", "Milton", "Gabriel"};
//			
//			for (int aux1 = 0; aux1 < nome.length; aux1++) {
//				System.out.println(nome[aux1]);
//				if (nome[aux1] == "Gabriel") {
//					System.out.println("O índice do nome Gabriel é " + aux1);
//				}
//			}
//			
//			//É possível criar matrizes vazias, sem conteúdo algum. Exemplo de como fazer:
//			
//			int[] arrayInt = new int[5]; //Aqui, construímos uma array do tipo inteiro. Ela terÃ¡ 5 posiÃ§Ãµes que poderÃ£o, futuramente,
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


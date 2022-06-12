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
			//O "switch case", que conhecemos como "Escolha Caso" é uma estrutura de decisão condicional. Ele se assemelha a estrutura condicional "if-else-if",
			//já que ele compara o valor da variável que colocarmos dentro do parâmetro do "switch" com todos os casos que definimos como possíveis.
//			switch (num) {
//				case 1: //Caso o valor da variável "num" seja 1, o bloco de códigos desse "case" será executado.
//					System.out.println("O seu número é " + num + ".");
//					break; //O break impede que o restante do código dentro do switch seja executado. Dessa forma, a comparação do valor da variável
					//"num" com os outros "cases" abaixo será interrompida, *quebrada*, como o nome "break" sugere. Em outras palavras, quando usamos o
					//break, saímos do "switch-case" e avançamos para a execução dos códigos fora dessa estrutura.
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
//				
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
					//Sem o break, ocorrerá uma repetição do código. Apesar disso, não utilizar o break também pode ser útil em alguns casos.
//				}
					
				
				
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
//					default: //O "default" serve para que, caso o valor da variável "num3" não se enquadre em nenhum dos casos acima, seja executado
					//um código-padrão, nesse caso, uma mensagem na tela que diz que o valor de "num3" não representa um dia da semana.
//						System.out.println("Esse número não representa um dia da semana.");
//			}
				
		
		//A estrutura "switch-case" pode receber diversos tipos de variáveis. Abaixo estão alguns exemplos.
		
			//SWITCH-CASE COM CHAR
	
//			char caractere = 'a'; //Variáveis do tipo "char" suportam apenas um caractere, se diferenciando de String, que recebe um *conjunto* de caracteres.
			//Ao usar "char", definimos o valor da variável dentro de aspas simples.
//			
			//Caso a variável "caractere" seja igual a 'a', o bloco de código de "case 'a'" será executado.
			//Caso a variável "caractere" seja igual a 'b', o bloco de código de "case 'b'" será executado.
			//Caso a variável "caractere" não se iguale a nenhum dos valores estipulados acima, 'a' ou 'b', o bloco de código de "default" será executado.
//			switch (caractere) {
//				case 'a':
//					System.out.println("O seu caractere é " + caractere + ".");
//					break;
//				case 'b':
//					System.out.println("O seu caractere é " + caractere + ".");
//					break;
//				default:
//					System.out.println("Valor inválido.");
//			}
			
			//SWITCH-CASE COM STRING
//			String farol = "verde"; //O conjunto de caracteres atribuídos a uma variável do tipo String deve estar dentro de aspas duplas.
//			
			//Caso o valor de "farol" seja "verde", então a ordem impressa na tela será "SIGA."
			//Caso o valor de "farol" seja "amarelo", então a ordem impressa na tela será "ATENÇÃO."
			//Caso o valor de "farol" seja "verde", então a ordem impressa na tela será "PARE."
			//Caso o valor de "farol" não se iguale a "verde", "amarelo" ou "vermelho", então será impressa uma mensagem na tela que dizendo que o valor
			//inserido na variável "farol" é classificado como inválido.
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
		
			//Laço de repetição "while", o qual conhecemos como "Enquanto".
			//Esse laço de repetição exige a inserção de um teste condicional e, *enquanto* este teste for uma verdade, um bloco de comandos será
			//executado. Normalmente, utilizamos o "while" quando não sabemos quantas vezes determinado bloco de códigos precisa ser executado.
		
//			while(x < 10) {  //(x < 10) -> Teste condicional, com resposta verdadeira ou falsa. Enquanto "x" for menor que 10, o código abaixo será
			//executado, incrementando +1 a "x" e depois mostrando, por meio de um SYSO, qual o valor de "x" após ser incrementado. Quando "x" for igual
			//a 10, o código deixará de ser executado.
//				x = x + 1; // x++ //"x++" é um incremento, e tem a função de somar +1 à variável que antecede o sinal de "++". Dentro de uma estrutura de
				//repetição, o "++" aumenta o valor de uma variável de um em um (isto é, a incrementa) a cada loop, o que garante, nesse caso, que em algum
				//momento alcancemos o valor mínimo para sairmos do laço de repetição.
//				System.out.println(x);
//			} 
		
			//Reforçando: No "while" é primeiro feito o teste condicional. Enquanto o teste condicional for verdadeiro, o código dentro do while será executado.
			
			//Já no "do-while", é primeiro executado o código e depois feito o teste condicional. Enquanto o valor do teste condicional atender
			//à condição estipulada, o código será executado.
//			x = 0;
//			do {
//				System.out.println(x);
//				x = x + 1;
//			} while (x < 10);
			
			
			//TABUADA DO DOIS
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
			
		
		//ARRAYS:
		
//			int x1 = 3;
//			int y1 = 5;
//			int z1 = 7;
//			
//			System.out.println(x1);
//			System.out.println(y1);
//			System.out.println(z1);
//			System.out.println(); //Foi necessário criar um SYSO para a exibição do valor de cada uma das variáveis. Isso poderia ser facilmente evitado
			//por fazer uso de uma array.
//			
		//CRIANDO UMA ARRAY: 
		
//			double x[] = {3.5, 5, 7, 4}; 
		
			//Uma array, isto é, uma matriz, permite que diversos valores do tipo double sejam armazenados numa única variável, cada valor sendo alojado em uma
			//posição diferente dessa matriz, formando como que uma tabela de dados.
			//A forma como construímos a array acima, a array "x", permite inserirmos em meio às chaves os valores que serão guardados em cada posição.
			//A array "x" tem um total de 4 posições, as quais são contadas a partir do número 0, indo até o número 3, nesse caso. A seguir é possível
			//entender melhor a construção dessa array:
		
		//Na posição 0 está o número 3.5;
		//Na posição 1 está o número 5;
		//Na posição 2 está o número 7;
		//Na posição 3 está o número 4.
		//Total de 4 posições, também conhecidas por "índices". O número de posições/índices que uma array terá é o que definirá o seu tamanho.
//			
//			
			//ITERAÇÃO - FAZENDO REPETIDAS PASSAGENS PELA ARRAY "x":
//			for (int aux = 0; aux < x.length; aux++) { //Criamos um laço de repetição onde o número inicial do índice, representado pela variável
//			//"aux", é 0.
//			//O índice será incrementado, recebendo +1, enquanto o valor do índice (aux) for menor que o número de posições total da matriz que criamos,
			//realizando repetições até que "aux" ultrapasse o tamanho da array, representado por "x.lenght".
//			//A cada repetição será executado o código abaixo, que exibe o valor inserido em cada posição/índice da matriz. Todo esse procedimento, onde
			//geralmente se faz uso do "for", é chamado de "iteração", que significa "repetir/fazer de novo".
//				System.out.println("Valor do índice " + aux + " = " + x[aux]);
//			}
//			
//			String nome[] = {"Misael", "Neide", "Milton", "Gabriel"};
//			
			//ITERAÇÃO SOBRE A ARRAY "NOME":
//			for (int aux1 = 0; aux1 < nome.length; aux1++) {
//				System.out.println(nome[aux1]);
//				if (nome[aux1] == "Gabriel") {
//					System.out.println("O índice do nome Gabriel é " + aux1);
//				}
//			}
//			
//			//É possível criar matrizes vazias, sem conteúdo algum, informando somente a quantidade de posições que elas terão. Exemplo de como fazer:
//			
//			int[] arrayInt = new int[5]; //Aqui, construímos uma array do tipo "int". Ela tem em seu índice o número 5, indicando que terá 5 posições que poderão,
			//futuramente, ser ocupadas com 5 valores de tipo inteiro, porém, no momento de criação, elas estão vazias. O mesmo se dá com as matrizes abaixo.
//			String[] arrayString = new String[4]; //Instância de uma array do tipo String, chamada "arrayString", e que comporta até 4 valores que também
			//sejam do tipo String. 
//			double[] arrayDouble = new double[3]; //Instância de uma array do tipo double, chamada "arrayDouble", e que comporta até 3 valores que também 
			//sejam do tipo double.
		
//			arrayInt[3] = 4; //Nessa linha atribui-se o valor 4 para a posição 3 da matriz.
//			
//			int[] numero = new int[6];
//			Scanner teclado = new Scanner(System.in);
//			
//			for (int aux2 = 0; aux2 < numero.length; aux2++) { //Atribuindo para cada índice (aux2) da array "numero" o valor "int" que desejarmos até alcançarmos
			//o tamanho máximo dessa array, que é de 6 posições, contadas de 0 a 5.
//				System.out.println("Digite um número qualquer");
//				numero[aux2] = teclado.nextInt();
//			}
//			for (int aux2 = 0; aux2 < numero.length; aux2++) {
//				System.out.println("O índice do número " + numero[aux2] + " é igual a " + aux2);
//			}
			
		int[] arrayQualquer = new int[3];
			
			Object[] arrayObject = new Object[5]; //Uma array do tipo "Object" consegue comportar em suas posições qualquer tipo de variável e até mesmo outros
			//arrays, haja vista que "Object" é a superclasse que estende todas as outras classes existentes no Java. A superclasse "Object" é, por assim dizer,
			//a classe "Deus" do Java, que originou todas as outras classes que conhecemos.
			
			arrayObject[0] = "COMO DESLIGA O CAPS LOCK?!?!?!?!?!?!?!?!?!?";
			arrayObject[1] = 12;
			arrayObject[2] = 13.7;
			arrayObject[3] = true;
			arrayObject[4] = arrayQualquer;
			
			//ITERAÇÃO:
			for (int aux2 = 0; aux2 < arrayObject.length; aux2++) {
				System.out.println("índice" + aux2 + " = " + arrayObject[aux2]); //Mostrando quais os valores contidos em cada índice da array.
				
			}
		
			System.out.println();
			
			//CRIANDO ARRAY BIDIRECIONAL:
			int[][] arrayBidirecional = new int[4][3]; //Array bidirecional do tipo "int", onde o primeiro par de colchetes representa o índice de linhas,
			//enquanto o segundo par se refere ao índice de colunas.
		
			arrayBidirecional[0][2] = 3; //Aqui, indicamos que no ponto onde a linha 0 e a coluna 2 se encontram está posicionado o número 3 (lembrando de
			//contar tanto as linhas quanto as colunas a partir do 0).
			arrayBidirecional[2][2] = 5; //O número 5 está posicionado no ponto onde linha 2 e coluna 3 se interceptam.

			//ITERANDO SOBRE UMA ARRAY BIDIRECIONAL:
			for (int linha = 0; linha < arrayBidirecional.length; linha++) {//Se refere ao índice de linhas.
				for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {//Se refere ao índice de colunas.
					System.out.print("Índice [" + linha + "][" + coluna + "] = " + arrayBidirecional[linha][coluna] + " | ");
				}
				System.out.println();
			}
			
			
			
			
	}

}


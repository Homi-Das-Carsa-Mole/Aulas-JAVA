import java.util.Scanner;

public class DiferencaDeSalarios {

	public static void main(String[] args) {
		
		System.out.println("DIFEREN�A ENTRE SAL�RIOS");
		
		Scanner entrada = new Scanner(System.in);
		
			Pessoa pessoa1 = new Pessoa();
			
			System.out.println("Digite o nome do primeiro funcion�rio:");
			pessoa1.nome = entrada.next();
			
			System.out.println("Digite o sal�rio do primeiro funcion�rio:");
			pessoa1.salario = entrada.nextDouble();
			
			Pessoa pessoa2 = new Pessoa();
			
			System.out.println("Digite o nome do segundo funcion�rio:");
			pessoa2.nome = entrada.next();
			
			System.out.println("Digite o sal�rio do segundo funcion�rio:");
			pessoa2.salario = entrada.nextDouble();
			
			System.out.println("A diferen�a de sal�rio entre " + pessoa1.nome + " e " + pessoa2.nome + " � de R$" + (pessoa1.salario - pessoa2.salario));

	}

}

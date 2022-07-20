import java.util.Scanner;

public class DiferencaDeSalarios {

	public static void main(String[] args) {
		
		System.out.println("DIFERENÇA ENTRE SALÁRIOS");
		
		Scanner entrada = new Scanner(System.in);
		
			Pessoa pessoa1 = new Pessoa();
			
			System.out.println("Digite o nome do primeiro funcionário:");
			pessoa1.nome = entrada.next();
			
			System.out.println("Digite o salário do primeiro funcionário:");
			pessoa1.salario = entrada.nextDouble();
			
			Pessoa pessoa2 = new Pessoa();
			
			System.out.println("Digite o nome do segundo funcionário:");
			pessoa2.nome = entrada.next();
			
			System.out.println("Digite o salário do segundo funcionário:");
			pessoa2.salario = entrada.nextDouble();
			
			System.out.println("A diferença de salário entre " + pessoa1.nome + " e " + pessoa2.nome + " é de R$" + (pessoa1.salario - pessoa2.salario));

	}

}

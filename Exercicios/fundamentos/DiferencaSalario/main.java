package DiferencaSalario;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("DIFEREN�A ENTRE SAL�RIOS");
		System.out.println("EMPRESA - A� COMIDA BOA");
		
		Scanner entrada = new Scanner(System.in);
		
		for (int cadastros = 0; cadastros <= 1; cadastros++) {
		
			Pessoa pessoa = new Pessoa();
			pessoa.setCargo(new Cargo());
			
			System.out.println("Digite o nome do funcion�rio:");
			pessoa.setNome(entrada.next());
			
			System.out.println("Digite a idade do funcion�rio");
			pessoa.setIdade(entrada.nextInt());
			
			System.out.println("Digite o CPF do funcion�rio:");
			pessoa.setCpf(entrada.next());
			
			System.out.println("Digite o nome do cargo que o funcion�rio ocupa na empresa:");
			pessoa.getCargo();
			
			System.out.println("Digite o sal�rio do funcion�rio:");
			pessoa.getCargo().setSalario(entrada.nextDouble());
			
			
		}
	}
}

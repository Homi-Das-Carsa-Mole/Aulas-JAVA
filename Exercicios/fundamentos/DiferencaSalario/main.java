package DiferencaSalario;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("DIFERENÇA ENTRE SALÁRIOS");
		System.out.println("EMPRESA - AÔ COMIDA BOA");
		
		Scanner entrada = new Scanner(System.in);
		
		for (int cadastros = 0; cadastros <= 1; cadastros++) {
		
			Pessoa pessoa = new Pessoa();
			pessoa.setCargo(new Cargo());
			
			System.out.println("Digite o nome do funcionário:");
			pessoa.setNome(entrada.next());
			
			System.out.println("Digite a idade do funcionário");
			pessoa.setIdade(entrada.nextInt());
			
			System.out.println("Digite o CPF do funcionário:");
			pessoa.setCpf(entrada.next());
			
			System.out.println("Digite o nome do cargo que o funcionário ocupa na empresa:");
			pessoa.getCargo();
			
			System.out.println("Digite o salário do funcionário:");
			pessoa.getCargo().setSalario(entrada.nextDouble());
			
			
		}
	}
}

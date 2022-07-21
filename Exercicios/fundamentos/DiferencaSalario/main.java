package DiferencaSalario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		System.out.println("DIFERENÇA ENTRE SALÁRIOS");
		System.out.println("EMPRESA - AÔ COMIDA BOA");
		
		List <Pessoa> listaDeFuncionariosEscrita = new ArrayList <Pessoa>();
		List <Pessoa> listaDeFuncionariosLeitura = new ArrayList <Pessoa>();
		
		Scanner entrada = new Scanner(System.in);
		
		for (int cadastros = 0; cadastros <= 1; cadastros++) {
		
			Pessoa pessoa = new Pessoa();
			
			System.out.println("Digite o nome do funcionário:");
			pessoa.setNome(entrada.next());
			
			System.out.println("Digite a idade do funcionário");
			pessoa.setIdade(entrada.nextInt());
			
			System.out.println("Digite o CPF do funcionário:");
			pessoa.setCpf(entrada.next());
			
			int opcao = 0;
			while (opcao < 1 || opcao > 4) {
				System.out.println("Digite o nome do cargo que o funcionário ocupa na empresa:");
				System.out.println("Cargos: 1. Gerente | 2. Abatedor de mato | 3. Degustador cobaia | 4. Vendedor de curso sobre como ser vegetariano");
				opcao = entrada.nextInt();
				if (opcao == 1) {
					pessoa.setCargo(Cargo.GERENTE);
				} else if (opcao == 2) {
					pessoa.setCargo(Cargo.ABATEDOR_DE_MATO);
				} else if (opcao == 3) {
					pessoa.setCargo(Cargo.DEGUSTADOR_COBAIA);
				} else if (opcao == 4) {
					pessoa.setCargo(Cargo.VENDEDOR_DE_CURSO_SOBRE_COMO_SER_VEGETARIANO);
				} else {
					System.out.println("Cargo não encontrado. Tente novamente.");
				}
			}
			
			listaDeFuncionariosEscrita.add(pessoa);
			
		}
		
		System.out.println("Comparação de salários:");
		
		if (listaDeFuncionariosEscrita.get(0).cargo.getValor() > listaDeFuncionariosEscrita.get(1).cargo.getValor()) {
			System.out.println("O salário de " + listaDeFuncionariosEscrita.get(0).getNome() + " é R$" + listaDeFuncionariosEscrita.get(0).getCargo().getValor());
			System.out.println("Já o salário de " + listaDeFuncionariosEscrita.get(1).getNome() + " é R$" + listaDeFuncionariosEscrita.get(1).getCargo().getValor());
			System.out.println("A diferença entre os salários é de R$" + (listaDeFuncionariosEscrita.get(0).cargo.getValor() - listaDeFuncionariosEscrita.get(1).cargo.getValor()));
		} else if (listaDeFuncionariosEscrita.get(0).cargo.getValor() < listaDeFuncionariosEscrita.get(1).cargo.getValor()){
			System.out.println("O salário de " + listaDeFuncionariosEscrita.get(1).getNome() + " é R$" + listaDeFuncionariosEscrita.get(0).cargo.getValor());
			System.out.println("Já o salário de " + listaDeFuncionariosEscrita.get(0).getNome() + " é R$" + listaDeFuncionariosEscrita.get(0).getCargo().getValor());
			System.out.println("A diferença entre os salários é de R$" + (listaDeFuncionariosEscrita.get(1).cargo.getValor() - listaDeFuncionariosEscrita.get(0).cargo.getValor())) ;
		} else {
			System.out.println("Os salários são iguais.");
		}
		
		
	}
}

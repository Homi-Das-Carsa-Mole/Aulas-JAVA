package mediaSalarialv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List<Funcionarios> listaDeFuncionarios = new ArrayList<Funcionarios>();

		double salarios = 0;
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("SISTEMA DE CADASTRO DE FUNCIONARIOS E CALCULO DE MEDIA SALARIAL");
		System.out.println("----------------------------------------------------------------");
		System.out.println("Por favor, digite quantos funcionarios voce deseja cadastrar:");
		int qtde = entrada.nextInt();

		for (int cadastros = 1; cadastros <= qtde; cadastros++) {

			Funcionarios funcionario = new Funcionarios();

			System.out.println("Digite o nome do(a) funcionario(a): ");
			funcionario.setNome(entrada.next());

			System.out.println("Digite o CPF do(a) funcionario(a): ");
			funcionario.setCpf(entrada.next());

			int opcao = 0;
			while (opcao != 1 && opcao != 2) {
				System.out.println("Digite o sexo do(a) funcionario(a): ");
				System.out.println("1. MASCULINO | 2. FEMININO");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					funcionario.setSexo(Sexo.MASCULINO);
				} else if (opcao == 2) {
					funcionario.setSexo(Sexo.FEMININO);
				} else {
					System.out.println("Valor inexistente. Tente novamente.");
				}
			}
			
			System.out.println("Informe o cargo do(a) funcionario(a): ");
			funcionario.setCargo(entrada.next());

			System.out.println("Informe o salario do(a) funcionario(a): ");
			funcionario.setSalario(entrada.nextDouble());

			salarios += funcionario.getSalario();
			listaDeFuncionarios.add(funcionario);

		}
		
		System.out.println("Lista de funcionarios cadastrados: ");

		for (Funcionarios funcio : listaDeFuncionarios) {
			
			System.out.println(funcio.toString());
		}

		System.out.println("A empresa possui " + qtde + " funcionarios.");
		System.out.println("A media salarial da empresa eh de R$" + salarios / qtde + ".");

	}

}

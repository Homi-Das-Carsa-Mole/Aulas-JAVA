package MediaSalarial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List<Funcionarios> listaDeFuncionarios = new ArrayList<Funcionarios>();
		
		double salarios = 0;

		System.out.println("Sistema de cadastro de funcionários e cálculo de média salarial.");
		System.out.println("Por favor, digite quantos funcionários você deseja cadastrar:");
		int qtde = entrada.nextInt();

		for (int cadastros = 1; cadastros <= qtde; cadastros++) {
			
			Funcionarios funcionario = new Funcionarios();
			
			System.out.println("Digite o nome do(a) funcionário(a): ");
			funcionario.setNome(entrada.next());

			System.out.println("Digite o CPF do(a) funcionário(a): ");
			funcionario.setCpf(entrada.next());

			int opcao = 0;
			while (opcao != 1 && opcao != 2) {
				System.out.println("Digite o sexo do(a) funcionário(a): ");
				System.out.println("1. MASCULINO | 2. FEMININO");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					funcionario.setSexo(Sexo.MASCULINO);
				} else if (opcao == 2) {
					funcionario.setSexo(Sexo.FEMININO);
				} else {
					System.out.println("Opção inválida. Tente novamente.");
				}
			}
			
			int opcao2 = 0;
			while (opcao2 < 1 || opcao2 > 7) {

				System.out.println("Informe o cargo do(a) funcionário(a):");
				System.out.println("1. GERENTE | 2. OPERADOR DE MÁQUINAS | 3. OPERADOR DE TELEMARKETING");
				System.out.println(
						"4. KUDOIRISTA | 5. PALHAÇ‡O | 6. SONOPLASTA DO RATINHO | 7. VENDEDOR DE BOMBAS ATÔ”MICAS");
				
				opcao2 = entrada.nextInt();

				switch (opcao2) {
				case 1:
					funcionario.setCargo(Cargo.GERENTE);
					funcionario.setSalario(Cargo.GERENTE);
					System.out.println("O salário deste cargo é de R$" + funcionario.getSalario());
					break;
				case 2:
					funcionario.setCargo(Cargo.OPERADOR_DE_MÁQUINAS);
					funcionario.setSalario(Cargo.OPERADOR_DE_MÁQUINAS);
					System.out.println("O salário deste cargo é de R$" + funcionario.getSalario());
					break;
				case 3:
					funcionario.setCargo(Cargo.OPERADOR_DE_TELEMARKETING);
					funcionario.setSalario(Cargo.OPERADOR_DE_TELEMARKETING);
					System.out.println("O salário deste cargo é de R$" + funcionario.getSalario());
					break;
				case 4:
					funcionario.setCargo(Cargo.KUDOIRISTA);
					funcionario.setSalario(Cargo.KUDOIRISTA);
					System.out.println("O salário deste cargo é de R$" + funcionario.getSalario());
					break;
				case 5:
					funcionario.setCargo(Cargo.PALHAÇO);
					funcionario.setSalario(Cargo.PALHAÇO);
					System.out.println("O salário deste cargo é de R$" + funcionario.getSalario());
					break;
				case 6:
					funcionario.setCargo(Cargo.SONOPLASTA_DO_RATINHO);
					funcionario.setSalario(Cargo.SONOPLASTA_DO_RATINHO);
					System.out.println("O salário deste cargo é de R$" + funcionario.getSalario());
					break;
				case 7:
					funcionario.setCargo(Cargo.VENDEDOR_DE_BOMBAS_ATÔMICAS);
					funcionario.setSalario(Cargo.VENDEDOR_DE_BOMBAS_ATÔMICAS);
					System.out.println("O salário deste cargo é de R$" + funcionario.getSalario());
					break;
				default:
					System.out.println("Digitou errado, burro. Tenta de novo... burro.");
				}

			}
			
			salarios += funcionario.getSalario();
			listaDeFuncionarios.add(funcionario);

		}
		
		for (Funcionarios funcio : listaDeFuncionarios) {
			
			System.out.println(funcio.toString());
		}
		
		System.out.println("A média salarial da empresa é de R$" + salarios / qtde + ".");
		
	}

}

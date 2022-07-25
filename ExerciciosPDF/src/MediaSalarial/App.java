package MediaSalarial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List<Funcionarios> listaDeFuncionarios = new ArrayList<Funcionarios>();
		
		double salarios = 0;

		System.out.println("Sistema de cadastro de funcion�rios e c�lculo de m�dia salarial.");
		System.out.println("Por favor, digite quantos funcion�rios voc� deseja cadastrar:");
		int qtde = entrada.nextInt();

		for (int cadastros = 1; cadastros <= qtde; cadastros++) {
			
			Funcionarios funcionario = new Funcionarios();
			
			System.out.println("Digite o nome do(a) funcion�rio(a): ");
			funcionario.setNome(entrada.next());

			System.out.println("Digite o CPF do(a) funcion�rio(a): ");
			funcionario.setCpf(entrada.next());

			int opcao = 0;
			while (opcao != 1 && opcao != 2) {
				System.out.println("Digite o sexo do(a) funcion�rio(a): ");
				System.out.println("1. MASCULINO | 2. FEMININO");
				opcao = entrada.nextInt();

				if (opcao == 1) {
					funcionario.setSexo(Sexo.MASCULINO);
				} else if (opcao == 2) {
					funcionario.setSexo(Sexo.FEMININO);
				} else {
					System.out.println("Op��o inv�lida. Tente novamente.");
				}
			}
			
			int opcao2 = 0;
			while (opcao2 < 1 || opcao2 > 7) {

				System.out.println("Informe o cargo do(a) funcion�rio(a):");
				System.out.println("1. GERENTE | 2. OPERADOR DE M�QUINAS | 3. OPERADOR DE TELEMARKETING");
				System.out.println(
						"4. KUDOIRISTA | 5. PALHAǇO | 6. SONOPLASTA DO RATINHO | 7. VENDEDOR DE BOMBAS ATԔMICAS");
				
				opcao2 = entrada.nextInt();

				switch (opcao2) {
				case 1:
					funcionario.setCargo(Cargo.GERENTE);
					funcionario.setSalario(Cargo.GERENTE);
					System.out.println("O sal�rio deste cargo � de R$" + funcionario.getSalario());
					break;
				case 2:
					funcionario.setCargo(Cargo.OPERADOR_DE_M�QUINAS);
					funcionario.setSalario(Cargo.OPERADOR_DE_M�QUINAS);
					System.out.println("O sal�rio deste cargo � de R$" + funcionario.getSalario());
					break;
				case 3:
					funcionario.setCargo(Cargo.OPERADOR_DE_TELEMARKETING);
					funcionario.setSalario(Cargo.OPERADOR_DE_TELEMARKETING);
					System.out.println("O sal�rio deste cargo � de R$" + funcionario.getSalario());
					break;
				case 4:
					funcionario.setCargo(Cargo.KUDOIRISTA);
					funcionario.setSalario(Cargo.KUDOIRISTA);
					System.out.println("O sal�rio deste cargo � de R$" + funcionario.getSalario());
					break;
				case 5:
					funcionario.setCargo(Cargo.PALHA�O);
					funcionario.setSalario(Cargo.PALHA�O);
					System.out.println("O sal�rio deste cargo � de R$" + funcionario.getSalario());
					break;
				case 6:
					funcionario.setCargo(Cargo.SONOPLASTA_DO_RATINHO);
					funcionario.setSalario(Cargo.SONOPLASTA_DO_RATINHO);
					System.out.println("O sal�rio deste cargo � de R$" + funcionario.getSalario());
					break;
				case 7:
					funcionario.setCargo(Cargo.VENDEDOR_DE_BOMBAS_AT�MICAS);
					funcionario.setSalario(Cargo.VENDEDOR_DE_BOMBAS_AT�MICAS);
					System.out.println("O sal�rio deste cargo � de R$" + funcionario.getSalario());
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
		
		System.out.println("A m�dia salarial da empresa � de R$" + salarios / qtde + ".");
		
	}

}
